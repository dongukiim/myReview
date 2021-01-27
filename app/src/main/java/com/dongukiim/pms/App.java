package com.dongukiim.pms;

import com.dongukiim.util.Prompt;

public class App {
  public static void main(String[] args) {


    System.out.println("[2021년 N월 신발 발매일 관리]");
    System.out.println();


    while(true) {
      System.out.println("1.정보등록 2.등록조회 3.발매처 4.응모규정 5.국제배송");
      String input = Prompt.promptString("숫자를 제외하고 입력하세요: ");
      System.out.println();

      if(input.equalsIgnoreCase("NO")) {
        System.out.println("처음으로 돌아갑니다");
        break;

      } else if (input.equalsIgnoreCase("정보등록")) {

        ListHandler.Add();

      } else if(input.equals("등록조회")) {

        ListHandler.show();
        System.out.println();

      } else if (input.equals("발매처")) {
        System.out.println("1.유럽 2.아시아 3.아메리카");
        String region = Prompt.promptString("숫자를 제외하고 입력하세요: ");
        System.out.println();

        switch(region) {
          case "유럽":
            Region.england();
            Region.france();
            Region.germany();
            break;

          case "아시아":
            Region.hongkong();
            Region.korea();
            break;

          case "아메리카":
            Region.america();
            Region.canada();
            Region.southamerica();
            break;

          default:
            System.out.println("해당 지역외에 나머지 지역은 임시 판매 중지상태입니다.");

        }

      } else if (input.equals("응모규정")) {
        System.out.println("1.Online 2.Instore 3.Instagram");
        String releaseRules = Prompt.promptString("숫자를 제외하고 입력하세요: ");


        switch(releaseRules) {
          case "Online" :
            RuleHandler.message("online");
            break;

          case "Instore" :
            RuleHandler.message("instore");
            break;

          case "Instagram":
            RuleHandler.message("Instagram");
            break;

          default:
            RuleHandler.message("");
        }


      } else if (input.equals("국제배송")) {
        String name = Prompt.promptString("발매처를 확인한 뒤 브랜드 이름을 입력하세요: ");
        if(name.equalsIgnoreCase("Foot Patrol") || name.equalsIgnoreCase("Shinzo Paris") || name.equalsIgnoreCase("Skateboard.com")
            || name.equalsIgnoreCase("ovo") || name.equalsIgnoreCase("SANTANA") || name.equalsIgnoreCase("Foot District")
            || name.equalsIgnoreCase("Nike Snkrs")) {

          System.out.println("해당 매장은 국제배송을 하지 않는 매장입니다. 배송대행지 메뉴를 참고하세요.");

        } else if (name.equalsIgnoreCase("Goodhood") || name.equalsIgnoreCase("Bstn") || name.equalsIgnoreCase("Feature") ||
            name.equalsIgnoreCase("Foot Locker") || name.equalsIgnoreCase("Yeezy Supply") ||
            name.equalsIgnoreCase("KITH") || name.equalsIgnoreCase("BODEGA") || name.equalsIgnoreCase("SSENSE")) {

          System.out.println("해당 매장은 국제배송이 가능한 매장입니다.");

        } else {

          System.out.println("해당 매장은 오직 매장 방문을 통해서만 판매합니다.");

        }


      } else {
        System.out.println("잘못 입력하셨습니다.");
      }
      System.out.println();
    }

    Prompt.close();
  }
}