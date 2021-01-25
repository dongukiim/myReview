package com.dongukiim.pms;

import java.util.Scanner;

public class RuleHandler {
  static Scanner keyboardScan = new Scanner(System.in);

  static void message(String name) {
    name = keyboardScan.nextLine();
    if(name.equalsIgnoreCase("Online")) {

      System.out.println("온라인 당첨자의 경우 미구매시 향후 모든 응모에서 제외됩니다.");
      System.out.println("In case of online winner, if you don't buy the product you will be excluded from all future raffles.");

    } else if(name.equalsIgnoreCase("instore")) {

      System.out.println("인스토어 수령의 경우 신분증과 본인 명의 카드를 지참하시기 바랍니다.");
      System.out.println("In case of instore-winner, you have to bring your id-card and credit card which is yours.");

    } else if(name.equalsIgnoreCase("instagram")) {

      System.out.println("인스타그램 당첨자는 설문지에 기재하신 번호로 문자가 도착할 것입니다.");
      System.out.println("In case of Instagram-winner, you'll receive the message with the cell phone number you wrote in the questionnaire.");

    } else {

      System.out.println("위 세가지 방법외에는 다른 구매 경로는 없습니다.");
      System.out.println("Besides these ways, there's no way to purchase.");
    }

  }
}
