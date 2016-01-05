import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleScoreTest{
  @Test
  public void scrabbleScoreCounter_returnAScrabbleScoreForLetterA_1(){
    ScrabbleScore scrabbleScore = new ScrabbleScore();
    int score = 1;
    assertEquals(score, scrabbleScore.scrabbleScoreCounter("a"));
  }

  @Test
  public void scrabbleScoreCounter_returnAScrabbleScoreForLetterD_2(){
    ScrabbleScore scrabbleScore = new ScrabbleScore();
    int score = 2;
    assertEquals(score, scrabbleScore.scrabbleScoreCounter("d"));
  }
}
//   @Test
//   public void scrabbleScoreCounter_return
// }
