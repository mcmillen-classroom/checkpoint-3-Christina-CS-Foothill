package christinahunter.myapplication;
public class Question
{
    private String mText;
    private String[] mFillAnswer;
    // 0 = read in boolean, 1 = read in string, 2 = read in number
    private int mAnswerType;

    public Question(String mText) {
        this.mText = mText;
    }

    public Question(String text, String... ans)
    {
        mText = text;
        mFillAnswer = ans;
        mAnswerType = 1;
    }

    public int getAnswerType()
    {
        return mAnswerType;
    }

    public String[] getFillAnswers()
    {
        return mFillAnswer;
    }

    public String getText()
    {
        return mText;
    }

    public void setText(String text)
    {
        mText = text;
    }

    public boolean checkAnswer(String userAns){

        for (String ans : getFillAnswers())
        {
            if (ans.equalsIgnoreCase(userAns))
                return true;
        }
        return false;
    }

    //stub method - intentionally does nothing
    public boolean checkAnswer(boolean ans){
        return false;
    }
}