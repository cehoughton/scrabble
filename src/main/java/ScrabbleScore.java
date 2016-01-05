public class ScrabbleScore {

  public int scrabbleScoreCounter(String scrabbleWord) {
      int scrabbleScore = 0;

      for(int i = 0; i < scrabbleWord.length(); i++){
        if(scrabbleWord.charAt(i) == 'a' || scrabbleWord.charAt(i) == 'A'){
          scrabbleScore += 1;
        }
        else {
          scrabbleWord += 0;
        }
      }
      return scrabbleScore;
  }
}
