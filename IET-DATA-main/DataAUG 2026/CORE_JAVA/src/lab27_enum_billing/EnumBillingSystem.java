package lab27_enum_billing;

import java.util.Scanner;

/**
 * Lab 27: Enum Concept & Menu Driven Restaurant Billing System.
 * Run command: java -cp bin lab27_enum_billing.EnumBillingSystem
 */
enum MenuItem {
    COFFEE("Coffee", 50.0),
    TEA("Tea", 30.0),
    MAGGI("Maggi", 60.0),
    PIZZA("Pizza", 200.0),
    SANDWICH("Sandwich", 100.0);

    private final String displayName;
    private final double basePrice;

    MenuItem(String displayName, double basePrice) {
        this.displayName = displayName;
        this.basePrice = basePrice;
    }

    public String getDisplayName() { return displayName; }
    public double getBasePrice() { return basePrice; }
}

enum Size {
    SMALL("Small", 1.0),
    MEDIUM("Medium", 1.25),
    LARGE("Large", 1.5);

    private final String sizeLabel;
    private final double priceMultiplier;

    Size(String sizeLabel, double priceMultiplier) {
        this.sizeLabel = sizeLabel;
        this.priceMultiplier = priceMultiplier;
    }

    public String getSizeLabel() { return sizeLabel; }
    public double getPriceMultiplier() { return priceMultiplier; }
}

public class EnumBillingSystem {

    public static void displayMenu() {
        System.out.println("\n+--------------------------------------------------+");
        System.out.println("|              RESTAURANT MENU LIST                |");
        System.out.println("+--------------------------------------------------+");
        MenuItem[] items = MenuItem.values();
        for (int i = 0; i < items.length; i++) {
            System.out.printf("| %d. %-15s | Base Price: $%-12.2f |\n", 
                              (i + 1), items[i].getDisplayName(), items[i].getBasePrice());
        }
        System.out.println("+--------------------------------------------------+");
    }

    public static void displaySizes() {
        System.out.println("\nSelect Portion Size:");
        Size[] sizes = Size.values();
        for (int i = 0; i < sizes.length; i++) {
            System.out.printf(" %d. %-8s (Multiplier: %.2fx)\n", 
                              (i + 1), sizes[i].getSizeLabel(), sizes[i].getPriceMultiplier());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("        ENUM RESTAURANT BILLING SYSTEM            ");
        System.out.println("==================================================");

        displayMenu();
        System.out.print("Select Menu Item (1-5): ");
        int itemChoice = scanner.nextInt();

        if (itemChoice < 1 || itemChoice > MenuItem.values().length) {
            System.out.println("Invalid Menu Choice! Exiting.");
            scanner.close();
            return;
        }
        MenuItem selectedItem = MenuItem.values()[itemChoice - 1];

        displaySizes();
        System.out.print("Select Size (1-3): ");
        int sizeChoice = scanner.nextInt();

        if (sizeChoice < 1 || sizeChoice > Size.values().length) {
            System.out.println("Invalid Size Choice! Exiting.");
            scanner.close();
            return;
        }
        Size selectedSize = Size.values()[sizeChoice - 1];

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        if (quantity <= 0) {
            System.out.println("Quantity must be greater than 0!");
            scanner.close();
            return;
        }

        double itemPricePerUnit = selectedItem.getBasePrice() * selectedSize.getPriceMultiplier();
        double totalAmount = itemPricePerUnit * quantity;

        System.out.println("\n==================================================");
        System.out.println("                 FINAL ITEM BILL                  ");
        System.out.println("==================================================");
        System.out.printf(" Selected Item   : %s\n", selectedItem.getDisplayName());
        System.out.printf(" Base Unit Price : $%.2f\n", selectedItem.getBasePrice());
        System.out.printf(" Portion Size    : %s (x%.2f)\n", selectedSize.getSizeLabel(), selectedSize.getPriceMultiplier());
        System.out.printf(" Effective Price : $%.2f / unit\n", itemPricePerUnit);
        System.out.printf(" Quantity        : %d\n", quantity);
        System.out.println("--------------------------------------------------");
        System.out.printf(" TOTAL AMOUNT    : $%.2f\n", totalAmount);
        System.out.println("==================================================");

        scanner.close();
    }
}
