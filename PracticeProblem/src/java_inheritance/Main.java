package java_inheritance;

class Restaurant {
    double taxRate = 0.10; 

    int estimateDeliveryTime() {
        return 40; 
    }

    double calculateTotalBill(double foodPrice) {
        double tax = foodPrice * taxRate;
        return foodPrice + tax;
    }
}

class FastFoodRestaurant extends Restaurant {

    @Override
    int estimateDeliveryTime() {
        return 20;
    }

    @Override
    double calculateTotalBill(double foodPrice) {
        double tax = foodPrice * 0.15; 
        return foodPrice + tax;
    }
}

class FineDiningRestaurant extends Restaurant {

    @Override
    int estimateDeliveryTime() {
        return 60;
    }

   
}

public class Main {
    public static void main(String[] args) {

        double foodPrice = 1000;

        Restaurant normal = new Restaurant();
        FastFoodRestaurant fast = new FastFoodRestaurant();
        FineDiningRestaurant fine = new FineDiningRestaurant();

        System.out.println("BILL DETAILS ");

        System.out.println("Normal Restaurant Bill: " +
                normal.calculateTotalBill(foodPrice));
        System.out.println("Fast Food Restaurant Bill: " +
                fast.calculateTotalBill(foodPrice));
        System.out.println("Fine Dining Restaurant Bill: " +
                fine.calculateTotalBill(foodPrice));

        System.out.println("\n DELIVERY TIME ");

        System.out.println("Normal: " + normal.estimateDeliveryTime() + " mins");
        System.out.println("Fast Food: " + fast.estimateDeliveryTime() + " mins");
        System.out.println("Fine Dining: " + fine.estimateDeliveryTime() + " mins");
    }
}