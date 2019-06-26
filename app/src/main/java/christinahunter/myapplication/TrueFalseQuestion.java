package christinahunter.myapplication;

public class TrueFalseQuestion extends Question {

    private boolean mTFAnswer;

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
    public boolean checkAnswer(boolean userAns){

        return (mTFAnswer == userAns);
    }
}
