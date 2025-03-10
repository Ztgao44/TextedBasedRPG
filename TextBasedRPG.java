import java.util.Scanner;
import java.util.Random;

public class TextBasedRPG {
    public static Scanner scan = new Scanner(System.in);
    public static Random random = new Random();
    public static int maxItems = 6;
    public static String[] inventory = new String[maxItems];
    public static int gems = 50; // Starting gems
    public static String playerName;

    public static void main(String[] args) {
        System.out.println("Welcome to our RPG game!");
        System.out.println("Press ENTER to begin...");
        scan.nextLine(); // This ensures the game waits for ENTER key input to begin
        intro();
    }

    public static void intro() {
        typewriter("Love isn’t just about romance—it’s about trust. And trust? It’s fragile.");
        typewriter("You live in a world where relationships are broadcasted on social media, where a simple 'goodnight' text can mean everything—or nothing.");
        typewriter("To the outside world, your relationship with Alan has been goals for three years. But lately? Something is wrong.");
        typewriter("It started small—shorter replies, canceled dates. Then it got worse. He avoids eye contact, laughs at his phone when you’re next to him, and the gut feeling won’t go away.");
        typewriter("Maybe you’re paranoid. Maybe you’re overthinking. Or maybe… you’re finally seeing the truth.");
        typewriter("________________________________________");
        typewriter("WHO ARE YOU?");
        typewriter("You are a college student balancing classes, friendships, and your three-year relationship with Alan. You’re loyal, loving, and willing to fight for what’s yours.");
        typewriter("But tonight? You’re done pretending everything’s fine.");
        typewriter("________________________________________");
        System.out.print("Enter your name: ");
        playerName = scan.nextLine();
        inventory[0] = "Suspicious Typing Delay Screenshot";
        inventory[1] = "Suspicious IG Story Screenshot";
        inventory[2] = "Sara’s Weirdly Timed Text";
        typewriter("Welcome, " + playerName + "! Your quest begins now...");
        typewriter("You invite your closest friends over for a casual 'game night'—but the real plan? Investigate Alan.");
        typewriter("Your squad:");
        typewriter("• Ryan (Your ride-or-die bestie. He’s sharp, sassy, and doesn’t trust Alan at ALL.)");
        typewriter("• Ava (The suspicious one. She lives for drama and is convinced Alan is guilty.)");
        typewriter("• Kenzy (The logical one. She thinks you should just talk to Alan.)");
        typewriter("• Sara (Your longtime best friend. She’s been acting a little off lately, but you assume it’s stress.)");
        typewriter("With everyone gathered, you mirror your phone to the TV, open Alan’s following list, and start digging.");
        typewriter("Immediately, you notice something weird.");
        typewriter("Alan has been following a lot of new girls. Some private, some public. Some liking his posts. Some liking his posts before YOU even see them.");
        typewriter("The room falls silent. Your stomach twists.");
        choicePhase();
    }

    private static void typewriter(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
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
        scan.nextLine();
        handleChoice(choice);
    }

