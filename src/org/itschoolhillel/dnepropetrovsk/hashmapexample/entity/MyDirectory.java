package org.itschoolhillel.dnepropetrovsk.hashmapexample.entity;

import java.util.List;

/**
 * Created by stephenvolf on 23/11/16.
 */
public interface MyDirectory extends MyFile {

    void addFile(MyFile file);
    List<String> listNames();

}
