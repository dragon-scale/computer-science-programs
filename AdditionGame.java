package faithhainadditiongame;

import javax.swing.JOptionPane;

public class FaithHainAdditionGame
{

    public static void main(String[] args)
    {
        //variable declaration
        int number_one;
        int number_two;
        int correct_answer;
        int inputed_answer;
        int rounds_wanted;
        int rounds_played;
        int rounds_won;
        String dialog_input;

        //initalize variables such as rounds_played and rounds_won
        rounds_played = 0;
        rounds_won = 0;

        //prompt the user to enter how many games they want to play
        dialog_input = JOptionPane.showInputDialog("welcome to the addition game!\nhow many rounds would you like to play?");
        rounds_wanted = Integer.parseInt(dialog_input);
        for (int i = 1; i != rounds_wanted; i++)
        {
            number_one = (int) (Math.random() * 41 + 10);
            number_two = (int) (Math.random() * 41 + 10);
            correct_answer = number_one + number_two;
            dialog_input = JOptionPane.showInputDialog("what is\n  " + number_one + "\n+" + number_two);
            inputed_answer = Integer.parseInt(dialog_input);
            rounds_played++;
            if (inputed_answer == correct_answer)
            {
                rounds_won++;
                JOptionPane.showMessageDialog(null, "that is correct. \nyour score is: " + rounds_won + "/" + rounds_played);
            } else
            {
                JOptionPane.showMessageDialog(null, "that is incorrect\nthe correct answer is:" + correct_answer + "\nyour current score is:" + rounds_won + "/" + rounds_played);
            }

        }
        JOptionPane.showMessageDialog(null, "thanks for playing!\n Final score:" + rounds_won + "/" + rounds_played);
    }

}
