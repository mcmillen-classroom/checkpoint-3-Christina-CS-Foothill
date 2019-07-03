package christinahunter.myapplication;

import java.util.Scanner;

public class QuizOOPMain
{
    // this is where the app starts
    public static void main(String[] args)
    {
        Question[] questions = new Question[5];
        questions[0] = new TrueFalseQuestion("Laney is better than BCC?", true);
        questions[1] = new TrueFalseQuestion("Java is an easy to understand language?", false);
        questions[2] = new FillTheBlankQuestion("Which season will the F building be open?", "fall", "Fall 2019", "Maybe never");
        questions[3] = new MultipleChoiceQuestion("What is the square root of 576?", new String[]{"32","24","12","27"},'b');
        questions[4] = new MultipleChoiceQuestion("What is the branch of science concerned with" +
                " fossil animals and plants?", new String[]{"Astronomy","Geology","Paleontology","Herpetology"},'c');


        int index = 0;
        int score = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the quiz! Good luck!");

        // 2 < 2 is false
        while (index < questions.length)
        {
            System.out.println(questions[index].getText());
            if(questions[index].readInputAndCheckAnswer(input))
                System.out.println("You are correct!");
            else
                System.out.println("You are incorrect.");
            index++;
        }

    }
}
