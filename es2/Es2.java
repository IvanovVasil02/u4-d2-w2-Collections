package es2;

import java.util.*;

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


    List<Integer> unorderList = unorderedList(orderedList);

    for (int elem : unorderList) {
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

  public static List<Integer> unorderedList(TreeSet<Integer> list) {
    List<Integer> newList = new ArrayList<>(list);

    Collections.reverse(newList);
    return newList;
  }
}

