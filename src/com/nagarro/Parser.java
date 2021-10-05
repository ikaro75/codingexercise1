/*
 * 
 * This class parses a sentence and replaces each word with the following: 
 * first letter, number of distinct characters between first and last character, and last letter. 
 * Words are separated by spaces or non-alphabetic characters and these separators 
 * are maintained in their original form and location in the answer.
 */
package com.nagarro;

/**
 *
 * @author daniel.martinez
 */
public class Parser {
    private String s;
    
    public Parser(String s) {
        this.s = s;
        
    }

    public String getParsedString() {

        String[] array= s.split("[^a-zA-Z]");
        String result = "";
        int accumulatedChars = 0;
        for (int i=0; i<array.length;i++ ) {
            accumulatedChars +=  array[i].length()+1;
            if (array[i].length()>1)
                result += array[i].substring(0, 1) + String.valueOf(countUniqueChars(array[i].substring(1,array[i].length()-1))) + array[i].substring(array[i].length()-1) ;
            else {
                result += array[i].substring(0);
            }
            
            if (accumulatedChars<s.length())
                result += s.substring(accumulatedChars-1,accumulatedChars) ;
        }
        
        return result;
    }
    
    private int countUniqueChars(String input) {
        String s = "";
        for (int i=0; i<input.length(); i++) {
            if (s.indexOf(input.substring(i,i+1))<0) {
                s+=input.substring(i,i+1);
            }
        }
        
        return s.length();
      }
    

}
