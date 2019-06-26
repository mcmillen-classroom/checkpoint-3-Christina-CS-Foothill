package christinahunter.myapplication;

import java.util.Scanner;

public class TrueFalseQuestion extends Question {

    private boolean mTFAnswer;
    private String[] mFillAnswer;

    public TrueFalseQuestion(String mText, boolean ans) {

        super(mText);
        mTFAnswer = ans;

    }

    public boolean getTFAnswer()
    {
        return mTFAnswer;
    }

    public void setTFAnswer(boolean TFAnswer)
    {
        mTFAnswer = TFAnswer;

    }

    //check the user inputs against the answer
    //returns whether the user answered the question correctly
    @Override
    public boolean checkAnswer(boolean userAns){

        return (mTFAnswer == userAns);
    }

    public String[] getFillAnswers()
    {
        return mFillAnswer;
    }

    @Override
    public boolean readInputAndCheckAnswer(Scanner input){
        System.out.print("Enter t/f: ");
        String in = input.nextLine();
        boolean boolResponse;

        if(in.equals("t"))
            boolResponse = true;
        else
            boolResponse = false;

        return (boolResponse == mTFAnswer);
    }

}
