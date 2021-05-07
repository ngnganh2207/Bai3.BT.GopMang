package com.company;
import java.util.Scanner;

public class Main {
    public static int[] gopMang(int[] arr1,int[] arr2){
        int newArr[]= new int[arr1.length+ arr2.length];
        for(int i=0;i<arr1.length;i++){
            newArr[i]=arr1[i];
        }
        for(int j=arr1.length;j<(arr1.length+arr2.length);j++){
            newArr[j]=arr2[j-(arr1.length)];
        }
        return newArr;
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] arr1= new int[4];
        System.out.println("Nhập phần tử vào mảng thứ nhất kích thước là 4");
        for (int i=0;i<arr1.length;i++){
            arr1[i]= scanner.nextInt();
        }
        int[] arr2= new int[6];
        System.out.println("Nhập phần tử vào mảng thứ hai kích thước là 6");
        for( int i=0;i< arr2.length;i++){
            arr2[i]=scanner.nextInt();
        }
        int[] newArr=gopMang(arr1,arr2);
        for (int element:
             newArr) {
            System.out.println(element+ " ");
        }
    }
}
