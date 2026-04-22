public class Cappuccino extends BaseBeverage {

    public Cappuccino() {
        super();
        this.shots = 1;
    }

    @Override
    public String getName() {
        return "Cappuccino";
    }

    @Override
    public double getPrice() {
        double price = 4.25;

        if (size == Size.MEDIUM) price += 0.50;
        if (size == Size.LARGE) price += 1.00;

        if (milk != Milk.NONE) price += 0.50;
        if (shots > 1) price += (shots - 1) * 0.75;
        if (sweetener != Sweetener.NONE) price += 0.20;

        return price;
    }
}