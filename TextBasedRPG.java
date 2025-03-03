import java.util.Scanner;
import java.util.Random;

public class TextBasedRPG {
    public static Scanner scan = new Scanner(System.in);
    public static Random random = new Random();
    public static int maxItems = 6;
    public static String[] inventory = new String[maxItems];
    public static int gems = 50; // Starting gems
    public static String playerName; // The player's name
    public static void main(String[] args) {
        System.out.println("Welcome to our RPG game!");
        System.out.println("Press ENTER to begin...");
        scan.nextLine();
        intro();
    }

    public static void intro() {
        typewriter("Love isn’t just about romance—it’s about trust. And trust? It’s fragile.");
        typewriter("You live in a world where relationships are broadcasted on social media, where a simple 'goodnight' text can mean everything—or nothing.");
        typewriter("To the outside world, your relationship with Alan has been goals for three years. But lately? Something is wrong.");
        typewriter("It started small—shorter replies, canceled dates. Then it got worse. He avoids eye contact, laughs at his phone when you’re next to him, and the gut feeling won’t go away.");
        typewriter("Maybe you’re paranoid. Maybe you’re overthinking. Or maybe… you’re finally seeing the truth.");

        // Asks for the player's name
        System.out.print("Enter your name: ");
        inventory[0] = "Suspicious Typing Delay Screenshot";
        inventory[1] = "Suspicious IG Story Screenshot";
        inventory[2] = "Sara’s Weirdly Timed Text";
        playerName = scan.nextLine();
        typewriter("Welcome, " + playerName + "! Your quest begins now...");
        typewriter("You are a college student balancing classes, friendships, and your three-year relationship with Alan.");
        typewriter("Tonight, you’re done pretending everything’s fine. You invite your closest friends over for a casual 'game night'—but the real plan? Investigate Alan.");
        typewriter("Your squad consists of:");
        typewriter("Ryan – Your ride-or-die bestie. He’s sharp, sassy, and doesn’t trust Alan at ALL.");
        typewriter("Ava – The suspicious one. She lives for drama and is convinced Alan is guilty.");
        typewriter("Kenzy – The logical one. She thinks you should just talk to Alan.");
        typewriter("Sara – Your longtime best friend. She’s been acting a little off lately, but you assume it’s stress of classes getting to her.");
        typewriter("With everyone gathered, you mirror your phone to the TV, open Alan’s following list, and start digging.");
        typewriter("Immediately, you notice something weird. Alan has been following a lot of new girls. Some private, some public. Some liking his posts. Some liking his posts before YOU even see them.");
        typewriter("The room falls dead silent. Your stomach twists.");
        choicePhase();
    }

    public static void choicePhase() {
        typewriter("What will you do?");
        typewriter("1. Ava’s Advice – 'TEXT HIM NOW. Drop the screenshots, no warning. Make him explain himself!' (Cost: 10 gems)");
        typewriter("2. Kenzy’s Advice – 'Just ask him casually why he was acting weird on the date. Maybe there’s a simple answer?' (Cost: 15 gems)");
        typewriter("3. Ryan’s Advice – 'Ignore him. Stop texting. Act unbothered. If he cares, he’ll come crawling back to you in no time girl.' (Cost: 25 gems)");
        typewriter("4. Sara’s Advice – 'You’re overthinking this. Just let it go. If he’s hiding something, it’ll come out eventually.' (Cost: 5 gems)");
        typewriter("5. Use an Item from your Inventory");
        System.out.print("Enter the number of your choice: ");
        int choice = scan.nextInt();
        handleChoice(choice);
    }
    public static void handleChoice(int choice) {
        switch (choice) {
            case 1:
                gems -= 10;
                typewriter("You decided to text Alan immediately, dropping the screenshots and demanding an explanation.");
                aftermathPhase();
                break;
            case 2:
                gems -= 15;
                typewriter("You casually ask Alan why he's been acting weird on the date.");
                aftermathPhase();
                break;
            case 3:
                gems -= 25;
                typewriter("You ignore Alan, deciding to act unbothered and wait for him to come crawling.");
                aftermathPhase();
                break;
            case 4:
                gems -= 5;
                typewriter("You decide to let it go, trusting that if Alan is hiding something, it will come out eventually.");
                aftermathPhase();
                break;
            case 5:
                useItem();
                break;
            default:
                typewriter("Invalid choice. Please choose again.");
                choicePhase();
                return;
        }
        typewriter("You now have " + gems + " gems left.");
    }
    public static void aftermathPhase() {
        typewriter("Your friends are watching. Every move counts.");
        typewriter("Ava: 'Don’t let him weasel out. Keep hitting him with the facts!'");
        typewriter("Ryan: 'Block him. Let him sweat. It’ll make him panic!'");

        typewriter("What will you do now?");
        typewriter("1. Ava’s Plan – Keep texting him. Hit him with facts. Don’t let him weasel out. (Cost: 10 gems)");
        typewriter("2. Ryan’s Plan – Block him. Let him PANIC. (Cost: 20 gems)");

        System.out.print("Enter the number of your choice: ");
        int choice = scan.nextInt();
        handleAftermathChoice(choice);
    }
    public static void handleAftermathChoice(int choice) {
        switch (choice) {
            case 1:
                gems -= 10;
                typewriter("You keep texting Alan, bombarding him with more questions. He starts to crack under the pressure.");
                break;
            case 2:
                gems -= 20;
                typewriter("You block Alan and wait. Minutes feel like hours as you watch him panic, texting you from a different number.");
                // Add more choices
                break;
            default:
                typewriter("Invalid choice. Please choose again.");
                aftermathPhase();
                return;
        }
        typewriter("You now have " + gems + " gems left.");
    }


    public static void useItem() {
        System.out.println("Your inventory:");
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null) {
                System.out.println((i + 1) + ". " + inventory[i]);
            }
        }
        System.out.print("Choose an item to use by number, from 1 to 3: ");
        int itemChoice = scan.nextInt();
        if (itemChoice > 0 && itemChoice <= inventory.length && inventory[itemChoice - 1] != null) {
            String item = inventory[itemChoice - 1];
            switch (item) {
                case "Suspicious Typing Delay Screenshot":
                    gems -= 10;
                    typewriter("You reveal a screenshot of Alan’s suspicious typing delay. This could be important.");
                    break;
                case "Suspicious IG Story Screenshot":
                    gems -= 10;
                    typewriter("You reveal a screenshot of Alan’s suspicious Instagram story. Something doesn’t add up.");
                    break;
                case "Sara’s Weirdly Timed Text":
                    gems -= 5;
                    typewriter("You examine Sara's oddly-timed text to Alan. It's strange, but you decide to keep it in mind.");
                    break;
                default:
                    typewriter("This item cannot be applied right now.");
                    break;
            }
            inventory[itemChoice - 1] = null; // Use up the item
        } else {
            typewriter("Invalid item choice. Please choose again.");
            useItem();
        }
    }

    public static void typewriter(String text) {
        int i;
        for (i = 0; i < text.length(); i++) {
            System.out.printf("%c", text.charAt(i));
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("");
    }
}