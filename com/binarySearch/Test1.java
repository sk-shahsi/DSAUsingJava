package com.binarySearch;

public class Test1 {
    public static int findtarget(int arr[], int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int middle=low+(high-low)/2;
            if(arr[middle] == target){
                return middle;
            }
            if(arr[middle]<target){
                low=middle+1;
            }
            if(arr[middle]>target){
                high=middle-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int input[]={1,5,9,10,15,17,19,20,50};
        int target=17;
        System.out.println(findtarget(input,target));
    }
}
