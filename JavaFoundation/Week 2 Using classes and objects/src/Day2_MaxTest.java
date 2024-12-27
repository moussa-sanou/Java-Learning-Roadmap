public class Day2_MaxTest {

    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i, j); // invoke max method
        System.out.println("max(" + i + "," + j + ") =" + k);
    }

    public static int max (int num1, int num2){
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;
        return result;
    }
}
