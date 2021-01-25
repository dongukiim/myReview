package com.dongukiim.pms;

public class Region {

  static String[] arr0 = {"GoodHood, ", "Foot Patrol, ", "Nike Snkrs, ", "Foot District"};
  static String[] arr1 = {"Shinzo Paris, ", "Nike Snkrs"};
  static String[] arr2 = {"BSTN, ", "Feature"};
  static String[] arr3 = {"Juice Store"};
  static String[] arr4 = {"KASINA, ","꼼데가르송 서울, ","나이키 코리아, ", "아디다스 코리아, ","아트모스 서울, ", "웍스아웃, ", "JD Sports"};
  static String[] arr5 = {"Foot Locker, ", "Skateboard.com, ", "Yeezy Supply, ", "KITH, ", "BODEGA", "Supreme NewYork"};
  static String[] arr6 = {"OVO, ", "SSENSE"};
  static String[] arr7 = {"SANTANA, ", "New Mexico Sneakers"};



  static void england() {
    System.out.print("영국: ");
    for (int i = 0; i < arr0.length; i++) {
      System.out.print(arr0[i]);
    }
    System.out.println();
  }

  static void france() {
    System.out.print("프랑스: ");
    for (int i = 0; i < arr1.length; i++) {
      System.out.print(arr1[i]);
    }
    System.out.println();
  }

  static void germany() {
    System.out.print("독일: ");
    for (int i = 0; i < arr2.length; i++) {
      System.out.print(arr2[i]);
    }
    System.out.println();
  }

  static void hongkong() {
    System.out.print("홍콩: ");
    for (int i = 0; i < arr3.length; i++) {
      System.out.println(arr3[i]);
    }
  }

  static void korea() {
    System.out.print("대한민국: ");
    for (int i = 0; i < arr4.length; i++) {
      System.out.print(arr4[i]);
    }
    System.out.println();
  }

  static void america() {
    System.out.print("미국: ");
    for (int i = 0; i < arr5.length; i++) {
      System.out.print(arr5[i]);
    }
    System.out.println();
  }

  static void canada() {
    System.out.print("캐나다: ");
    for (int i = 0; i < arr6.length; i++) {
      System.out.print(arr6[i]);
    }
    System.out.println();
  }

  static void southamerica() {
    System.out.print("중남미: ");
    for (int i = 0; i < arr7.length; i++) {
      System.out.print(arr7[i]);
    }
    System.out.println();
  }

}
