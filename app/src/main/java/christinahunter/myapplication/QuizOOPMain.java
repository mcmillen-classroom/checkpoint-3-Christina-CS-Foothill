package christinahunter.myapplication;

import java.util.Scanner;

public class QuizOOPMain
{
    // this is where the app starts
    public static void main(String[] args)
    {
        Question[] questions = new Question[3];
        questions[0] = new TrueFalseQuestion("Laney is better than BCC?", true);
        questions[1] = new TrueFalseQuestion("Java is an easy to understand language?", false);
        questions[2] = new Question("Which season will the F building be open?", "fall", "Fall 2019", "Maybe never");

        int index = 0;
        int score = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the quiz! Good luck!");

        // 2 < 2 is false
        while (index < questions.length)
        {
            System.out.println(questions[index].getText());

            // If i should read a boolean
            if (questions[index].getAnswerType() == 0)
            {
                System.out.print("Enter t/f: ");
                String in = input.nextLine();
                boolean boolResponse;

                if(in.equals("t"))
                    boolResponse = true;
                else
                    boolResponse = false;

                if (questions[index].checkAnswer(boolResponse))
                    System.out.println("You are correct!");
                else
                    System.out.println("You are incorrect!");

            }
            else if (questions[index].getAnswerType() == 1)
            {
                System.out.print("Enter the blank: ");
                String response = input.nextLine();

                if(questions[index].checkAnswer(response))
                    System.out.println("You are correct!");
                else
                    System.out.println("You are incorrect!");
            }

            index++;
        }
    }
}
