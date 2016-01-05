import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Main{
  public static void main(String[] args){
    String layout = "templates/layout.vtl";

    get("/form", (request, response) -> {
      HashMap model = new HashMap();

      model.put("template", "templates/form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/output", (request, response) -> {
      HashMap model = new HashMap();
      String scrabbleWord = request.queryParams("S_word");

      ScrabbleScore scrabbleScore = new ScrabbleScore();
      int sScore = scrabbleScore.scrabbleScoreCounter(scrabbleWord);

      model.put("scrabbleWord", scrabbleWord);
      model.put("sScore", sScore);
      model.put("template", "templates/output.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
