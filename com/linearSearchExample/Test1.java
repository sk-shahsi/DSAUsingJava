package com.linearSearchExample;

public class Test1 {
    public static void main(String[] args) {
        int inputarr[] ={1,5,6,8,3,7,9};
        int target=40;
        System.out.println(findtargateElements(inputarr,target));
    }
    public static int findtargateElements(int arr[], int Targate){
        for(int i=0;i<arr.length;i++){
            if(arr[i] ==Targate){
                return i;
            }
        }
        return -1;
    }
}
