// File: Main.java
public class Main {
    public static void main(String[] args) {
        Product[] catalog = {
            new Product(101, "Laptop", "Electronics"),
            new Product(202, "Shirt", "Clothing"),
            new Product(303, "Book", "Stationery"),
            new Product(404, "Phone", "Electronics"),
            new Product(505, "Mug", "Kitchen")
        };

        String searchName = "Phone";

        // 🔍 Linear Search
        Product resultLinear = SearchEngine.linearSearch(catalog, searchName);
        System.out.println("Linear Search Result: " + (resultLinear != null ? resultLinear : "Not Found"));

        // 🔍 Binary Search
        Product resultBinary = SearchEngine.binarySearch(catalog, searchName);
        System.out.println("Binary Search Result: " + (resultBinary != null ? resultBinary : "Not Found"));
    }
}
