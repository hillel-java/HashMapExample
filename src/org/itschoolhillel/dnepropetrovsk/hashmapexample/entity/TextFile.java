package org.itschoolhillel.dnepropetrovsk.hashmapexample.entity;

import java.util.Date;
import java.util.List;

/**
 * Created by stephenvolf on 23/11/16.
 */
public class TextFile extends AbstractFile {
    public TextFile(String name, Long size, Date createdDate) {
        super(name, size, createdDate);
    }

    public List<String> lines(){
        return null;
    }
}
