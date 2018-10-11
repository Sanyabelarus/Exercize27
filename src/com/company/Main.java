package com.company;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Random random = new Random();
    List<Integer> intList = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      intList.add(random.nextInt(9) + 1);
    }
    System.out.println(intList);
    Set<Integer> newSet = new HashSet<Integer>();
    newSet.addAll(intList);
    intList.clear();
    intList.addAll(newSet);
  }
}
