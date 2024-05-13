package com.interview.question;

import javafx.util.converter.IntegerStringConverter;

import java.util.HashMap;
import java.util.Map;

public final class AppliedImmutable {

    public AppliedImmutable(String str, int id, HashMap<Integer, String> map){
        this.name = str;
        this.id = id;
        HashMap<Integer,String> map1 = new HashMap<>();
        for(Map.Entry e : map.entrySet()){
            map1.put((int)e.getKey(),(String)e.getValue());
        }
        this.map = map1;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    private final String name;

    private final int id;

    private final HashMap<Integer, String> map;

    public HashMap<Integer, String> getMap() {

        return (HashMap<Integer, String>) map.clone();
    }
}
