package org.example;
//(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
//자릿수마다 곱해서 더하는 과정을 다 출력하기이다.
//10으로 나눈 나머지를 이용하면 마지막 값을 뺄수있음 그걸이용
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//정수형 변수 a 에 스캐너의 nextInt() 매서드 리턴값을 저장 당연히 int형으로 나옴
        int b = sc.nextInt();//정수형 변수 b 에 스캐너의 nextInt() 매서드 리턴값을 저장 당연히 int형으로 나옴

        int c = b%10;//b를 10으로 나눈후 나오는 나머지값을 c에 저장
        int d = b/10%10;//b를 10으로 나눈 몫을 다시 10으로 나눈 나머지를 d에 저장
        int e = b/100;//b를 100으로 나눈 몫을 e에 저장

        System.out.println(a*c);//a에 c를 곱한값을 출력
        System.out.println(a*d);//a에 d를 곱한값을 출력
        System.out.println(a*e);//a에 e를 곱한값을 출력
        System.out.println(a*b);//a에 b를 곱한값을 출력
    }
}
//이 문제는 나누기 몫과 나머지 값을 활용 해 일의자리수를 빼내고 10의 자리수를 빼내는 문제 였다.
//int c = b%10; 이부분을 살펴보면 10으로 나눈 나머지 값을 활용하는데 어떠한 자연수든 10으로 나누면 일의자리만 나머지로 나온다는 점을 이용한 코드이다.
//위 코드를 응용하면 십의 자리 이상의 수에서 십의 자리만 뽑아내는것이 가능한데 우선 임의의 십의 자리수를 10으로 나누고 그 몫을 다시 10으로 나눠서 나머지를 이용하면된다.
//이문제에서는 100의 자리라고 정해져 있어서 나누기 100을 사용했다. 입력받은 백의 자리수를 100으로 나눈 몫이 100의 자리에 해당하는 값이기 때문이다.