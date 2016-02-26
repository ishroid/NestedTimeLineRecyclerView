package com.in.timelinenested.modals;

/**
 * Created by ishratkhan on 24/02/16.
 */
public class DataModal {
    int level;
    String name;

    public DataModal(int level, String name) {
        this.level = level;
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }
}
