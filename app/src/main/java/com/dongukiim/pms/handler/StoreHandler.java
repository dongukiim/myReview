package com.dongukiim.pms.handler;

import com.dongukiim.util.Prompt;

public class StoreHandler {

  public static void select() {
    System.out.println("[LP매장 알아보기]");
    String option = Prompt.inputString("번호를 제외하고 입력하세요(1.온라인 2.오프라인)");
    System.out.println();

    if(option.equals("오프라인")) {
      region();
    } else if(option.equals("온라인")) {
      region();
    }

  }
  public static void region() {

    String input = Prompt.inputString("숫자를 제외하고 입력하세요(1.서울 2.경기도 3.부산 4.온라인) ");

    switch(input) {
      case "서울":
        System.out.println("=====================================================================");
        System.out.println("홍대 '김밥레코즈' / 신촌 '향뮤직' / 고속버스터미널 '반디앤루니스' / 광화문 '핫트랙스'");
        System.out.println("=====================================================================");
        break;

      case "경기도":
        System.out.println("===============================================");
        System.out.println("용산 '신나라레코드' / 고양시 '닥터그루브' / 파주 '곽LP'");
        System.out.println("===============================================");
        break;

      case "부산":
        System.out.println("======================================");
        System.out.println("금정구청 앞 'LP LOVE' / 보수동 '대한레코드'");
        System.out.println("======================================");
        break;

      case "온라인":
        System.out.println("=================================================================================================================================================");
        System.out.println("'LP사랑'[www.lpsarang.com] / 'LP나라'[www.lpnara.kr] / "
            + "'LP마켓'[www.lpmarket.co.kr] / '파란LP'[www.paranlp.com] / '레코드매니아'[www.recordmania.co.kr]");
        System.out.println("=================================================================================================================================================");
        break;

      default:
        System.out.println("해당지역 외에는 추가적인 정보가 없는 상태입니다.");
    }
  }


}
