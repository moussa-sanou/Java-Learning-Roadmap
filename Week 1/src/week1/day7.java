package week1;

public class day7 {

    // Create a function to calculate the total price of a meal with the following parameters mealPrice, tipRate and Tax
    public static void calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;

        System.out.println("Your total meal price is " + result);
    }

    public static void main(String[] args) {
        calculateTotalMealPrice(25, .2, .03);
        calculateTotalMealPrice(15, .35, .03);

    }
}
