import java.util.Arrays;

public class SearchPlatforms {
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.getProductId() == targetId) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] sortedProducts, int targetId) {
        int left = 0;
        int right = sortedProducts.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midId = sortedProducts[mid].getProductId();

            if (midId == targetId) {
                return sortedProducts[mid];
            } else if (midId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] inventory = {
                new Product(105, "Wireless Mouse", "Electronics"),
                new Product(101, "Coffee Mug", "Kitchen"),
                new Product(109, "Mechanical Keyboard", "Electronics"),
                new Product(103, "Desk Mat", "Office")
        };

        System.out.println("--- Linear Search ---");
        Product result1 = linearSearch(inventory, 109);
        System.out.println("Searching for ID 109: " + (result1 != null ? result1 : "Not Found"));

        Product[] sortedInventory = Arrays.copyOf(inventory, inventory.length);
        Arrays.sort(sortedInventory);

        System.out.println("\n--- Binary Search ---");
        Product result2 = binarySearch(sortedInventory, 109);
        System.out.println("Searching for ID 109: " + (result2 != null ? result2 : "Not Found"));
    }
}