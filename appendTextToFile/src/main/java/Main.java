/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William Millett
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    
    public static void main(String[] args) {
        String fileName ="";
        
        try {
            
            Files.write(Paths.get(fileName), "some text".getBytes(), StandardOpenOption.APPEND);
            
        }catch (IOException e) {
            //exception handling left as an exercise for the reader
            System.out.println("An error has occured \n" + e.getMessage());
        }
    }
}
