package algorithm.Recursion;

import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {
        System.out.println();
        func(4);
    }

    public static void func(int n) {
        if (n<=0) {
            return;
        } else {
            System.out.println("Hello...");
            func(n-1);
        }
    }

    // 팩토리얼
    public static int factorial(int n) {
        if (n==0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    // 거듭제곱
    public static double power(double x, int n) {
        if (n==0) {
            return 1;
        } else {
            return x * power(x, n-1);
        }
    }

    // 피보나치 수열
    public static int fibonacci(int n) {
        if (n<2) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    // 최대 공약수
    public static double gcd(int m, int n) {
        if (m<n) {
            int tmp=m;
            m=n;
            n=tmp;
        }

        if (m%n==0) {
            return n;
        } else {
            return gcd(n, m%n);
        }
    }

    // 문자열 길이 계산
    public static int length(String str) {
        if (str.equals("")) {
            return 0;
        } else {
            return 1+length(str.substring(1));
        }
    }

    // 문자열 출력
    public static void printChars(String str) {
        if (str.length()==0) {
            return;
        } else {
            System.out.print(str.charAt(0));
            printChars(str.substring(1));
        }
    }

    // 문자열을 뒤집어서 출력
    public static void printCharsReverse(String str) {
        if (str.length()==0) {
            return;
        } else {
            printCharsReverse(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }

    // 2진수로 변환하여 출력
    public void printInBinary(int n) {
        if (n<2) {
            System.out.print(n);
        } else {
            printInBinary(n/2);
            System.out.print(n%2);
        }
    }

    // 배열의 합 구하기
    public static int sum(int n, int[] data) {
        if (n<=0) {
            return 0;
        } else {
            return sum(n-1, data) + data[n-1];
        }
    }

    // 데이터파일로 부터 n개의 정수 읽어오기
    public void readFrom(int n, int[] data, Scanner in) {
        if (n==0) {
            return;
        } else {
            readFrom(n-1, data, in);
            data[n-1] = in.nextInt();
        }
    }



}
