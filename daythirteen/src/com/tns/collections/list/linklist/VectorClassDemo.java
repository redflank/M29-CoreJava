//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.tns.collections.list.linklist;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClassDemo {
    public void VectorDemo() {
    }

    public static void main(String[] args) {
        Vector<String> v1 = new Vector(4);
        System.out.println(v1.capacity());
        v1.add("Nashik");
        v1.add("Pune");
        v1.add("Delhi");
        v1.add("Mumbai");
        v1.add("Banglore");
        v1.add("Chennai");
        System.out.println(v1);
        System.out.println("--------------------------");
        Enumeration e = v1.elements();

        while(e.hasMoreElements()) {
            System.out.println((String)e.nextElement());
        }

        System.out.println("--------------------------");
        System.out.println(v1.capacity());
        v1.addElement("Nagpur");
        System.out.println((String)v1.firstElement());
    }
}
