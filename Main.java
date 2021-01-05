package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int n=sc.nextInt();
        double score[]=new double[n];
        for (int i=0; i<n; i++){
            System.out.print("Enter number of Students " + (i+1) + " : ");
            score[i]=sc.nextDouble();
        }
        for (int i=0; i<n; i++){
            System.out.println("student " + (i+1) + " :  "+ score[i]);
        }
        for (int i=0; i<n; i++){
            sum+=score[i];
        }
        System.out.println("Average is : " + (sum/n));
    }
}
