package SaturdayNov25.Arrays;

import java.util.Scanner;

public class ArrayExercise {
    public static void main(String[] args) {
        int [] ar = {2,5,2,4,32,5,23,53,23,6};
        int start = 0;
        int end = ar.length -1;


        for (int k : ar) {
            System.out.print(k + " ");
        }
        for (start = 0; start < end; start ++){
            int t = ar[start];
            ar[start] = ar[end];
            ar[end] = t;
            end--;
        }
        System.out.println();
        for (int j : ar) {
            System.out.print(j + " ");
        }
//We have declared num of array of 5 elements, we are taking input from user and storing elements in an array,
// second we are displaying an array
        int [] num = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of an array: ");
        for (int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }

        int [] ar2 = {45,10,25,56,48,47};
        int st = 0;
        int en = ar2.length-1;

        for (int l: ar2)
        {
            System.out.print(l + " ");
        }
        while(st < en){
            int g = ar2[st]; //empty glass (Temporary var) is gonna filed with array of start
            ar2[st] = ar2[en]; // array of start is now empty and going to get filled with array of end
            ar2[en] = g; // array of end is now empty and going to get filled in temporary variable g
            st++;
            en--;
        }
        System.out.println();
        for ( int na: ar2)
        {
            System.out.print(na + " ");
        }
//let's find the minimum and maximun element in an array
        //int [] ar2 = {45,10,25,56,48,47}; //we will use this array
        int min = ar2[0]; // we will define a variable minimum assign value of ar2 0th index
        int max = ar2[0]; //we will define a variable maximum assign value of ar2 0th index
        for(int i = 0; i < ar2.length; i++ ){
            if(ar2[i] < min){ //this condition is going to check if (i = 45 < min =45) <--False
                min = ar2[i]; //<--value here in the 1st iteration is 45
            }
            if(ar2[i] > max){ //since the condition is false, we will check if (i = 45 > min =45) <--False
                max = ar2[i]; // <--value here in the 1st iteration is 45
            }
        }
        System.out.println("Minmum element is: " + min);
        System.out.println("maximum element is: " + max);


    }
}
