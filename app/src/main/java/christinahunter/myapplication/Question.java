package christinahunter.myapplication;

import java.util.Scanner;

public class Question
{
    private String mText;
    // 0 = read in boolean, 1 = read in string, 2 = read in number
    private int mAnswerType;

    public Question(String mText) {
        this.mText = mText;
    }

    public int getAnswerType()
    {
        return mAnswerType;
    }

    public String getText()
    {
        return mText;
    }

    public void setText(String text)
    {
        mText = text;
    }

    //stub method - intentionally does nothing
    public boolean checkAnswer(boolean ans){
        return false;
    }

    //stub method - intentionally does nothing
    public boolean checkAnswer(String ans){
        return false;
    }

    //stub method - intentionally does nothing
    public boolean readInputAndCheckAnswer(Scanner input) {
        return false;
    }
}