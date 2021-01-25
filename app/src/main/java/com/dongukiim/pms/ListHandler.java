package com.dongukiim.pms;

import java.sql.Date;
import com.dongukiim.util.Prompt;

public class ListHandler {

  static class List {
    String brand;
    String name;
    Date startDate;
    int salePrice;
    int quantity;
    String releaseWay;
    String worldWide;
  }

  static final int LENGTH = 20;
  static int count = 0;

  static List[] lists = new List[LENGTH];

  static String[] brand = new String[LENGTH];
  static String[] name = new String[LENGTH];
  static Date[] startDate = new Date[LENGTH];
  static int[] salePrice = new int[LENGTH];
  static int[] quantity = new int[LENGTH];
  static String[] releaseWay = new String[LENGTH];
  static String[] worldWide = new String[LENGTH];


  public static void Add() {

    List l = new List();

    System.out.println("[정보등록]");

    l.brand = Prompt.promptString("브랜드: ");
    l.name = Prompt.promptString("제품명: ");
    l.startDate = Prompt.promptDate("발매일: ");
    l.salePrice = Prompt.promptInt("발매가($): ");
    l.quantity = Prompt.promptInt("발매수량: ");
    l.releaseWay = Prompt.promptString("발매방식: ");
    l.worldWide = Prompt.promptString("직배유무: ");

    lists[count++] = l;

  }

  static void show() {

    System.out.println("[등록조회]");
    for(int i = 0; i <= count; i++) {
      ListHandler l;
      l = lists[i];
      System.out.printf("브랜드: %s, 제품이름: %s, 발매일: %s, 발매가: %d, 예상수량: %d, 발매처: %s", "발매방식: %s\n", 
          l.brand, l.name, l.startDate, l.startDate, l.salePrice, l.quantity, l.releaseWay);
    }
  }
}
