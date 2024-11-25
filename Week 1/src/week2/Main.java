package week2;

public class Main {

    public static void main(String[] args) {
        day10Triangle TriangleA = new day10Triangle(15, 8, 15,8, 13);
        day10Triangle TriangleB = new day10Triangle(3, 2.598, 3,3, 3);

        double triangleAArea = TriangleA.findArea();
        System.out.println(triangleAArea);
    }
}
