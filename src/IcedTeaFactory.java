public class IcedTeaFactory implements BeverageFactory {
    @Override
    public Beverage createBeverage() {
        return new Tea(true);
    }
}