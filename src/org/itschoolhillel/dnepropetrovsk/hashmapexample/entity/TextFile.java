package org.itschoolhillel.dnepropetrovsk.hashmapexample.entity;

import java.io.*;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by stephenvolf on 23/11/16.
 */
public class TextFile extends AbstractFile {
    public TextFile(String name, Long size, Date createdDate) {
        super(name, size, createdDate);
    }

    public TextFile(String name) {
        super(name, null, null);
    }

    public List<String> lines() {
        List<String> lines = new LinkedList<>();
        File file = new File(this.name());

        try {

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(file)));
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("File not found");
        } catch (IOException ioe) {
            System.err.println("Could not read file");
        }

        return lines;
    }
}
