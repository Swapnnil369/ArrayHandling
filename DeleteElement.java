package com.bridgelabz;

public class DeleteElement {
    public static void deleteElement(int[] a, int element) {
        for (int i = 0; i <a.length; i++) {
            if (element==a[i]){
                for (int j = i; j <a.length-1; j++) {
                    a[j]=a[j+1];
                }
                break;
            }
        }
        System.out.println("After delete element: ");
        for (int i = 0; i <a.length-1; i++) {
            System.out.print(a[i]+",");
        }
    }
    public static void main(String[] args) {
        int[] a={10,40,30,80,60,20};
        int element=30;
        System.out.println("Original element :");
        for (int i = 0; i <a.length; i++) {
            System.out.print(a[i]+",");
        }
        System.out.println();
        deleteElement(a,element);

    }
}
