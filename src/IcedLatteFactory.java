public class IcedLatteFactory implements BeverageFactory {
    @Override
    public Beverage createBeverage() {
        return new Latte(true);
    }
}