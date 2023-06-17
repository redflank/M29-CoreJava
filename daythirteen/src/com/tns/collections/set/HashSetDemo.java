//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.tns.collections.set;

import java.util.HashSet;

public class HashSetDemo {
    public HashSetDemo() {
    }

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet();
        System.out.println(hs.add(10));
        hs.add(50);
        hs.add(80);
        hs.add(20);
        hs.add(70);
        System.out.println(hs.add(10));
        hs.add(40);
        System.out.println("First Set " + hs);
        HashSet<Integer> hs1 = new HashSet();
        hs1.add(50);
        hs1.add(11);
        hs1.add(21);
        hs1.add(61);
        hs1.add(10);
        hs1.add(71);
        System.out.println("Second Set " + hs1);
        hs.addAll(hs1);
        System.out.println("After addAll current set is : " + hs);
        System.out.println("-----------------------------");
        hs.clear();
        System.out.println(hs.add(10));
        hs.add(50);
        hs.add(80);
        hs.add(20);
        hs.add(70);
        System.out.println(hs.add(10));
        hs.add(40);
        System.out.println("First Set " + hs);
        System.out.println("Second Set " + hs1);
        hs.retainAll(hs1);
        System.out.println("After retainAll current set is : " + hs);
        System.out.println("-----------------------------");
        hs.clear();
        System.out.println(hs.add(10));
        hs.add(50);
        hs.add(80);
        hs.add(20);
        hs.add(70);
        System.out.println(hs.add(10));
        hs.add(40);
        System.out.println("First Set " + hs);
        System.out.println("Second Set " + hs1);
        hs.removeAll(hs1);
        System.out.println("After removeAll current set is : " + hs);
        System.out.println("-----------------------------");
        hs.add((Integer)null);
        System.out.println(hs);
    }
}
