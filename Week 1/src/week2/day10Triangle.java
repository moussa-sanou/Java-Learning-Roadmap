package week2;

public class day10Triangle {
    // After creating the triangle class we need to add its attributes
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    // Create a constructor
    public day10Triangle(double base, double height, double sideLenOne,
                         double sideLenTwo, double sideLenThree ){
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    public double findArea(){
        return (this.base * this.height) / 2;
    }
}
