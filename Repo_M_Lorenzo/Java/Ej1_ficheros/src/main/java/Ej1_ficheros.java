
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.out;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mlorenzo
 */
public class Ej1_ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code String salari;

        FileReader fich1 = new FileReader("prueba.txt");


        BufferedReader in = new BufferedReader(fich1);
        String caracter;


        while ((caracter = in.readLine()) != null) {
        System.out.println(caracter);
        }
        fich1.close();
    }
    
}