package minhhoanoibot;

import java.util.Scanner;

public class MinhHoaNoiBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao kich thuoc mang: ");
        int size = sc.nextInt();
        int list[] = new int[size];
        System.out.println("Nhap vao gia tri cho mang: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        System.out.println("Mang la: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        bubbleSortByStep(list);

    }

    public static void bubbleSortByStep(int list[]) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    System.out.println("Swap" + list[i] + "voi" + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
            if (needNextPass = false) {
                System.out.println("Mang co the sap xep va khong can qua");
                break;
        }
            System.out.println("List sau cung la" + k + "sort: ");
            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i]+"\t");
            }
            System.out.println();
        }
    }
}
