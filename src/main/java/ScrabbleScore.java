public class ScrabbleScore {

  public int scrabbleScoreCounter(String scrabbleWord) {
      int scrabbleScore = 0;
      String scrabbleWordLowerCase = scrabbleWord.toLowerCase();

      String scrabbleValueOne = "aeioulnrst";
      String scrabbleValueTwo = "dg";
      String scrabbleValueThree = "bcmp";
      String scrabbleValueFour = "fhvwy";
      String scrabbleValueFive = "k";
      String scrabbleValueEight = "jx";
      String scrabbleValueTen = "qz";


      for(int i = 0; i < scrabbleWord.length(); i++){

        if(scrabbleValueOne.indexOf(scrabbleWord.charAt(i)) >= 0) {
          scrabbleScore += 1;
        }
        else if(scrabbleValueTwo.indexOf(scrabbleWord.charAt(i)) >= 0) {
          scrabbleScore += 2;
        }
        else if(scrabbleValueThree.indexOf(scrabbleWord.charAt(i)) >= 0) {
          scrabbleScore += 3;
        }
        else if(scrabbleValueFour.indexOf(scrabbleWord.charAt(i)) >= 0) {
          scrabbleScore += 4;
        }
        else if(scrabbleValueFive.indexOf(scrabbleWord.charAt(i)) >= 0) {
          scrabbleScore += 5;
        }
        else if(scrabbleValueEight.indexOf(scrabbleWord.charAt(i)) >= 0) {
          scrabbleScore += 8;
        }
        else if(scrabbleValueTen.indexOf(scrabbleWord.charAt(i)) >= 0) {
          scrabbleScore += 10;
        }
        else{
          scrabbleScore += 0;
        }
      }
      return scrabbleScore;
    }
  }


        // for(int j = 0; j < scrabbleValueOne.length(); j++){
        //   if(scrabbleValueOne.charAt(j) == scrabbleWordLowerCase.charAt(i)){
        //     scrabbleScore += 1;
        //   }
          // if(scrabbleValueTwo.charAt(j) == scrabbleWordLowerCase.charAt(i)){
          //   scrabbleScore += 2;
          // }
          // if(scrabbleValueThree.charAt(j) == scrabbleWordLowerCase.charAt(i)){
          //   scrabbleScore += 3;
          // }
          // if(scrabbleValueFour.charAt(j) == scrabbleWordLowerCase.charAt(i)){
          //   scrabbleScore += 4;
          // }
          // if(scrabbleValueFive.charAt(j) == scrabbleWordLowerCase.charAt(i)){
          //   scrabbleScore += 5;
          // }
          // if(scrabbleValueEight.charAt(j) == scrabbleWordLowerCase.charAt(i)){
          //   scrabbleScore += 8;
          // }
          // if(scrabbleValueTen.charAt(j) == scrabbleWordLowerCase.charAt(i)){
          //   scrabbleScore += 10;
          // }

        // }
        // if(scrabbleWord.charAt(i) == 'a' || scrabbleWord.charAt(i) == 'A'){
        //   scrabbleScore += 1;
        // }
        // else if(scrabbleWord.charAt(i) == 'd' || scrabbleWord.charAt(i) == 'D'){
        //   scrabbleScore += 2;
        // }
        // else if(scrabbleWord.charAt(i) == 'c' || scrabbleWord.charAt(i) == 'C'){
        //   scrabbleScore += 3;
        // }
        // else if(scrabbleWord.charAt(i) == 'y' || scrabbleWord.charAt(i) == 'Y'){
        //   scrabbleScore += 4;
        // }
        // else if(scrabbleWord.charAt(i) == 'k' || scrabbleWord.charAt(i) == 'K'){
        //   scrabbleScore += 5;
        // }
        // else if(scrabbleWord.charAt(i) == 'j' || scrabbleWord.charAt(i) == 'J'){
        //   scrabbleScore += 8;
        // }
        // else if(scrabbleWord.charAt(i) == 'z' || scrabbleWord.charAt(i) == 'Z'){
        //   scrabbleScore += 10;
        // }
        // else {
        //   scrabbleScore += 0;
        // }
//       }
//
//   }
// }
