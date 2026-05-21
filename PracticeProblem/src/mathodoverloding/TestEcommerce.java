package mathodoverloding;

class Ecommerce {

    void filterProducts(String category) {
        System.out.println("Searching products in category: " + category);
    }

    void filterProducts(int minPrice, int maxPrice) {
        System.out.println("Searching products between price range: $" + minPrice + " - $" + maxPrice);
    }

    void filterProducts(String brand, boolean isBrandSearch) {
        System.out.println("Searching products of brand: " + brand);
    }

    void filterProducts(String category, int minPrice, int maxPrice) {
        System.out.println("Searching " + category + " products between $" + minPrice + " - $" + maxPrice);
    }

    void filterProducts(String category, int minPrice, int maxPrice, String brand) {
        System.out.println("Searching " + category + " products of brand " + brand +
                " between $" + minPrice + " - $" + maxPrice);
    }
}

public class TestEcommerce {
    public static void main(String[] args) {

        Ecommerce e = new Ecommerce();

        e.filterProducts("electronics");
        e.filterProducts(100, 500);
        e.filterProducts("Nike", true);
        e.filterProducts("fashion", 50, 300);
        e.filterProducts("electronics", 200, 1000, "Apple");
    }
}