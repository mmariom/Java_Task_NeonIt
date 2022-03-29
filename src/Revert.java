//        Write a function which, for a given input sentence (string x), returns a sentence where the words are written backwards.
//        Please do not use any advanced string manipulation functions, you can only access individual characters of the string like in
//        an array (for example: x[5] means the 5th character of the string). The main objective of this exercise is to create the algorithm in Java language.
//        Expectation is .java file with compilable and runnable code (Possible usage of parameters and usage of them should be documented – how, that is freestyle by creator)
//        Example of calling the function:
//        revert("The brown dog jumps in the meadows." - > "Eht nworb god spmuj ni eht swodaem."
//        revert(string x) { ... }



import java.util.List;

public class Revert {

    public static void main(String[] args) {

        System.out.println(revert("The brown dog jumps in the meadows"));

    }

    public static String revert(String x){

        //Returns character array
        char[] letters = x.toCharArray();

        int letterIndex = 0;


        //Switching characters position during this loop and updating letterIndex
        for (int i = x.length() - 1; i >= 0 ; i--) {
              letters[letterIndex] = x.charAt(i);
              letterIndex++;
        }


        String reverse = "";
        for (int i = 0; i < x.length(); i++) {
            reverse =  reverse + letters[i];
        }


        // Array of reversed  word characters
        String [] wordsReverse = reverse.split(" ");



        // Reversing the words
        String collectReversed = "" ;
        for (int i = wordsReverse.length -1; i >= 0; i--) {

            collectReversed += wordsReverse[i] + " ";
        }

        return collectReversed;

    }

}


// Time taken 75 minutes