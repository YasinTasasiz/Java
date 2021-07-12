import java.util.Scanner;
import java.util.*;
public class hangman {

    public static void main(String[] args) {
        // write your code here
        Scanner sc= new Scanner(System.in);
        while (true) {
            Random random = new Random();

            String[] randomWords = {"pen", "table", "phone", "chair", "book"};
            int ran = random.nextInt(7);
            String word = randomWords[ran];

            int charLen = randomWords[ran].length();
            String[] randomWordsIt = new String[charLen];

            System.out.println("H A N G M A N");
            System.out.println("+---+");
            System.out.println("  | ");
            System.out.println("  | ");
            System.out.println("  | ");
            System.out.println("  | ");
            System.out.println(" === ");


            for (int j = 0; j < charLen; j++) {
                randomWordsIt[j] = "_";
            }

            String notChar = "";


            while (Arrays.asList(randomWordsIt).contains("_")) {
                char charr;
                while (true) {
                    System.out.println("Guess a letter : ");
                    charr = sc.next().charAt(0);


                    if (!notChar.contains(String.valueOf(String.valueOf(charr))) && !Arrays.asList(randomWordsIt).contains(String.valueOf(charr))) {
                        break;
                    }
                    System.out.println("You have already guessed that letter. Choose again.\n");
                }

                int k = 0;
                boolean flg = true;

                for (String c : word.split("")) {
                    if (c.contains(String.valueOf(charr))) {
                        randomWordsIt[k] = c;
                        flg = false;
                    }
                    k++;
                }

                if (flg) {
                    notChar += "" + charr;
                }

                System.out.println("Missed letters: " + notChar);
                System.out.println(Arrays.toString(randomWordsIt).replace(",", ""));


                if (notChar.length() == 0) {
                    System.out.println("+---+");
                    System.out.println("  |");
                    System.out.println("  |");
                    System.out.println("  |");
                    System.out.println("  |");
                    System.out.println(" ===");
                } else if (notChar.length() == 1) {
                    System.out.println("+---+");
                    System.out.println("o |");
                    System.out.println("  |");
                    System.out.println("  |");
                    System.out.println("  |");
                    System.out.println(" ===");
                } else if (notChar.length() == 2) {
                    System.out.println("+---+");
                    System.out.println("o |");
                    System.out.println("| |");
                    System.out.println("  |");
                    System.out.println("  |");
                    System.out.println(" ===");
                } else if (notChar.length() == 3) {
                    System.out.println("+---+");
                    System.out.println("o |");
                    System.out.println("| |");
                    System.out.println("| |");
                    System.out.println("  |");
                    System.out.println(" ===");
                } else if (notChar.length() == 4) {
                    System.out.println("+---+");
                    System.out.println("o |");
                    System.out.println("| |");
                    System.out.println("| |");
                    System.out.println("| |");
                    System.out.println(" ===");

                    System.out.println("GAME OVER! The word was " + word);
                    break;
                }

            }

            if(!Arrays.asList(randomWordsIt).contains("_")){
                System.out.println("Yes! The secret word is "+ word +"! You have won!");
            }


            System.out.println("Do you want to play again? (press y for yes or n for no)");
            if(sc.next().charAt(0)=='n'){
                sc.close();
                break;
            }
        }

    }

}
