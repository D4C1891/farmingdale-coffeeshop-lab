public class CappuccinoFactory implements BeverageFactory {
    @Override
    public Beverage createBeverage() {
        return new Cappuccino();
    }
}