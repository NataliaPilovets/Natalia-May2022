package com.academy.natalia.Collections;

import java.util.List;

public class ListsTest {
    public static void main(String[] args) {

        List<Cat> arrayList = CatGenerator.generatecats(1000000);

        List<Cat> linkedList = CatGenerator.generatecats(1000000);

        long start = System.currentTimeMillis();
        arrayList.add(new Cat());
        long end = System.currentTimeMillis();
        System.out.println("Time taken for arrayList is " + (end - start) + "ms");

        start = System.currentTimeMillis();
        linkedList.add(new Cat());
        end = System.currentTimeMillis();
        System.out.println("Time taken for LinkedList is " + (end - start) + " ms");

        start = System.currentTimeMillis();
        arrayList.remove(0);
        end = System.currentTimeMillis();
        System.out.println("Time taken for remove from arrayList is " + (end - start) + "ms");

        start = System.currentTimeMillis();
        linkedList.remove(0);
        end = System.currentTimeMillis();
        System.out.println("Time taken for remove from LinkedList is " + (end - start) + " ms");
            }
        }

        /*Solution with cicles
        for (int i = 0; i < 100000; i++) {
        arrayList.add(i);
        linkedList.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++)
        arrayList.get();
        long end = System.currentTimeMillis();
        System.out.println("Time taken for arrayList is " + (end - start) + "ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++)
        linkedList.get(i);
        end = System.currentTimeMillis();
        System.out.println("Time taken for LinkedList is " + (end - start) + " ms");

        start = System.currentTimeMillis();
        arrayList.remove(0);
        end = System.currentTimeMillis();
        System.out.println("Time taken for remove from arrayList is " + (end - start) + "ms");

        start = System.currentTimeMillis();
        linkedList.remove(0);
        end = System.currentTimeMillis();
        System.out.println("Time taken for remove from LinkedList is " + (end - start) + " ms");
            }
        }
        */




















