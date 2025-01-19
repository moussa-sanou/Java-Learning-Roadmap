/* ...CONSTRUCTOR...*/
// A constructor is a special method which can be used to initialize an object data

public class Circle {

    double radius;
    Circle(double r){
        radius = r;
        System.out.println("Circle (" + radius +")");
    }
    Circle(){
        radius = 5.0;
        System.out.println("Circle (" + radius + ")");
    }
    double findArea(){
        return radius * radius * Math.PI;
    }
    double findCircumference(){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle(10);


    }

}
