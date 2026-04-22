public class Latte extends BaseBeverage {

    private final boolean iced;

    public Latte(boolean iced) {
        super();
        this.iced = iced;
        this.shots = 1;
    }

    @Override
    public String getName() {
        return iced ? "Iced Latte" : "Hot Latte";
    }

    @Override
    public double getPrice() {
        double price = 4.00;

        if (size == Size.MEDIUM) price += 0.50;
        if (size == Size.LARGE) price += 1.00;

        if (milk != Milk.NONE) price += 0.50;
        if (shots > 1) price += (shots - 1) * 0.75;
        if (sweetener != Sweetener.NONE) price += 0.20;

        return price;
    }
}