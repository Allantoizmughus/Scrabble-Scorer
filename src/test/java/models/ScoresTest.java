package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoresTest {

    @Test
    public void calculatorScoreLetter_returnScoreForSingleLetter_1() throws Exception {
        Scores testScores= new Scores();
        Integer expectedInt=10 ;
        assertEquals(expectedInt, testScores.calculatorScoreLetter('Z'));
    }

    @Test
    void calculatorScoreLetter_returnZeroForEmptySpace_0() throws Exception{
        Scores testScores= new Scores();
        Integer expectedInt= 0;
        assertEquals(expectedInt,testScores.calculatorScoreLetter(' '));
    }

    @Test
    void calculatorScoreWord_returnScoreForSingleWord_int() throws Exception {
        Scores testScores=new Scores();
        Integer expectedInt=5;
        assertEquals(expectedInt,testScores.calculatorScoreWord("God"));
    }

}