package com.ou.ejb;

import java.util.ArrayList;
import java.util.List;

// ❌ Removed @Stateful and @Remote annotations (Tomcat doesn't support EJBs)
// ✅ Plain Java class stored in session to mimic stateful behavior
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