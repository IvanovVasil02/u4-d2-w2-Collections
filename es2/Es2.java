package es2;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Es2 {
  public static void main(String[] args) {

    TreeSet<Integer> orderedList = new TreeSet<>();

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the size of array: ");
    int size = Integer.parseInt(scan.nextLine());
    orderedList = orderedList(size);
    for (int elem : orderedList) {
      System.out.println(elem);
    }

    unorderedList(size, orderedList);
    for (int elem : orderedList) {
      System.out.println(elem);
    }

  }

  public static TreeSet<Integer> orderedList(int arraySize) {
    TreeSet<Integer> list = new TreeSet<>();
    for (int i = 0; i < arraySize; i++) {
      int rndmn = (int) Math.floor(Math.random() * 101);
      list.add(rndmn);
    }
    return list;
  }

  public static TreeSet<Integer> unorderedList(int arraySize, TreeSet<Integer> list) {
    TreeSet<Integer> newlist = new TreeSet<>(Collections.reverseOrder());
    newlist = list;

    return newlist;
  }
}

