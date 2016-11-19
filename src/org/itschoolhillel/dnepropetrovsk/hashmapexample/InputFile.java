package org.itschoolhillel.dnepropetrovsk.hashmapexample;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by stephenvolf on 19/11/16.
 */
public class InputFile {
    private final String fileName;
    private final Map<String, Integer> contents = new HashMap<>();

    InputFile(String fileName) {
        this.fileName = fileName;
    }

    public void read() throws IOException {
        File file = new File(fileName);

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(file)));
        String line;
        while ((line = reader.readLine()) != null) {
            if(!line.isEmpty()){
                String[] keyValue = line.split(" ");
                if(keyValue.length >= 2){
                    contents.put(keyValue[0], Integer.valueOf(keyValue[1]));
                }
            }
        }
    }

    public void print(){
        for(Map.Entry<String, Integer> entry : contents.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
