package DataStractures.PlacementPrepration.Array;

public class Sort0s1s {
    public static void main(String[] args) {
        
        int[] arr = new int[]{6, 3, 2, 4, 1, 7, 1, 5};
        int duplicate = findingDuplicate(arr);
        System.out.println(duplicate);
    }
    public static int findingDuplicate(int[] arr){
        int[] ans = new int[] {0 , 0 ,0, 0, 0,0,0,0};
        int temp = 0;
        for(int i = 0; i < 8; i++){
            temp = arr[i];
            ans[temp]++;
            if(arr[temp] > 1){
                return temp;
            }
        }
        return -1;
    }
}
