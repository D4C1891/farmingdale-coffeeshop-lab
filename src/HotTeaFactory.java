public class HotTeaFactory implements BeverageFactory {
    @Override
    public Beverage createBeverage() {
        return new Tea(false);
    }
}