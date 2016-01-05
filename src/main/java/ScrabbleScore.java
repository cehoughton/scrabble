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
        else if(scrabbleWord.charAt(i) == 'y' || scrabbleWord.charAt(i) == 'Y'){
          scrabbleScore += 4;
        }
        else if(scrabbleWord.charAt(i) == 'k' || scrabbleWord.charAt(i) == 'K'){
          scrabbleScore += 5;
        }
        else if(scrabbleWord.charAt(i) == 'j' || scrabbleWord.charAt(i) == 'J'){
          scrabbleScore += 8;
        }
        else if(scrabbleWord.charAt(i) == 'z' || scrabbleWord.charAt(i) == 'Z'){
          scrabbleScore += 10;
        }
        else {
          scrabbleScore += 0;
        }
      }
      return scrabbleScore;
  }
}
