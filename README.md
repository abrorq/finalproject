# finalproject

| WEEKS          | PROGRESS and CHANGES |
| -------------- | --------------       |
| Week 1 (April 1-7)| Working on Entites and structuring the code   |
| Week 2 (April 8 - 14)       | Creating csv file and try to figure out how to solve the issues of searching command  | 
| Week 3 (April 15 - 21)        | Trying to solve bugs on searching and DAO, created a GIT repostiory            |
| Week 4 (April 22 - 28)          | Working on the efficiency of my code results, working on price filters and controllers/services      |
| Week 5 (April 29 - May 5)          | Building unit test       |
| Week 6 (May 6 - May 12)          | Analyzing tests and working on bugs      |
| Week 7 (May 13 - May 19)          | Working on price filter, adding MIN and MAX options (minimum and maximum)   |
| Week 8 (May 20 - May 26)          | Studying and finding minor issues that should be sorted out and fixed in controllers       |
| Week 9 (May 27 - June 2 )          | In progress, no change  |
| Week 10 (June 3 - June 9)          | recording a video presention for my code, creating a report and submitting my repo to the platform      |

# Warehouse Application Report

This report provides an overview of the Warehouse Application project, which is focused on managing and searching for products in a warehouse. The project consists of a Java application that allows users to interact with the inventory and perform various operations.

## Project Details

- Repository: https://github.com/abrorq/finalproject.git

## Developer Information

- Developer: Abrorbek Qodirov
- Email: abrorbek_qodirov@student.itpu.uz

## Application Information

The Warehouse Application is designed to manage two categories of products: bed clothes and dishes. Users can perform the following operations through the application's menu:

1. **Search for bed clothes:** Allows users to search for bed clothes products based on keywords in the name or category.

2. **Search for dishes:** Enables users to search for dishes products based on keywords in the name or category.

3. **List all products:** Displays a list of all products in the inventory.

4. **Filter by price:** Allows users to filter products within a specific price range.

5. **Exit:** Terminates the application.

## Project Structure

The project is structured as follows:

- `Product` class: Represents a product with properties such as ID, name, category, price, and quantity.

- `WarehouseApplication` class: The main class that drives the application. It handles user input, displays the menu, and performs the desired operations on the inventory.

- `inventory` List: Stores the products in the inventory, which are read from CSV files.

- `readInventoryFromFile` method: Reads the inventory data from CSV files for both bed clothes and dishes.

- `searchProducts1` and `searchProducts2` methods: Enable searching for bed clothes and dishes, respectively, based on user input keywords.

- `filtered` method: Filters products based on a specified price range.

- `listAllProducts` method: Lists all products in the inventory.

## Usage

To use the Warehouse Application:

1. Ensure that Java is installed on your system.

2. Clone the repository from https://github.com/abrorq/finalproject.git

3. Compile and run the `WarehouseApplication` class.

4. Follow the instructions in the application menu to perform the desired operations.

## Conclusion

The Warehouse Application provides a simple yet effective way to manage and search for products in a warehouse. It allows users to interact with the inventory, search for specific products, and filter products based on price. The project serves as a foundation for further enhancements and improvements.

For any questions or inquiries, please contact Abrorbek Qodirov at abrorbek_qodirov@student.itpu.uz.
