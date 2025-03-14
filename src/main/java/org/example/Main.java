package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        v2();
//        v1(); 이게 배열사용버전
    }
    static void v2() {
        System.out.println("==v2==");
        ArrayList articles = new ArrayList();
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());

        for(int i = 0; i < articles.size(); i++){
            Article article = (Article) articles.get(i);//강제 형변환 해줘야함
            System.out.println(article.id);
        }
    }
    static void v1() {
        System.out.println("===v1===");
        int[] arr = new int[10];
        Article[] articles = new Article[10];
        int articlesSize = 0;
        articles[0] = new Article();
        articlesSize++;
        articles[1] = new Article();
        articlesSize++;
        articles[2] = new Article();
        articlesSize++;

        for (int i = 0; i < articlesSize; i++)
            System.out.println(articles[i].id);
    }
}

class Article {
    static int lastId; //클래스변수 모든 인스턴스가 공유함 이친구는 클래스내부에 존재함 객체 생성과 상관없음

    int id;//인스턴스변수 인스턴스변수는 각객체 내부에 존재함
    String regDate;

    static {//스택틱 변수는 스태틱 생성자로 만들어야함.
        lastId = 0;
    }

    Article() {
        this(lastId+1 , "03-14");//생성자 안에서 다른 생성자 호출(실행), Constructor Call
        lastId++;//생성자 안에서 다른 생성자를 호출하려면 무조건 첫줄에 있어야함
    }

    Article(int id, String regDate) {
        this.id = id;
        this.regDate = regDate;
    }
}