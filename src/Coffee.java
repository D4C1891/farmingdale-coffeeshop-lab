public class Coffee extends BaseBeverage {

    private final boolean iced;

    public Coffee(boolean iced) {
        super();
        this.iced = iced;
    }

    @Override
    public String getName() {
        return iced ? "Iced Coffee" : "Hot Coffee";
    }

    @Override
    public double getPrice() {
        double price = 2.50;

        if (size == Size.MEDIUM) price += 0.50;
        if (size == Size.LARGE) price += 1.00;

        if (milk != Milk.NONE) price += 0.30;
        if (sweetener != Sweetener.NONE) price += 0.20;

        return price;
    }
}