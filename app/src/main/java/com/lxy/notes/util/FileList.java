package com.lxy.notes.util;

import java.io.File;
import java.util.ListIterator;

/**
 * Created by liuxinyong on 2017-9-18.
 */

public class FileList implements ListIterator<File> {

    File rootDir;

    File[] files;

    public FileList(String path){
        rootDir = new File(path);


    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public File next() {
        return null;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public File previous() {
        return null;
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return 0;
    }

    @Override
    public void remove() {

    }

    @Override
    public void set(File file) {

    }

    @Override
    public void add(File file) {

    }
}
