package study;

import java.util.Scanner;

public class e2739 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i=1;i<=9;i++){
            System.out.println(number + " * " +i+" = "+(number*i));
        }
    }
}
