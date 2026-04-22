import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Beverage> beverages;
    private ServiceType serviceType;

    public Order(ServiceType serviceType) {
        this.serviceType = serviceType;
        this.beverages = new ArrayList<>();
    }

    public void addBeverage(Beverage beverage) {
        beverages.add(beverage);
    }

    public double getTotal() {
        double total = 0;
        for (Beverage beverage : beverages) {
            total += beverage.getPrice();
        }
        return total;
    }

    public void printOrder() {
        System.out.println("Service Type: " + serviceType);
        System.out.println("Items:");
        for (Beverage beverage : beverages) {
            System.out.println("- " + beverage.getDescription() + " : $" + beverage.getPrice());
        }
        System.out.println("Total: $" + getTotal() + "\nThank you for shopping at Farmingdale Coffee Shop!");
    }
}