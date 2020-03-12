package com.zipcodewilmington.phonebook;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    private Map<String, List<String>> map;
    public PhoneBook(Map<String, List<String>> map) {
        this.map = map;
    }

    public PhoneBook() {
        this.map = new LinkedHashMap<>();
    }

    public void add(String name, String phoneNumber) {
        List<String> addNum = new ArrayList<>();
        addNum.add(phoneNumber);
        map.put(name, addNum);
    }

    public void addAll(String name, String... phoneNumbers) {
        List<String> addAllNum = new ArrayList<>();

    }

    public void remove(String name) {
        map.remove(name);
    }

    public Boolean hasEntry(String name) {
        return null;
    }

    public List<String> lookup(String name) {
        return map.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        return null;
    }

    public List<String> getAllContactNames() {
        return null;
    }

    public Map<String, List<String>> getMap() {
        return this.map;
    }
}
