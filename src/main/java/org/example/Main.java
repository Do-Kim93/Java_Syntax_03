package org.example;


class Main {
    public static void main(String[] args) {
        //아래 코드들을 서술형으로 아주 상세하게 코드하나하나 변수 하나하나 자세하게 설명하기
        //1번 코드
//        int row = 8;
//
//        for(int i =1; i<=row; i++) {
//            for (int k = 1; k <= i; k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        //2번 코드
        int n = 10; // 아래 코드내용으로 봤을때 반복문들의 반복횟수 또는 시작값을 정해준다
        for(int i=1; i <= n; i++) {//i=1; i <= n; i++ 결국 10번 반복하겠다. 아래 작은 포문들이 몇번 돌던지 상관없이 10번은 무조건 돌리겠다.
            for(int j = i; j < n; j++) {//j=i i가 증가하면 j도 증가함 지금은 1, j < n; j++ j = i이고 i는 현재 1이니까 1 < 10 최대 9번 반복하겠다 그러니까 처음 돌리면 공백이 9칸찍힘 다음은 8칸
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i -1); k++){//중요한건 시작점의 수식 k <= (2*i-1) 여기서 k = 1이니까 i는 1이니까
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i= n-1; i >= 1; i--) {
            for(int k = n; k > i; k--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i -1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}