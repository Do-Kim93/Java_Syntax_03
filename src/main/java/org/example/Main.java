package org.example;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[10];

        Article[] articles = new Article[10];

        Article article1 = new Article();
        articles[0] = article1;

        Article article2 = new Article();
        articles[1] = article2;

        System.out.println(articles[0].id);
        System.out.println(articles[1].id);

        System.out.println(article1.id);
        System.out.println(article2.id);
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