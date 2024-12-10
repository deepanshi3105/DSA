package Basics;

import java.util.Arrays;
public class Deletion{
    public static void main(String[]args){
        int []arr={10,20,30,35,40,50};
        int index=3;
        int n=arr.length;

        int newArr[]=new int[n-1];

        for(int i=0;i<index;i++){
            newArr[i]=arr[i];
        }
        for(int i=index+1;i<n;i++){
            newArr[i-1]=arr[i];
    }
    System.out.println(Arrays.toString(newArr));
}
}