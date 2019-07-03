package christinahunter.myapplication;

import java.util.Scanner;

public class MultipleChoiceQuestion extends Question {

    String[] mOptions;
    char mAnswer;

    MultipleChoiceQuestion(String text, String[] options, char answer){
        super(text);
        mOptions = options;
        mAnswer = answer;
    }

    String getOptions(){
        String result = "";
        char letter = 'a';
        for(int i = 0; i < mOptions.length; i++){
            if( i < (mOptions.length - 1))
               result += letter + ". " + mOptions[i] + '\n';
            else
               result += letter + ". " + mOptions[i];

            letter++;
        }

        return result;
    }

    @Override
    public String getText() {
        return super.getText() + "\n" + getOptions();
    }

    @Override
    public boolean readInputAndCheckAnswer(Scanner input){

        System.out.print("Choose a letter: ");
        String ans = input.nextLine();
        char charAns = ans.charAt(0);
        return checkAnswer(charAns);
    }

    public boolean checkAnswer(char ans){
        return (ans == mAnswer);
    }

    @Override
    public boolean isMultipleChoiceQuestion(){

        return true;
    }


}
