package com.tinkerpop.gremlin;

import junit.framework.TestCase;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 * @version 0.1
 */
public class BaseTest extends TestCase {

    public static void printList(List list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void printIterator(Iterator itty) {
        while (itty.hasNext()) {
            System.out.println(itty.next());
        }
    }

    public static int countIterator(Iterator itty) {
        int counter = 0;
        while (itty.hasNext()) {
            itty.next();
            counter++;
        }
        return counter;
    }

    public static void sweep(Iterator itty) {
        while (itty.hasNext()) {
            itty.next();
        }
    }

    public static List asList(Object x, int times) {
        List list = new ArrayList();
        for(int i=0; i<times; i++) {
            list.add(x);
        }
        return list;
    }

}
