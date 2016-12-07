package org.itschoolhillel.dnepropetrovsk.hashmapexample;

import org.itschoolhillel.dnepropetrovsk.hashmapexample.entity.MyDirectory;
import org.itschoolhillel.dnepropetrovsk.hashmapexample.entity.SimpleDirectory;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by stephenvolf on 19/11/16.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        InputFile inputFile = new InputFile("./src/main/resources/input.txt");
        inputFile.read();
        inputFile.print();

//        MyDirectory dir = new SimpleDirectory("./resources", null);
//        dir.init();
//        System.out.println(Arrays.toString(dir.listNames().toArray()));
    }
}
