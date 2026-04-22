public class Tea extends BaseBeverage {

    private final boolean iced;

    public Tea(boolean iced) {
        super();
        this.iced = iced;
    }

    @Override
    public String getName() {
        return iced ? "Iced Tea" : "Hot Tea";
    }

    @Override
    public double getPrice() {
        double price = 2.00;

        if (size == Size.MEDIUM) price += 0.40;
        if (size == Size.LARGE) price += 0.80;

        if (sweetener != Sweetener.NONE) price += 0.20;

        return price;
    }
}