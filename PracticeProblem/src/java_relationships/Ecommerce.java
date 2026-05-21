package java_relationships;

import java.util.ArrayList;

// Product Class
class Product {
    private int id;
    private String productName;
    private double pricePerUnit;

    public Product(int id, String productName, double pricePerUnit) {
        this.id = id;
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void showProduct() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + productName);
        System.out.println("Price Per Unit: " + pricePerUnit);
        System.out.println();
    }
}

// Customer Class
class Customer {
    private int userId;
    private String name;
    private String phoneNo;

    public Customer(int userId, String name, String phoneNo) {
        this.userId = userId;
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public int getUserId() {
        return userId;
    }

    public void registerUser() {
        System.out.println("Customer Registered Successfully");
    }

    public void showCustomerInfo() {
        System.out.println("\nCustomer Information:");
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
        System.out.println("Phone No: " + phoneNo);
    }
}

// ShoppingCart Class
class ShoppingCart {

    private int cartId;

    // Association with Customer
    private Customer customer;

    // Association with Product
    private ArrayList<Product> productList;

    public ShoppingCart(int cartId, Customer customer) {
        this.cartId = cartId;
        this.customer = customer;
        productList = new ArrayList<>();
    }

    public void createCart() {
        System.out.println("\nShopping Cart Created:");
        System.out.println("Cart ID: " + cartId);
        System.out.println("Customer ID: " + customer.getUserId());
    }

    public void addProduct(Product p) {
        productList.add(p);
    }

    public void showProducts() {

        System.out.println("\nProducts In Cart :");
        for (Product p : productList) {
            p.showProduct();
        }
    }

    public double getTotalPrice() {

        double total = 0;

        for (Product p : productList) {
            total += p.getPricePerUnit();
        }

        return total;
    }
}

// Payment Class
class Payment {

    private int paymentId;
    private double totalAmount;
    private String status;

    // Association with ShoppingCart
    private ShoppingCart cart;

    public Payment(int paymentId, ShoppingCart cart) {
        this.paymentId = paymentId;
        this.cart = cart;
        status = "Pending";
    }

    public void calculatePrice() {
        totalAmount = cart.getTotalPrice();
    }

    public void makePayment() {

        if (totalAmount > 0) {
            status = "Paid";
        } else {
            status = "Failed";
        }
    }

    public void showPaymentInfo() {

        System.out.println("\nPayment Information:");
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Payment Status: " + status);
    }
}

// Main Class
public class Ecommerce {

    public static void main(String[] args) {

        // Customer Object
        Customer c1 = new Customer(1, "Soniya", "01700000000");

        c1.registerUser();
        c1.showCustomerInfo();

        // ShoppingCart Object
        ShoppingCart cart = new ShoppingCart(101, c1);

        cart.createCart();

        // Product Objects
        Product p1 = new Product(1, "Mouse", 500);
        Product p2 = new Product(2, "Keyboard", 1200);
        Product p3 = new Product(3, "Monitor", 8000);

        // Add Products To Cart
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        // Show Products
        cart.showProducts();

        // Payment Object
        Payment payment = new Payment(9001, cart);

        payment.calculatePrice();
        payment.makePayment();

        payment.showPaymentInfo();
    }
}