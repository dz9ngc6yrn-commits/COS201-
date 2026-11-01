import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Item Cost Calculator ===");
        System.out.print("Enter the name of the item: ");
        String itemName = input.nextLine();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter the cost per item: ");
        double unitCost = input.nextDouble();

        if (quantity < 0 || unitCost < 0) {
            System.out.println("Quantity and unit cost cannot be negative.");
        } else {
            double totalCost = quantity * unitCost;
            System.out.println("Item: " + itemName);
            System.out.println("Quantity: " + quantity);
            System.out.printf("Unit cost: %.2f%n", unitCost);
            System.out.printf("Total cost: %.2f%n", totalCost);
        }

        input.close();
    }
}
