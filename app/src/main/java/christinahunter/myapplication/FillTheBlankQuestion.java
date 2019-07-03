package christinahunter.myapplication;

import java.util.Scanner;

public class FillTheBlankQuestion extends Question {
    private String[] mFillAnswer;

    public FillTheBlankQuestion(String text, String... ans) {
        super(text);
        mFillAnswer = ans;
    }

    public String[] getFillAnswers()
    {
        return mFillAnswer;
    }

    @Override
    public boolean checkAnswer(String userAns){

        for (String ans : getFillAnswers())
        {
            if (ans.equalsIgnoreCase(userAns))
                return true;
        }
        return false;
    }

    @Override
    public boolean readInputAndCheckAnswer(Scanner input){

        System.out.print("Enter response here: ");
        String in = input.nextLine();
        return checkAnswer(in);
    }
}
