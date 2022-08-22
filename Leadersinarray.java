//Given an array A of positive integers. Your task is to find the leaders in the array.
//  An element of array is leader if it is greater than or equal to all the elements to its right side.
// The rightmost element is always a leader.
//  Example 1:
//   Input:
//    n = 6
//    A[] = {16,17,4,3,5,2}
//    Output: 17 5 2
//    Explanation: The first leader is 17
//    as it is greater than all the elements
//    to its right.  Similarly, the next
//    leader is 5. The right most element
//    is always a leader so it is also
//    included.

public class Leadersinarray {
    static ArrayList<Integer> Leader(int[] arr,n) {//n=length of array
       ArrayList<Integer> list=new ArrayList<Integer>();
       int max=arr[n-1];
       for(int i=n-1;i>=0;i--){
           if(arr[i]>=max){
               list.add(arr[i]);
               max=arr[i];
           }
       }
       Collections.reverse(list);//use to reverse arraylist
       return list;
    }
}