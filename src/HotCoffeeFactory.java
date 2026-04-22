public class HotCoffeeFactory implements BeverageFactory {
    @Override
    public Beverage createBeverage() {
        return new Coffee(false);
    }
}