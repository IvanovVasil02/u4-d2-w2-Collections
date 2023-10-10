package es1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Es1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);


    System.out.println("Enter how many element you want enter: ");
    while (true) {
      try {
        Set<String> words = new HashSet<>();
        int counterEquals = 0;
        int arraySize = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < arraySize; i++) {
          System.out.println("Enter word: ");
          String word = scan.nextLine();
          boolean add = words.add(word);
          if (!add) {
            counterEquals++;
          }

        }


        for (String word : words) {
          System.out.println(word);
        }

        System.out.println("Number of distinct words: " + words.size());

        System.out.println("Duplicate values: " + counterEquals);

        break;
      } catch (NumberFormatException ex) {
        System.out.println("You have to enter a number...");
      }
    }


  }
}
