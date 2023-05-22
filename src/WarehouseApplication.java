import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Product {
    private final int id;
    private final String name;
    private final String category;
    private final double price;
    private final int quantity;

    public Product(int id, String name, String category, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {

        return name;
    }

    public String getCategory() {

        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

public class WarehouseApplication {
    private final List<Product> inventory;
    private final Scanner scanner;

    public WarehouseApplication() {
        inventory = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void run() {
        displayApplicationInfo();
        readInventoryFromFile();

        String choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1" -> searchProducts1();
                case "2" -> searchProducts2();
                case "3" -> listAllProducts();
                case "4" -> System.out.println("Exiting application...");
                default -> System.out.println("Invalid choice, please try again.");
            }
            System.out.println();
        } while (!choice.equals("4"));
    }

    private void displayApplicationInfo() {
        System.out.println("Warehouse Application - BedClothes and Dishes");
        System.out.println("IT Park University - 1.0, Created on: [05.01.2023]");
        System.out.println("Developer: Abrorbek Qodirov, email: abrorbek_qodirov@student.itpu.uz");
    }

    private void displayMenu() {
        System.out.println("Available commands:");
        System.out.println("1. Search for bed clothes");
        System.out.println("2. Search for dishes");
        System.out.println("3. List all products");
        System.out.println("4. Exit");
    }

    private void readInventoryFromFile() {
        try {
            File file = new File("src/inventory.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String category = data[2];
                double price = Double.parseDouble(data[3]);
                int quantity = Integer.parseInt(data[4]);

                Product product = new Product(id, name, category, price, quantity);
                inventory.add(product);
            }

            System.out.println((long) inventory.size());

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: Inventory file not found.");
        }
    }

    private void searchProducts1() {
        System.out.print("Enter search keyword for Bed Clothes: ");
        String keyword = scanner.nextLine().toLowerCase();

        List<Product> matchingProducts = new ArrayList<>();
        for (Product product : inventory) {
            if (product.getName().toLowerCase().contains(keyword) ||
                    product.getCategory().toLowerCase().contains(keyword)) {
                matchingProducts.add(product);
            }
        }

        if (!matchingProducts.isEmpty()) {
            System.out.println("Matching products:");
            for (Product product : matchingProducts) {
                System.out.println(product);
            }
        } else {
            System.out.println("No products found matching the search criteria.");
        }
    }

    private void searchProducts2() {
        System.out.print("Enter search keyword: ");
        String keyword = scanner.nextLine().toLowerCase();

        List<Product> matchingProducts = new ArrayList<>();
        for (Product product : inventory) {
            if (product.getName().toLowerCase().contains(keyword) ||
                    product.getCategory().toLowerCase().contains(keyword)) {
                matchingProducts.add(product);
            }
        }

        if (!matchingProducts.isEmpty()) {
            System.out.println("Matching products:");
            for (Product product : matchingProducts) {
                System.out.println(product);
            }
        } else {
            System.out.println("No products found matching the search criteria.");
        }
    }

    private void listAllProducts() {
        System.out.println("Here is the list of all products: ");



        if (!inventory.isEmpty()) {
            for (Product product : inventory) {
                System.out.println(product);
            }
        } else {
            System.out.println("Inventory is empty.");
        }
    }

    public static void main(String[] args) {
        WarehouseApplication application = new WarehouseApplication();
        application.run();
    }
}