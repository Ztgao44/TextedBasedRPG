import java.util.Scanner;
import java.util.Random;

public class TextBasedRPG {
    public static Scanner scan = new Scanner(System.in);
    public static Random random = new Random();
    //determines the amount of items you can carry
    public static int maxItems = 5;
    //this is your actual inventory
    public static String[] inventory = new String[maxItems];




    public static void main(String[] args)
    {
        System.out.println("Welcome to our RPG game!");
        System.out.println("Press ENTER to begin...");
        scan.nextLine();
        intro();
    }

    public static void intro()
    {
        typewriter("Our story begins here...");
        typewriter()
        typewriter("You have been in a relationship with your boyfriend for 3 years, but lately, things have changed.");
        typewriter(text:"Alan,Ava,Sara,Kenzy, are our characters for our story")
        typewriter("After a date where he seemed distant and practically ignored you, you decide to investigate.");
        typewriter("You check his social media and take note of the women he's following...");
        typewriter("Feeling suspicious, you gather your homegirls for a deep dive into his social media activity.");
        typewriter("Together, you head to a function, where you mirror your phone to the TV and begin your investigation...");
        typewriter("After some discussion, your group comes up with four different conclusions.");

        makeDecision();
        public static void firstChoice(){
            system.out.print.
    }
    }

    //5. it should end with a choice/decision

    }

    public static void typewriter(String text) {
        int i;
        for (i = 0; i < text.length(); i++) {
            System.out.printf("%c", text.charAt(i));
            try {
                Thread.sleep(75);//0.5s pause between characters
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("");
    }
