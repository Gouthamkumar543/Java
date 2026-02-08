package com.ou.ejb;

import java.util.ArrayList;
import java.util.List;
public class ListElementsBean {
    private List<Integer> values = new ArrayList<>();

    public void addElement(int e) {
        values.add(e);
    }

    public void removeElement(int e) {
        values.remove(Integer.valueOf(e));
    }

    public List<Integer> getElements() {
        return values;
    }
}