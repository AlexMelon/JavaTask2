import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Product[] product = new Product[5];

        for (int i = 0; i < 5; i++) {
            int pId = scanner.nextInt();

            double price = scanner.nextDouble();

            int quantity = scanner.nextInt();

            product[i] = new Product(pId, price, quantity);

        }

        for (Product products : product) {
            System.out.println(products);
        }

        // Calculate and display the total amount spent
        double totalAmount = calculateTotalAmount(product);
        System.out.println("\nTotal Amount Spent on All Products: " + totalAmount);

        // Close the Scanner
        scanner.close();
    }

    public static double calculateTotalAmount(Product[] products) {
        double total = 0.0;

        for (Product product : products) {
            total += product.getPrice() * product.getQuantity();
        }

        return total;
    }
}