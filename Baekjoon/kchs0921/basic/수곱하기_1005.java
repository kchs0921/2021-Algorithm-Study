package kchs0921.basic;

import java.util.Scanner;

public class 수곱하기_1005 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("양수를 입력해주세요: ");
    int num = in.nextInt();

    int sum = 0;
    for (int i=1; i<=num; i++) {
      sum += i;
    }
    System.out.println("총합: " + sum);
  }
}
