public class Main {
    //method to return sum of two binary string
    public static String binaryAddition(String a,String b){
        int intValueOfA=Integer.parseInt(a,2);//get integer value of first binary string
        int intValueOfB=Integer.parseInt(b,2);//get integer value of second binary string
        int sum=intValueOfA+intValueOfB;//get integer sum
        return Integer.toBinaryString(sum);//convert int sum to binary and return it as binary string
    }

    public static void main(String[] args) {
        String a="1010";//first binary string
        String b="1011";//second binary string
        System.out.println(binaryAddition(a,b));//print value

    }
}