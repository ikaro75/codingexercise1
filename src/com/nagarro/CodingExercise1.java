/*
 * This program parses a sentence and replaces each word with the following: 
 * first letter, number of distinct characters between first and last character, and last letter. 
 * Words are separated by spaces or non-alphabetic characters and these separators 
 * are maintained in their original form and location in the answer.
 */
package com.nagarro;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class CodingExercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "";
        if (args.length==0) {
            System.out.print("Please, enter the string to parse: ");
            Scanner scan = new Scanner(System.in);
            s = scan.nextLine();
        } else {
            s = args[0];
        }
        
        Parser parser = new Parser(s);
        System.out.println("Output: " + parser.getParsedString());
        
        
    }
    
}
