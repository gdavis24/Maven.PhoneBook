package com.zipcodewilmington.phonebook;

import java.util.*;

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
        for (String info : phoneNumbers){
            addAllNum.add(info);
        }
        map.put(name, addAllNum);
    }

    public void remove(String name) {
        map.remove(name);
    }

    public Boolean hasEntry(String name) {
        for (HashMap.Entry<String, List<String>> entry : map.entrySet()){
            if (entry.getValue().contains(name)){
                return true;
            }
        }
        return false;
    }

    public List<String> lookup(String name) {
        return map.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        for(HashMap.Entry<String, List<String>> entry : map.entrySet()){
            if(entry.getValue().contains(phoneNumber)){
                return entry.getKey();
            }
        }
        return null;
    }

    public List<String> getAllContactNames() {
        ArrayList<String> names = new ArrayList<>();
        for(HashMap.Entry<String, List<String>> entry : map.entrySet()) {
            names.add(entry.getKey());
        }
        return names;
    }

    public Map<String, List<String>> getMap() {
        return this.map;
    }
}
