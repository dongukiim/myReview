package com.dongukiim.pms;

import java.sql.Date;
import java.util.Scanner;

public class App {
  static Scanner scanner = new Scanner(System.in);


  static final int LENGTH = 20;
  static String[] brand = new String[LENGTH];
  static String[] name = new String[LENGTH];
  static Date[] startDate = new Date[LENGTH];
  static int[] salePrice = new int[LENGTH];
  static int[] quantity = new int[LENGTH];
  static String[] store = new String[LENGTH];
  static int count = 0;

  static void listAdd() {

    System.out.print("브랜드: ");
    brand[count] = scanner.nextLine();

    System.out.print("제품이름: ");
    name[count] = scanner.nextLine();

    System.out.print("발매일: ");
    startDate[count] = Date.valueOf(scanner.nextLine());

    System.out.print("발매가(단위 $):");
    salePrice[count] = scanner.nextInt();

    System.out.print("예상수량: ");
    quantity[count] = scanner.nextInt();
    scanner.nextLine();

    System.out.println("발매처: ");
    store[count] = scanner.nextLine();

    count++;
  }

  static void showList() {
    for(int i = 0; i <= count; i++) {
      System.out.printf("브랜드: %s, 제품이름: %s, 발매일: %s, 발매가: %d, 예상수량: %d, 발매처: %s", 
          brand[i], name[i], startDate[i], startDate[i], salePrice[i], quantity[i], store[i] );
    }
  }


  static String[] arr = new String[] {"SNS", "End Clothing", "Yeezy Supply", "Foot Patrol", "Supreme NewYork"};
  static String[] arr2 = new String[] {"KASINA", "꼼데가르송 서울", "아트모스 서울", "아디다스 코리아", "나이키 코리아", "웍스아웃"};



  public static void main(String[] args) {

    System.out.println("2021년 1월 신발 발매일 관리");


    while(true) {
      System.out.println("1.정보등록 2.등록조회 3.발매처 4.발매처규정 5.직배유무");
      String input = scanner.nextLine();
      if(input.equalsIgnoreCase("NO")) {
        System.out.println("처음으로 돌아갑니다");
        break;
      } else if (input.equalsIgnoreCase("정보등록")) {
        System.out.println("[정보등록]");

        listAdd();

        System.out.println("------------------------------");

      } else if(input.equals("등록조회")) {
        System.out.println("[등록조회]");
        showList();

      } else if (input.equals("발매처")) {
        System.out.println("[발매처]");
        System.out.println("1. 국내 / 2. 해외");
        String region = scanner.nextLine();

        switch(region) {
          case "해외":
            for(int i = 0; i < 5; i++) {
              System.out.println(arr[i]);
            }
            break;

          case "국내":
            for(int i = 0; i < 6; i++) {
              System.out.println(arr2[i]);
            }
            break;

          default:
            System.out.println("해당매장 외에는 현재 추가된 매장이 없습니다");

            System.out.println("-------------------------------------------------------");
        }

      } else if (input.equals("발매처규정")) {
        System.out.println("발매처 이름을 입력하세요");
        String storeName = scanner.nextLine();

        if(storeName.equalsIgnoreCase("SNS") || storeName.equalsIgnoreCase("Supreme NewYork")) {
          System.out.println("해당 매장은 Europe, America Only 입니다");
        } else if(storeName.equalsIgnoreCase("Yeezy Supply")) {
          System.out.println("해당 매장은 선착순 발매입니다.");
        } else {
          System.out.println("온라인 응모방식으로 발매됩니다");
        }

      } else if (input.equals("직배유무")) {
        System.out.println("해외 발매처 이름을 입력하세요");
        String storeName = scanner.nextLine();
        if(storeName.equalsIgnoreCase("End Clothing") || storeName.equalsIgnoreCase("Yeezy Supply")) {
          System.out.println("해당 매장은 직배 가능합니다. 배송비용은 매장 홈페이지에서 확인하세요");
        } else if (storeName.equalsIgnoreCase("Foot Patrol")) {
          System.out.println("해당 매장은 배송대행지를 이용하셔야 합니다. 표준 요금은 아래를 참조하세요");

          System.out.print("무게를 입력하세요(kg 단위)");
          int weight = scanner.nextInt();

          switch(weight) {
            case 1:
              System.out.println(17000 + "원");
              break;
            case 2:
              System.out.println(26000 + "원");
              break;
            case 3:
              System.out.println(35000 + "원");
              break;
            default:
              System.out.println("3kg가 초과할 경우 20000원이 추가됩니다");

          }
        } else {
          System.out.println("직배가 불가능한 매장입니다");
        }
      }

      else {
        System.out.println("잘못 입력하셨습니다.");

      }
      System.out.println();
    }

    scanner.close();
  }
}