    public static void handleChoice(int choice) {
        switch (choice) {
            case 1:
                gems -= 10;
                typewriter("You decided to text Alan immediately, dropping the screenshots and demanding an explanation.");
                System.out.println("•\tAlan: “Babe, wtf is this? You’re acting crazy.”");
                System.out.println("•\tAlan: “You’re literally spying on me?? Wow.”");
                System.out.println("•\tAlan: “I can’t believe this. I thought you trusted me.”");
                System.out.println("•\tRyan SNATCHES your phone. “Not the ‘you’re crazy’ gaslight special. ”");
                System.out.print("•\tAva is yelling. “Ask him why they’re liking his posts FIRST.”");
                System.out.println("•\tKenzy sighs. “If you come in hot, he’s just gonna lie. You should’ve eased into it.”");
                System.out.println("•\tSara is quiet. (Suspiciously quiet.)");
                System.out.println("Inventory Update: Screenshots (Alan’s Following List) added.\n" +
                        "Inventory Update: Alan’s Gaslighting Texts added.\n");
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
            case 6:
                gems -= 10;
                typewriter("Keep texting him. Hit him with facts. Don’t let him weasel out.");
                aftermathPhase();
            case 7:
                gems -= 20;
                typewriter("Block him. Let him PANIC.");
                aftermathPhase();
            case 8:
                gems -= 15;
                typewriter("Okay, explain it to me.See if he trips up.");
                System.out.println("•\tYou say, “You were acting weird earlier. Everything okay?”");
                System.out.println("•\tAlan takes a whole minute to type. Then: “Weird? Idk what you’re talking about lol.”");
                System.out.println("•\tRyan GROANS. “Wow. Lying in 4K.”");
                System.out.println("•\tAva yells, “SCREENSHOT HIS TYPING! WHY DID IT TAKE SO LONG?!”");
                System.out.println("•\tKenzy whispers, “If he’s guilty, he’ll over-explain. Watch.”");
                System.out.println("•\tSara fidgets. “Maybe he just doesn’t know what to say…”");
                System.out.println("Inventory Update: Screenshot – Alan’s Suspicious Typing Delay added.");
                aftermathPhase();
            case 9:
                gems -= 5;
                typewriter("Just drop it. (…Why does she keep suggesting this?)");
                aftermathPhase();
            case 10:
                gems -= 15;
                typewriter("Pretend to drop it. Then, ask to see his phone.");
                aftermathPhase();
            case 11:
                gems -= 20;
                typewriter("Send:It’s okay, I already know. See how he reacts.");
                System.out.println("•\tYou don’t text. You don’t call. Nothing.");
                System.out.println("•\tAlan doesn’t text first. But suddenly, he posts an Instagram story.");
                System.out.println("•\tIt’s a blurry plate of food. There’s a girl’s hand in the corner.");
                System.out.println("•\tNO TAG. NO CONTEXT.");
                System.out.println("•\tAva SCREAMS. “OH. MY. GOD.”");
                System.out.println("•\tRyan stands up. “He’s trying to bait you. I told you to ignore him longer.”");
                System.out.println("•\tKenzy exhales. “If you confront him, he’ll say it’s his sister or something.”");
                System.out.println("•\tSara grips her phone. (Why does she look nervous??)");
                System.out.println("Inventory Update: Suspicious IG Story Screenshot added.");
                aftermathPhase();
            case 12:
                gems -= 10;
                typewriter("Let him keep talking. The more he types, the worse it gets.");
                aftermathPhase();
            case 13:
                gems -= 5;
                typewriter("“Never mind, it’s nothing.” (…Why is she acting weird?)");
                aftermathPhase();
            case 14:
                gems -= 15;
                typewriter("Post a fire selfie. Let him wonder.");
                aftermathPhase();
            case 15:
                gems -= 20;
                typewriter("DM the girl in the pic. Let’s go straight to the source.");
                aftermathPhase();
            case 16:
                gems -= 10;
                typewriter("Wait. If it’s bait, don’t bite.");
                aftermathPhase();
            case 17:
                gems -= 5;
                typewriter("Text Alan “I miss you.” (…Wait. Why does Sara look guilty???)");
                System.out.println("•\tAlan suddenly sends: “Goodnight baby”");
                System.out.println("•\tRyan speaks first. “…Why is he suddenly being cute?”");
                System.out.println("•\tAva gasps. “It’s GUILT.”");
                System.out.println("•\tKenzy squints. “Or he’s love-bombing you.”");
                System.out.println("•\tSara smiles. “See? You were overthinking.”");
                System.out.println("•\tRyan SIDE-EYES her. “Were they, though?”");
                System.out.println("Inventory Update: Sara’s Weirdly Timed Text added.");
                aftermathPhase();
            case 18:
                gems -= 15;
                typewriter("•\tAva’s Plan – Ignore his text. Make him wonder.");
                aftermathPhase();
            case 19:
                gems -= 20;
                typewriter("•\tRyan’s Plan (20 Gems) – Spy on his socials. Who’s active when he is?");
                aftermathPhase();
            case 20:
                gems -= 10;
                typewriter("•\tKenzy’s Plan– Text back something vague. Like, “I know what you did.”");
                aftermathPhase();
            case 21:
                gems -= 5;
                typewriter("•\tSara’s Plan (5 Gems) – Say 'Goodnight, love you too'. (…Why does Sara keep defending him?)");
                aftermathPhase();
        }
        typewriter("You now have " + gems + " gems left.");
        checkGameOver();
    }

    public static void checkGameOver() {
        if (gems <= 0) {
            typewriter("You’ve run out of gems and can’t keep fighting. Alan has successfully gaslit you.");
            gameOver();
        }
    }

    public static void aftermathPhase() {
        typewriter("Your friends are watching. Every move counts.");
        typewriter("Ava: 'Don’t let him weasel out. Keep hitting him with the facts!'");
        typewriter("Ryan: 'Block him. Let him sweat. It’ll make him panic!'");

        typewriter("What will you do now?");
        typewriter("1. Ava’s Plan – Keep texting him. Hit him with facts. Don’t let him weasel out. (Cost: 10 gems)");
        typewriter("2. Ryan’s Plan – Block him. Let him PANIC. (Cost: 20 gems)");
        typewriter("3. Kenzy’s Plan – Say, 'Okay, explain it to me.' See if he trips up. (Cost: 15 gems)");
        typewriter("4. Sara’s Plan – Just drop it. (…Why does she keep suggesting this?) (Cost: 5 gems)");

        System.out.print("Enter the number of your choice: ");
        int choice = scan.nextInt();
        scan.nextLine();
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
                break;
            case 3:
                gems -= 15;
                typewriter("You ask him to explain himself. He hesitates and you catch him in a lie.");
                break;
            case 4:
                gems -= 5;
                typewriter("You decide to drop it and move on, though your gut tells you something is still off.");
                break;
            default:
                typewriter("Invalid choice. Please choose again.");
                aftermathPhase();
                return;
        }
    }

    public static void useItem() {
        System.out.println("Your inventory:");
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null) {
                System.out.println((i + 1) + ". " + inventory[i]);
            }
        }
        System.out.print("Choose an item to use by number: ");
        int itemChoice = scan.nextInt();
        scan.nextLine();
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

    public static void randomEvent() {
        int chance = random.nextInt(2); // 50% chance for a random event to happen
        if (chance == 0) {
            typewriter("You feel a gut feeling about one of Alan's new followers. You decide to investigate them further.");
            // Adds randomness based on investigation done
            typewriter("You find her number... Do you call her?");
            int callChance = random.nextInt(2);
            if (callChance == 0) {
                typewriter("The phone rings but no one picks up. It seems like a dead end.");
            } else {
                typewriter("She picks up the phone, sounding evasive and nervous. She hangs up quickly.");
                gems += 10; // gain 10 gems for a successful call
            }
            typewriter("You decide to let go of the feeling, hoping it’s just a phase.");
        }
    }

    // Game over condition
    public static void gameOver() {
        typewriter("The game is over. Would you like to try again?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();
        scan.nextLine();
        if (choice == 1) {
            gems = 50;
        }
    }
}
