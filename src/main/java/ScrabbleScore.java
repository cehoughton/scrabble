public class ScrabbleScore {

  public int scrabbleScoreCounter(String scrabbleWord) {
      int scrabbleScore = 0;

      for(int i = 0; i < scrabbleWord.length(); i++){
        if(scrabbleWord.charAt(i) == 'a' || scrabbleWord.charAt(i) == 'A'){
          scrabbleScore += 1;
        }
        else if(scrabbleWord.charAt(i) == 'd' || scrabbleWord.charAt(i) == 'D'){
          scrabbleScore += 2;
        }
        else if(scrabbleWord.charAt(i) == 'c' || scrabbleWord.charAt(i) == 'C'){
          scrabbleScore += 3;
        }
        else {
          scrabbleScore += 0;
        }
      }
      return scrabbleScore;
  }
}
