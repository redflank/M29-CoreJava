package com.tns.collections.set;

import java.util.TreeSet;

public class TreeSetDemo {
    public TreeSetDemo() {
    }

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet();
        ts.add("Neha");
        ts.add("Sakshi");
        ts.add("Shrutika");
        ts.add("Purvi");
        ts.add("Rajashree");
        ts.add("Purvi");
        System.out.println(ts);
    }
}
