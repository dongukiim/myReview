package com.dongukiim.util;

import java.sql.Date;
import java.util.Scanner;

public class Prompt {
  static Scanner scanner = new Scanner(System.in);

  public static String promptString(String title) {
    System.out.print(title);
    return scanner.nextLine();
  }

  public static int promptInt(String title) {
    return Integer.valueOf(promptString(title));
  }

  public static Date promptDate(String title) {
    return Date.valueOf(promptString(title));
  }

  public static void close() {
    scanner.close();
  }
}
