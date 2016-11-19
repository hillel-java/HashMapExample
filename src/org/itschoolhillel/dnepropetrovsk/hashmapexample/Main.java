package org.itschoolhillel.dnepropetrovsk.hashmapexample;

import java.io.File;
import java.io.IOException;

/**
 * Created by stephenvolf on 19/11/16.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        InputFile inputFile = new InputFile("./resources/input.txt");
        inputFile.read();
        inputFile.print();
    }
}
