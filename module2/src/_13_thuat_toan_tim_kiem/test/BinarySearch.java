package _13_thuat_toan_tim_kiem.test;

public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 73, 79};//key45
 public static int binarySeach(int[] arr, int key){
     int low=0;
     int high=arr.length-1;
     while (high>=low){
         int mid=(low+high)/2;
         if(key<arr[mid]){
             high=mid-1;
         }
         else if(key==arr[mid]){
             return mid;
         }else low

 }
     return low;
 }
}
