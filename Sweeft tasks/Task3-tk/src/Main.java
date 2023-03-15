public class Main {
    public static int notContains(int[] array) {
        //sorting algorithm to sort array
        for (int i = 0; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[k] < array[i]) {
                    int temp = array[k];
                    array[k] = array[i];
                    array[i] = temp;
                }
            }
        }
        int missingMinimum = 1;//assign missing  int to be 1
        for (int num : array) {//loop through the array and update the smallest missing int
            if (num <= missingMinimum) {
                missingMinimum = num + 1;
            }
        }
        return missingMinimum;//return the smallest missing int which is greater than zero
    }
    public static void main(String[] args) {
        int[] arr={4,5,3,9,1,2,8,5,6,7};//sample array
        int[] array={2,3,5,0,7};//sample array 2
        System.out.println(notContains(arr));//print value
        System.out.println(notContains(array));//print value
    }
}