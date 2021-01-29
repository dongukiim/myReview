package com.dongukiim.pms.handler;

import java.sql.Date;
import com.dongukiim.util.Prompt;

public class MemberHandler {

  static class Member {
    String artist;
    String name;
    String genre;
    Date releaseDate;
    int price;
  }

  static final int SIZE = 100;
  Member[] members = new Member[SIZE];
  int count = 0;


  static String[] artist = new String[SIZE];
  static String[] name = new String[SIZE];
  static String[] genre = new String[SIZE];
  static Date[] releaseDate = new Date[SIZE];
  static int[] price = new int[SIZE];


  public void add() {

    Member m = new Member();

    System.out.println("================================================");

    System.out.println("[LP정보등록]");
    System.out.println();
    m.artist = Prompt.inputString("아티스트: ");
    m.name = Prompt.inputString("제목: ");
    m.genre = Prompt.inputString("장르: ");
    m.releaseDate = Prompt.promptDate("발매일: ");
    m.price = Prompt.promptInt("발매가(원): ");

    System.out.println("================================================");

    this.members[this.count++] = m;

  }

  public void list() {
    System.out.println("=========================================================================");
    System.out.println("[등록조회]");
    for(int i = 0; i < this.count; i++) {
      Member m = this.members[i];
      System.out.printf("[아티스트: %s] / [제목: %s] / [장르: %s] / [발매일: %s] / [발매가: %d]\n", 
          m.artist, m.name, m.genre, m.releaseDate, m.price);
    }
    System.out.println("=========================================================================");
  }

  public boolean exist(String name) {
    for(int i = 0; i < this.count; i++) {
      if(name.equalsIgnoreCase(this.members[i].name)) {
        return true;
      } 
    } 
    return false;
  }

}
