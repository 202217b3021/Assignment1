package productDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductDetails {
    private List<String> categories;
    private List<Products> products;
    private Scanner scanner;

    public ProductDetails() {
        scanner = new Scanner(System.in);
        categories = new ArrayList<>();
        products = new ArrayList<>();
        getProducts();
    }

    private void getProducts() {
        // Add categories
        categories.add("Beauty");
        categories.add("Electronics");
        categories.add("Fashion");
        categories.add("Mobiles");
        categories.add("Groceries");

        // Add products
        products.add(new Products("Groceries", "Fresh Cucumber", 09.00));
        products.add(new Products("Electronics", "Laptop", 140000.00));
        products.add(new Products("Beauty", "Renne Perfume",499.00));
        products.add(new Products("Beauty", "Body Lotion", 270.00));
        products.add(new Products("Fashion", "Women Fancy Banarasi Saree", 569.00));
        products.add(new Products("Mobiles", "Samsung Galaxy S23 Ultra G", 79999.00));
        products.add(new Products("Fashion", "Women High Slit dress", 799.00));
        products.add(new Products("Fashion", "Men Hoodie", 769.00));
        products.add(new Products("Groceries", "Amul Kaju Katri", 210.00));
        products.add(new Products("Mobiles", "iQOO Z9x G", 17999.00));
    }

    public Products getStoreProducts() {
        System.out.println("Product Categories:");
        for (String category : categories) {
            System.out.println("- " + category);
        }

        System.out.print("Select a category: ");
        String category = scanner.nextLine();
        boolean categoryFound = false;
        List<Products> selectedCatProducts = new ArrayList<>();

        for (String cat : categories) {
            if (cat.equalsIgnoreCase(category)) {
                categoryFound = true;
                System.out.println("Products in " + category + ":");
                for (Products product : products) {
                    if (product.getCategory().equalsIgnoreCase(category)) {
                        System.out.println(product.getProdName() + " - Rs " + product.getRate());
                        selectedCatProducts.add(product);
                    }
                }
                break;
            }
        }

        if (!categoryFound) {
            System.out.println("The given selected category is Invalid.");
            return null;
        }

        System.out.print("Select a product: ");
        String productName = scanner.nextLine();
        for (Products product : selectedCatProducts) {
            if (product.getProdName().equalsIgnoreCase(productName)) {
                return product;
            }
        }

        System.out.println("The given selected product is Invalid.");
        return null;
    }
}