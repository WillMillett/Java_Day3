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
import java.io.FileNotFoundException;

public class Main {
    
    public static void main(String[] args) {
      
        //the location fo the file to start looking
        String fileLocation = "C:\\Users\\William Millett\\Documents\\CIS243\\Labs\\Lab1";
        printFiles(fileLocation);
    }
    
    public static void printFiles(String fileLocation){
        
       File fileName = new File(fileLocation); 
       
       if(fileName.listFiles() != null){ 
           try {
               //create a file array
                File[] listOfFiles = fileName.listFiles();
              
               
               //for every file in the directory
               for (File file : listOfFiles) {
                   //print the name of the files if it is not null
                    System.out.println(file.getName());
                    fileLocation = file.getPath();
                    printFiles(fileLocation);
                   
                }
            } catch (Exception e) {
                //print an error message
                System.out.println("Something went wrong \n" + e.getMessage() );
            }//end of catch  
        }//end of if
    }//end of printFiles method
       
}
    

