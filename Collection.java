package com.java.goit.Enterprise1;

import java.util.*;

public class Collection {

    static final int NUMBEROFTIMES = 1;

    public static void main(String[] args) {


        System.out.println("K objects  add   get contains remove  iteratorAdd  iteratorRemove");

        ArrayList arrayList = new ArrayList<>();
        for (int i = 0, n = 10; i < 1; i++) {
            System.out.println(n + "K objects in ArrayList " + addList(arrayList, n) + " " + getList(arrayList, n) + " " +
                    containsList(arrayList, n) + " " + removeList(arrayList, n) + " " + iteratorRemove(arrayList, n));
            n *= 10;
        }

        LinkedList linkedList = new LinkedList();
        for (int i = 0, n = 10; i < 1; i++) {
            System.out.println(n + "K objects in LinkedList " + addList(linkedList, n) + " " + getList(linkedList, n) + " " +
                    removeList(linkedList, n) + " " + containsList(linkedList, n) + " " + iteratorAdd(linkedList, n)
                    + " " + iteratorRemove(linkedList, n));
            n *= 10;
        }

        System.out.println("K objects  add   contains remove");

        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0, n = 10; i < 3; i++) {
            System.out.println(n + "K objects in HashSet " + addSet(set, n) + " " +
                    containsSet(set, n) + " " + removeSet(set, n));
            n *= 10;
        }

        Set<Integer> setTree = new TreeSet<Integer>();
        for (int i = 0, n = 10; i < 3; i++) {
            System.out.println(n + "K objects in TreeSet " + addSet(setTree, n) + " " +
                    containsSet(setTree, n) + " " + removeSet(setTree, n));
            n *= 10;
        }


    }

    public static long addList(List list, int n) {
        long time = 0;
        for (int i = 0; i < NUMBEROFTIMES; i++) {
            Date dateStart = new Date();
            for (int j = 0; j < 1000 * n; j++) {
                list.add(j);
            }
            Date dateStop = new Date();
            time = time + (dateStop.getTime() - dateStart.getTime());
        }
        return time / NUMBEROFTIMES;
    }

    public static long getList(List list, int n) {
        long time = 0;
        for (int i = 0; i < NUMBEROFTIMES; i++) {
            Date dateStart = new Date();
            for (int j = 0; j < 1000 * n; j++) {
                list.get(j);
            }
            Date dateStop = new Date();
            time = time + (dateStop.getTime() - dateStart.getTime());
        }
        return time / NUMBEROFTIMES;
    }

    public static long containsList(List list, int n) {
        long time = 0;
        for (int i = 0; i < NUMBEROFTIMES; i++) {
            Date dateStart = new Date();
            for (int j = 0; j < 1000 * n; j++) {
                list.contains(j);
            }
            Date dateStop = new Date();
            time = time + (dateStop.getTime() - dateStart.getTime());
        }
        return time / NUMBEROFTIMES;
    }

    public static long removeList(List list, int n) {
        long time = 0;
        for (int i = 0; i < 1; i++) {
            Date dateStart = new Date();
            while (list.size() > 0) {
                list.remove(0);
            }
            Date dateStop = new Date();
            time = time + (dateStop.getTime() - dateStart.getTime());
        }
        return time / 1;
    }

    public static long iteratorAdd(List list, int n) {
        long time = 0;
        for (int i = 0; i < NUMBEROFTIMES; i++) {
            Date dateStart = new Date();
            for (int j = 0; j < 1000 * n; j++) {
              list.listIterator().add(j);
            }
            Date dateStop = new Date();
            time = time + (dateStop.getTime() - dateStart.getTime());
        }
        return time / NUMBEROFTIMES;
    }

    public static long iteratorRemove(List list, int n) {
        long time = 0;
        for (int i = 0; i < NUMBEROFTIMES; i++) {
            Iterator<String> iterator = list.iterator();
            Date dateStart = new Date();
            while (iterator.hasNext()) {
                iterator.remove();
            }
            Date dateStop = new Date();
            time = time + (dateStop.getTime() - dateStart.getTime());
        }
        return time / NUMBEROFTIMES;
    }

    public static long addSet(Set set, int n) {
        long time = 0;
        for (int i = 0; i < NUMBEROFTIMES; i++) {
            Date dateStart = new Date();
            for (int j = 0; j < 1000 * n; j++) {
                set.add(1000*n - j);
            }
            Date dateStop = new Date();
            time = time + (dateStop.getTime() - dateStart.getTime());
        }
        return time / NUMBEROFTIMES;
    }

    public static long containsSet(Set set, int n) {
        long time = 0;
        for (int i = 0; i < NUMBEROFTIMES; i++) {
            Date dateStart = new Date();
            for (int j = 0; j < 1000 * n; j++) {
                set.contains(j);
            }
            Date dateStop = new Date();
            time = time + (dateStop.getTime() - dateStart.getTime());
        }
        return time / NUMBEROFTIMES;
    }

    public static long removeSet(Set set, int n) {
        long time = 0;
        for (int i = 0; i < NUMBEROFTIMES; i++) {
            Iterator<Integer> iterator = set.iterator();
            Date dateStart = new Date();
            while (iterator.hasNext()) {
                Integer element = iterator.next();
                if (element % 2 == 0)
                    iterator.remove();
            }
            Date dateStop = new Date();
            time = time + (dateStop.getTime() - dateStart.getTime());
        }
        return time / NUMBEROFTIMES;
    }
}