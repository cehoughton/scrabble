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

  @Test
  public void scrabbleScoreCounter_returnAScrabbleScoreForLetterC_3(){
    ScrabbleScore scrabbleScore = new ScrabbleScore();
    int score = 3;
    assertEquals(score, scrabbleScore.scrabbleScoreCounter("c"));
  }
  @Test
  public void scrabbleScoreCounter_returnAScrabbleScoreForLetterY_4(){
    ScrabbleScore scrabbleScore = new ScrabbleScore();
    int score = 4;
    assertEquals(score, scrabbleScore.scrabbleScoreCounter("y"));
  }
  @Test
  public void scrabbleScoreCounter_returnAScrabbleScoreForLetterK_5(){
    ScrabbleScore scrabbleScore = new ScrabbleScore();
    int score = 5;
    assertEquals(score, scrabbleScore.scrabbleScoreCounter("k"));
  }
  @Test
  public void scrabbleScoreCounter_returnAScrabbleScoreForLetterJ_8(){
    ScrabbleScore scrabbleScore = new ScrabbleScore();
    int score = 8;
    assertEquals(score, scrabbleScore.scrabbleScoreCounter("j"));
  }
  @Test
  public void scrabbleScoreCounter_returnAScrabbleScoreForLetterZ_8(){
    ScrabbleScore scrabbleScore = new ScrabbleScore();
    int score = 10;
    assertEquals(score, scrabbleScore.scrabbleScoreCounter("z"));
  }
}
//   @Test
//   public void scrabbleScoreCounter_return
// }
