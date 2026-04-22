public class HotLatteFactory implements BeverageFactory {
    @Override
    public Beverage createBeverage() {
        return new Latte(false);
    }
}