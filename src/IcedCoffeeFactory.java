public class IcedCoffeeFactory implements BeverageFactory {
    @Override
    public Beverage createBeverage() {
        return new Coffee(true);
    }
}