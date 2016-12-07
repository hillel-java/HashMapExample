package org.itschoolhillel.dnepropetrovsk.hashmapexample;

import org.itschoolhillel.dnepropetrovsk.hashmapexample.entity.TextFile;

import java.io.*;
import java.util.*;

/**
 * Created by stephenvolf on 19/11/16.
 */
public class InputFile {
    private final String fileName;
    private final Map<String, List<Integer>> contents = new HashMap<>();

    InputFile(String fileName) {
        this.fileName = fileName;
    }

    public void read() throws IOException {
        TextFile text = new TextFile(fileName);

        for (String line : text.lines()) {
            if (!line.isEmpty()) {
                String[] keyValue = line.split(" ");
                if (keyValue.length >= 1) {
                    if (contents.get(keyValue[0]) == null) {
                        contents.put(keyValue[0], new LinkedList<>());
                    }
                    for (int i = 1; i < keyValue.length; i++) {
                        List<Integer> valuesList = contents.get(keyValue[0]);
                        try {
                            valuesList.add(Integer.valueOf(keyValue[i]));
                        } catch (NumberFormatException e) {
                            System.err.println(keyValue[i] + " is not a number");
                        }
                    }
                }
            }
        }
    }

    public void print() {
        for (Map.Entry<String, List<Integer>> entry : contents.entrySet()) {
            System.out.println(entry.getKey() + " - " + Arrays.toString(entry.getValue().toArray()));
        }
    }
}
