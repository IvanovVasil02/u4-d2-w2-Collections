package es3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Es3 {
  public static void main(String[] args) {

    HashMap<String, String> addressBook = new HashMap<>();
    addContact(addressBook, "franco", "42354324");
    addContact(addressBook, "luca", "2332534");
    getAddressBook(addressBook);

  }

  public static void addContact(HashMap<String, String> map, String name, String number) {
    map.put(name, number);
  }

  public static void removeContact(HashMap<String, String> map, String name) {
    map.remove(name);
  }

  public static void getContactName(HashMap<String, String> map, String number) {
    Collection<String> contactKey = map.keySet();
    for (String currentKey : contactKey) {
      if (map.get(currentKey).equals(number)) {
        System.out.println(currentKey);
      }
    }
  }

  public static void getContactNumber(HashMap<String, String> map, String name) {
    System.out.println(map.get(name));
  }

  public static void getAddressBook(HashMap<String, String> map) {
    Collection<String> keys = map.keySet();
    Iterator i = keys.iterator();

    for (String currentKey : keys) {
      System.out.println(currentKey + ": " + map.get(currentKey));
    }

  }
}
