import java.util.Random;
import javax.swing.*;
import java.awt.*;

public class NumberGuessingGame extends JFrame {

    private static final int MAX_NUMBER = 100;
    private int randomNumber;
    private JTextField guessField;
    private JButton guessButton;
    private JLabel resultLabel;

    public NumberGuessingGame() {
        super("Number Guessing Game");

        // Generate a random number between 1 and 100
        randomNumber = new Random().nextInt(MAX_NUMBER) + 1;

        // Create the GUI components
        guessField = new JTextField(10);
        guessButton = new JButton("Guess");
        resultLabel = new JLabel();

        // Add the GUI components to the frame
        add(guessField);
        add(guessButton);
        add(resultLabel);

        // Set the layout of the frame
        setLayout(new FlowLayout());

        // Add an action listener to the guess button
        guessButton.addActionListener(e -> {
            // Get the user's guess
            int guess = Integer.parseInt(guessField.getText());

            // Check if the guess is correct
            if (guess == randomNumber) {
                resultLabel.setText("Congratulations! You guessed the number!");
            } else if (guess < randomNumber) {
                resultLabel.setText("Your guess is too low. Try again.");
            } else {
                resultLabel.setText("Your guess is too high. Try again.");
            }
        });

        // Set the size of the frame
        setSize(300, 100);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new NumberGuessingGame();
    }
}