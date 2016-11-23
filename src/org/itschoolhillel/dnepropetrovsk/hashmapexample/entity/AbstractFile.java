package org.itschoolhillel.dnepropetrovsk.hashmapexample.entity;

import java.util.Date;

/**
 * Created by stephenvolf on 23/11/16.
 */
public abstract class AbstractFile implements MyFile {

    private final String name;
    private final Long size;
    private final Date createdDate;

    public AbstractFile(String name, Long size, Date createdDate){
        this.name = name;
        this.size = size;
        this.createdDate = createdDate;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Long size() {
        return size;
    }

    @Override
    public Date createdDate() {
        return createdDate;
    }
}
