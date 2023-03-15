public class Main {
    public static int countVariants(int stairsCount) {//method to count variants to cover n stairs while taking 1 or 2 steps at once
        if (stairsCount <= 1) {//if amount of  stairs is 1 or 0 there is only one way to cover it taking 1 or 0 step
            return 1;
        }
        int[] variants = new int[stairsCount + 1];
        variants[0] = 1;//covering 0 stair takes 1 step
        variants[1] = 1;//covering 1 stair takes 1 step
        for (int i = 2; i <= stairsCount; i++) {
            variants[i] = variants[i - 1] + variants[i - 2];//algorithm to use previous variants for i to count variants for next int
        }
        return variants[stairsCount];//return amount of variants
    }

    public static void main(String[] args) {
        System.out.println(countVariants(5));//print value
        System.out.println(countVariants(10));//print value
    }
}