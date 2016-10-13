/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bleh;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author victoriapayne
 %N = new line
 %S = new string
 * 
 */
public class Bleh {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileReader reader = new FileReader("HelloWorld.txt");
            int character;
 
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}
