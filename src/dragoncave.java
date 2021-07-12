import java.util.Scanner;

public class dragoncave {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("You are in a land full of dragons. In front of you,\n" +
                "\n" +
                "you see two caves. In one cave, the dragon is friendly\n" +
                "\n" +
                "and will share his treasure with you. The other dragon\n" +
                "\n" +
                "is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? (1 or 2)");
        int caveNum=scan.nextInt();


        if(caveNum==1){
            System.out.println("You approach the cave...\n" +
                    "It is dark and spooky...\n" +
                    "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                    "Gobbles you down in one bite!");
        }else if(caveNum==2){
            System.out.println("You approach the cave...\n" +
                    "It is dark and spooky...\n"+
                    "A large dragon jumps out in front of you! the dragon looks friendly and...\n" +
                    "Offering the treasure to you!");
        }else {
            System.out.println("Wrong cave!!!");
        }

    }
}