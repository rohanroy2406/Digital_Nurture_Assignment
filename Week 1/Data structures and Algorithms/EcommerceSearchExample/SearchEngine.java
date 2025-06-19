// File: SearchEngine.java
import java.util.Arrays;
import java.util.Comparator;

public class SearchEngine {

    // 🔎 Linear Search
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    // 🔎 Binary Search
    public static Product binarySearch(Product[] products, String targetName) {
        // Ensure sorted before binary search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            String midName = products[mid].productName.toLowerCase();

            if (midName.equals(targetName.toLowerCase())) {
                return products[mid];
            } else if (midName.compareTo(targetName.toLowerCase()) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
