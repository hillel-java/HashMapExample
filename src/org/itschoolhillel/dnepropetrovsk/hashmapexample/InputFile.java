package org.itschoolhillel.dnepropetrovsk.hashmapexample;

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
        File file = new File(fileName);

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(file)));
        String line;
        while ((line = reader.readLine()) != null) {
            if (!line.isEmpty()) {
                String[] keyValue = line.split(" ");
                if (keyValue.length >= 1) {
                    if (!contents.containsKey(keyValue[0])) {
                        contents.put(keyValue[0], new LinkedList<>());
                    }
                    for (int i = 1; i < keyValue.length; i++) {
                        try {
                            contents.get(keyValue[0]).add(Integer.valueOf(keyValue[i]));
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
