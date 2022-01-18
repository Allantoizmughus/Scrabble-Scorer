package models;

import java.util.HashMap;
import java.util.Map;

public class Scores {
    private final Map<Character,Integer> letterScore;

    //Create constructor to hold your hashmap and link your letters to respective scores.
    public Scores() {
        //put all letters in an array
        char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        //put all score in an array
        int[] scores = new int[]{1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};

        //initialize the hashmap
        letterScore = new HashMap<Character,Integer>();

        //use for loop to link each letter to respective array in the hashmap
        for(int i=0; i<letters.length;i++){
            char letter= letters[i];
            int score = scores[i];
            letterScore.put(letter,score);
        }

    }

    //define first method for finding single letter score
    public Integer calculatorScoreLetter(char letter) {

        //first change the letter to caps to match letters in the array
        letter=Character.toUpperCase(letter);

        //find the letter in the letterScore array and equate it to the correct score
        if(letterScore.containsKey(letter)){
            return letterScore.get(letter);
        }else{
            return 0;
        }
        }

     //define the second method which is for calculating the score for a word
    public Integer calculatorScoreWord(String word){
        //first I change the string word into a charArray
        char[] letters = word.toCharArray();

        //loop through each char/letter finding the correct score of the letter then adding it to the score total
        int score=0;
        for(char  letter:letters){
            score +=calculatorScoreLetter(letter);
        }
        return score;
    }
}