import models.Scores;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Let's play some Scrabble!");
        System.out.println("Enter a LETTER or a WORD:");

        try{
            String stringUserWord= bufferedReader.readLine();
            Scores scores=new Scores();
            Integer scrabbleScores= scores.calculatorScoreWord(stringUserWord);
            System.out.println(scrabbleScores);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
