package DataStractures.PlacementPrepration.Array;

import java.util.List;

public class LeaderInAnArray {
    public static void main(String[] args) {

        int[] arr = new int[]{16, 17, 4, 3, 5, 2};
        List<Integer> leader = leaderInArray(arr , arr.length);
        System.out.println(leader);
    }
    public static List<Integer> leaderInArray(int[] arr , int size)
    {
        List<Integer> myList = new java.util.ArrayList<>();
        int max = 0;
        for(int i = size - 1; i >= 0; i--)
        {
            if(max >= arr[i]){
                max = arr[i];
                myList.add(max);
            }
        }
        return myList;
    }
}
