package faithhaintipcalculator;

import java.util.Scanner;

public class FaithHainTipCalculator
{

    public static void main(String[] args)
    {
        //variable declarations
        float bill;
        float tipPercent;
        float gratuity;
        float totalBill;
        int people;
        float perPerson;
        int yesOrNo;
        Scanner input;
        
        //intro and questions
        input = new Scanner(System.in);
        System.out.printf("hello! lets calculate the tip for you real quick. \n");
        System.out.printf("whats the current bill? \n");
        bill = input.nextFloat();
        
        System.out.printf("alright and what is the tip percentage? \n");
        tipPercent = input.nextInt();
        
        //math
        tipPercent = tipPercent / 100;
        gratuity = bill*tipPercent;
        totalBill = bill+gratuity;
        
        //totals and chance to split bill
        System.out.printf("the tip amount and total are \n gratuity: $%.2f \n total bill: $%.2f \n", gratuity, totalBill);
        System.out.printf("are you splitting this bill? \n please input a 1 for yes or 0 for no \n");
        //evaluates the input and determines if bill needs to be split
        yesOrNo = input.nextInt();
        if (yesOrNo == 1)
        {
            //bill split
            System.out.printf("how many people are we splitting with? \n");
            people = input.nextInt();
            perPerson = totalBill/people;
            System.out.printf("The per person cost is \n total: $ %.2f \n", perPerson);
            System.out.printf("have a nice day! \n");
        }
        //when bill is not split
        else
        {
            System.out.printf("have a nice day! \n");
        }
    }
    
}
