public class MaxandMin {
    public static void main(String[] args) {
        int []numArray = ArrayUtility.inputArray();
        System.out.println("Maximum value in array : " + maxArray(numArray));
        System.out.println("Minimum value in array : " + minArray(numArray));

    }
    public static int maxArray(int []numArray){
        int max = -100000;
        int i = 0;
        while (i < numArray.length){
            if (numArray[i] > max){
                max = numArray[i];
            }
            i++;
        }

        return max;
    }

    public static int minArray(int []numArray){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < numArray.length)
        {
            if (numArray[i] < min){
                min = numArray[i];
            }
            i++;
        }
        return min;
    }
}
