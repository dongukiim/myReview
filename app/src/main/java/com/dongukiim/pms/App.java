package com.dongukiim.pms;

import com.dongukiim.util.Prompt;

public class App {
  public static void main(String[] args) {


    System.out.println("[2021년 1월 신발 발매일 관리]");
    System.out.println();


    while(true) {
      System.out.println("1.정보등록 2.등록조회 3.발매처 4.발매처규정 5.직배유무");
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
        System.out.println("1.Europe 2.Asia 3.America");
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

      } else if (input.equals("발매처규정")) {
        System.out.println("1.Online 2.Instore 3.Instagram");
        String releaseRules = Prompt.promptString("숫자를 제외하고 입력하세요");


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


      } else if (input.equals("택배규정")) {

        String storeName = Prompt.promptString("해외 발매처 이름을 입력하세요: ");
        if(storeName.equalsIgnoreCase("End Clothing") || storeName.equalsIgnoreCase("Yeezy Supply")) {
          System.out.println("해당 매장은 직배 가능합니다. 배송비용은 매장 홈페이지에서 확인하세요");

        } else if (storeName.equalsIgnoreCase("Foot Patrol")) {
          System.out.println("해당 매장은 배송대행지를 이용하셔야 합니다. 표준 요금은 아래를 참조하세요");

          int weight = Prompt.promptInt("무게를 입력하세요(kg): ");

          switch(weight) {
            case 1:
              System.out.println("요금은" + 17000 + "원 입니다");
              break;
            case 2:
              System.out.println("요금은" + 26000 + "원 입니다");
              break;
            case 3:
              System.out.println("요금은" + 35000 + "원 입니다");
              break;
            default:
              System.out.println("3kg가 초과할 경우 kg당 20000원이 추가됩니다");
          }

        } else {
          System.out.println("직배가 불가능한 매장입니다");
        }

      } else {
        System.out.println("잘못 입력하셨습니다.");
      }
      System.out.println();
    }

    Prompt.close();
  }
}