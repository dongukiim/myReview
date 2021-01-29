package com.dongukiim.pms;

import com.dongukiim.pms.handler.DiscographyHandler;
import com.dongukiim.pms.handler.MemberHandler;
import com.dongukiim.pms.handler.StoreHandler;
import com.dongukiim.util.Prompt;

public class App {
  public static void main(String[] args) {

    MemberHandler memberList = new MemberHandler();
    DiscographyHandler discographyList = new DiscographyHandler();

    System.out.println("[LP를 소개하는 블로그]");
    System.out.println();


    while(true) {
      System.out.println("1.정보등록 2.등록조회 3.디스코그래피 등록 4.디스코그래피 조회 5.장르 6.매장안내");
      String input = Prompt.inputString("숫자를 제외하고 입력하세요('end' 입력시 종료): ");
      System.out.println();

      if(input.equalsIgnoreCase("End")) {
        System.out.println("이용해주셔서 감사합니다. 다음에도 좋은 음악 부탁드려요");
        break;

      } else if (input.equals("정보등록")) {
        memberList.add();

      } else if (input.equals("등록조회")) {
        memberList.list();

      } else if (input.equals("디스코그래피 등록")) {
        discographyList.add();

      } else if (input.equals("디스코그래피 조회")) {
        discographyList.show();

      } else if (input.equals("장르")) {


      } else if (input.equals("매장안내")) {
        StoreHandler.region();

      } else {
        System.out.println("잘못 입력하셨습니다.");
      }
      System.out.println();
    }

    Prompt.close();
  }
}