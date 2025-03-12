package GUI;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

class Gui{
    public static void main(String[] args)
    {
        //Array of animal facts
        String[] animalFacts = {
                "Adult elephants are unable to jump.",
                "Giraffes have no vocal chords.",
                "Walruses can sleep in water.",
                "Cows have best friends.",
                "Octopuses have three hearts.",
                "Starfish can regenerate their arms.",
                "A village of wolves.",
                "Crocodiles can gallop.",
                "Elephants can recognize themselves in mirrors.",
                "Kangaroos can't fart."
        };
        JFrame window = new JFrame();
        window.setSize(600, 500);
        window.setTitle("Philadelphia Zoo Animal Facts");
        window.getContentPane().setBackground(Color.LIGHT_GRAY);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel();
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        ImageIcon logo = new ImageIcon("resources/Philly zoo.jpg");
        label.setIcon(logo);

        //Randomly gives u a fact
        Random rand = new Random();
        int randomIndex = rand.nextInt(animalFacts.length);
        String selectedFact = animalFacts[randomIndex];
        label.setText("<html><center>" + selectedFact + "</center></html>");
        label.setFont(new Font("Arial", Font.PLAIN, 18));
        window.add(label);
        window.setVisible(true);
    }
}
