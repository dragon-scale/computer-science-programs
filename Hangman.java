package hangman;

import java.util.Scanner;
import java.util.Arrays;

public class Hangman
{
    public static void main(String[] args)
    {
        // declaration
        boolean match;
        int selected_random;
        String current_word;
        String[] words;
        char[] exploded_string;
        char[] alphabet;
        char[] blanks;
        int wrong;
        Scanner inputs;
        char inputted_letter;
        
        //assignment
        match = false;
        inputs = new Scanner(System.in);
        inputted_letter = ' ';
        words = new String [5];
        words[0] = "finals";
        words[1] = "space";
        words[2] = "computer";
        words[3] = "random";
        words[4] = "binary";
        selected_random = 0+(int)(Math.random()*((4-0)+1));
        current_word = words[selected_random];
        alphabet = new char[26];
        wrong = 0;
        alphabet = alphabet_maker();
        exploded_string = explode(current_word);
        blanks = new char[exploded_string.length];
        for(int i = 0; i != exploded_string.length; i++)
        {
            blanks[i] = '_';
        }
        
        //game logic
        while (wrong < 7)
        { 
            match = false;
            gallows(wrong);
            System.out.println(alphabet);
            System.out.println(blanks);
            System.out.println("please enter a letter:");
            inputted_letter = inputs.next(".").charAt(0);
            System.out.println(inputted_letter);
            alphabet[((int)(inputted_letter)-(int)('a'))] = '_';
            for (int i = 0; i < exploded_string.length; i++)
            {
                if(exploded_string[i] == inputted_letter)
                {
                    blanks[i] = exploded_string[i];
                    match = true;
                }
            }
            if (match == false)
            {
                wrong++;
            }
            if (Arrays.equals(exploded_string, blanks))
            {
                wrong = 7;
            }
        }
        if (Arrays.equals(exploded_string, blanks))
        {
            System.out.println("YOU WIN");
        } else
        {
            System.out.println("YOU LOSE");
        }
        System.out.println("GAME OVER");
        
    }
    public static char[] explode (String a)
    {
        char[] exploded;
        exploded = a.toCharArray();
        return exploded;
    }
    public static char[] alphabet_maker ()
    {
        char[] alphabet;
        alphabet = new char[26];
        for (int i = 0; i <= 25; i++)
        {
            alphabet[i] = (char)(97 + i);
        }
        return alphabet;
    }
    public static void gallows(int a)
    {
        String[] gallowpossible;
        String currentgallows;
        
        gallowpossible = new String [7];
        gallowpossible[0] = "___________________\n|\n|\n|\n|\n|\n|\n______________\n";
        gallowpossible[1] = "___________________\n|            O\n|\n|\n|\n|\n|\n______________\n";
        gallowpossible[2] = "___________________\n|            O\n|            |\n|            |\n|\n|\n|\n______________\n";
        gallowpossible[3] = "___________________\n|            O\n|           /|\n|            |\n|\n|\n|\n______________\n";
        gallowpossible[4] = "___________________\n|            O\n|           /|\\\n|            |\n|\n|\n|\n______________\n";
        gallowpossible[5] = "___________________\n|            O\n|           /|\\\n|            |\n|           /\n|\n|\n______________\n";
        gallowpossible[6] = "___________________\n|            O\n|           /|\\\n|            |\n|           /\\\n|\n|\n______________\n";
        currentgallows = gallowpossible[a];
        System.out.println(currentgallows);
    }
}
