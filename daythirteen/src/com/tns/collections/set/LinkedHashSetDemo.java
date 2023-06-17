
package com.tns.collections.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public LinkedHashSetDemo() {
    }

    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet();
        lhs.add("Neha");
        lhs.add("Sakshi");
        lhs.add("Shrutika");
        lhs.add("Purvi");
        lhs.add("Rajashree");
        lhs.add("Purvi");
        lhs.add((String)null);
        System.out.println(lhs);
    }
}
