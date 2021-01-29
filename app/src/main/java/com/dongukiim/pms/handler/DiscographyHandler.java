package com.dongukiim.pms.handler;

import java.sql.Date;
import com.dongukiim.util.Prompt;

public class DiscographyHandler {

  static class Discography {
    String artist;
    int no;
    String title;
    String hiddenTrack;
    Date releaseDate;
  }

  static final int SIZE = 100;

  MemberHandler memberList;

  static Discography[] discographies = new Discography[SIZE];
  static int count = 0;

  public void add() {
    System.out.println("[아티스트의 다른 디스코그래피 정보등록]");
    Discography d = new Discography();

    while(true) {
      String name = Prompt.inputString("아티스트 이름은?(취소: 빈 문자열) ");
      if(name.length() == 0) {
        System.out.println("디스코그래피 정보등록을 취소합니다.");
        return;
      }
      if(this.memberList.exist(name)) {
        d.artist = name;
        break;
      } else {
        System.out.println();
      }
    }

    d.no = Prompt.promptInt("몇 집 앨범: ");
    d.title = Prompt.inputString("타이틀 곡: ");
    d.hiddenTrack = Prompt.inputString("히든트랙: ");
    d.releaseDate = Prompt.promptDate("발표일: ");

    discographies[count++] = d;
  }

  public void show() {
    System.out.println("[등록된 아티스트의 다른 디스코그래피 살펴보기]");
    System.out.println("=================================================================");
    for(int i = 0; i < this.memberList.count; i++) {

      Discography d = discographies[i];
      String name = Prompt.inputString("아티스트 이름: ");

      if(name.equalsIgnoreCase(this.memberList.members[i].artist)) {
        System.out.printf("%s집 앨범, 타이틀곡: %s, 히든트랙: %s, 발표일: %s\n", 
            d.no, d.title, d.hiddenTrack, d.releaseDate);
        System.out.println("=================================================================");
      }
    }
    System.out.println("=================================================================");
  }

  public void detail() {
    System.out.println("[디스코그래피 상세보기]");


  }

}
