/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William Millett
 */
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        char charToSearchFor = args[0].charAt(0);
        String fileName = "C:\\Users\\William Millett\\Documents\\test.txt";
        
        System.out.println("The number of time the character appears is: " + charCounter(fileName, charToSearchFor));
        
    }
    public static int charCounter(String fileName, char charToSearchFor){
        //for each line in the file
        String line = "";
        //for counting the number of time the character we are searching for appears in the file
        int counter = 0;
        try {
            //instatiate a new scanner object
            Scanner scan = new Scanner(new FileInputStream(fileName));
            
            //loop through the file and count the number of times the characterToSearchFor appears
            while (scan.hasNextLine()) {
                //get the next line in the file
                line = scan.nextLine();
                //go through the line and count how many times the char appears
                for (int i = 0; i < line.length(); i++) {
                    if(line.charAt(i) == charToSearchFor){
                        counter++;
                    }
                }
            }
            
        } catch (Exception e) {
            //print out a error message
            System.out.println("An error occure \n" + e.getMessage());
            
        }
        
        //return the number of times we found the character
        return counter;
    } 
    
}
