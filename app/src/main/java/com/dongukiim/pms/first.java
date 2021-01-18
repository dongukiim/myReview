package com.dongukiim.pms;

import java.util.Scanner;

/* 개강 후 첫 한 달이 되어 이번 달 받을 수 있는 수당에 대한 코딩을 해봤습니다. 참고사항으로는 
   첫째, 금액은 임의로 매겼다는 점(상수변수 참고)

   둘째, 출석일수에서 풀타임 수강횟수를 뺀 나머지를 지각횟수라 했습니다. 다만 변수를 상수처리를 함으로써
         사용자가 매번 상수부분을 바꿔야 하는 다소 비효율적인 코딩처리가 되었습니다. 더 좋은 아이디어나
         피드백 부탁드리겠습니다.

   셋째, 전반적으로 보완할 점에 대해 의견을 나누고 피드백해주시면 많은 공부가 될 것 같습니다. 감사합니다!
 */

public class first {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("[자바 189기 수강생 1월 수당 조회 및 관리]");
    System.out.println();

    final int MIN_COUNT = 0;
    final int MAX_COUNT = 18;

    final int DAY_EARNING = 14000;
    final int FOOD_EXPENSE = 3300;

    final int ATTEND_DAYS = 18;
    final int FULL_DAYS = 15;

    while(true) {
      System.out.println("입력하세요");
      String name = scanner.nextLine();

      if(name.equals("오은석") || name.equals("정진선") || name.equals("이희진") || name.equals("진박이") ||
          name.equals("최석렬") || name.equals("안종원") || name.equals("혀니니") || name.equals("황인태") ||
          name.equals("이동인") || name.equals("김대훈") || name.equals("이보나") || name.equals("박선우") ||
          name.equals("윤호중") || name.equals("김승원") || name.equals("김현우") || name.equals("전정헌") ||
          name.equals("필립") || name.equals("성은") || name.equals("승원") || name.equals("도현") || 
          name.equals("지숙") || name.equals("태훈") || name.equals("김동욱")) {

        System.out.println("목록에 있는 이름과 일치합니다. 다음 단계로 진행합니다");
        System.out.println();
        System.out.print("출석일수를 입력하세요");
        int attendDate = ATTEND_DAYS;
        System.out.println();
        if(attendDate < MIN_COUNT || attendDate > MAX_COUNT) {
          System.out.println("입력값의 범위와 다릅니다.");
          break;
        } else {
          System.out.println("출석일 중 풀타임 수강횟수는? ");
          System.out.println(FULL_DAYS);

          scanner.nextLine();
          System.out.println("출석일 중 지각한 횟수는?");
          System.out.println(ATTEND_DAYS - FULL_DAYS); // int lateDays = ATTEND_DATE - fullTime; 실행 안되는 이유는,,?
        }

      } else if (name.equals("지각")) {
        System.out.print("지각 횟수를 입력해주세요: ");
        int lateDays = scanner.nextInt();
        scanner.nextLine();

        switch(lateDays) {
          case 0: case 1: case 2:
            System.out.println("결석처리 대상이 아닙니다");

          case 3: case 4: case 5:
            System.out.println("지각 3회당 결석 1회 처리됩니다.");
            break;

          case 6: case 7: case 8:
            System.out.println("2회 결석입니다.");
            break;

          case 9: case 10: case 11:
            System.out.println("3회 결석입니다.");
            break;
          default:
            System.out.println("12회 지각부터는 규정위반 횟수로 해당 수강생은 담당자와 면담하세요");    
        }

      } else if (name.equals("결과")) {
        // 지각으로 인한 결석 반영
        int sum = ATTEND_DAYS - (ATTEND_DAYS - FULL_DAYS) / 3;
        int result = (DAY_EARNING + FOOD_EXPENSE) * sum;
        System.out.println(result);


      }

      else {

        System.out.println("목록에 없는 이름입니다");

      }


      System.out.println();
    }

    scanner.close();
  }
}