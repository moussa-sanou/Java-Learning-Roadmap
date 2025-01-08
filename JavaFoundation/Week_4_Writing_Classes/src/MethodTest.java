public class MethodTest {
    public static void main(String[] args) {
        int i = 5;
        System.out.println("i = " + i);
            changeMe(i);
        System.out.println("i = " + i);
    }

    public static void changeMe(int num1){
        System.out.println("num1 = " + num1);
            num1 = 100;
        System.out.println("num1 = " + num1);
    }
}
