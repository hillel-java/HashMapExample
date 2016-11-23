package org.itschoolhillel.dnepropetrovsk.hashmapexample.entity;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by stephenvolf on 23/11/16.
 */
public class SimpleDirectory extends AbstractFile implements MyDirectory {
    private final List<MyFile> internals = new LinkedList<>();


    public SimpleDirectory(String name, Long size, Date createdDate) {
        super(name, size, createdDate);
    }

    @Override
    public void addFile(MyFile file) {
        this.internals.add(file);
    }

    @Override
    public List<String> listNames() {
        List<String> names = new LinkedList<>();
        for(MyFile file : internals){
            names.add(file.name());
        }
        return names;
    }
}
