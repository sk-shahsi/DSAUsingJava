package com.binarySearch;

public class Test2 {
    public static int secondExample(int arr[],int targate){
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==targate){
                return mid;
            }
            if(arr[mid]<targate){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int input[]={1,5,9,10,15,17,19,20,50};
        int target=17;
        System.out.println(secondExample(input,target));
    }
}
