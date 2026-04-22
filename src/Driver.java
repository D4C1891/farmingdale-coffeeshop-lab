public class Driver {
    public static void main(String[] args) {

        Order order = new Order(ServiceType.TAKEOUT);

        BeverageFactory latteFactory = new IcedLatteFactory();
        Beverage latte = latteFactory.createBeverage();
        latte.setSize(Size.LARGE);
        latte.setMilk(Milk.OAT);
        latte.setShots(3);
        latte.setSweetener(Sweetener.STEVIA);

        BeverageFactory teaFactory = new HotTeaFactory();
        Beverage tea = teaFactory.createBeverage();
        tea.setSize(Size.SMALL);
        tea.setSweetener(Sweetener.HONEY);

        BeverageFactory CappuccinoFactory = new CappuccinoFactory();
        Beverage cappuccino = CappuccinoFactory.createBeverage();
        cappuccino.setSize(Size.MEDIUM);
        cappuccino.setMilk(Milk.WHOLE);
        cappuccino.setShots(2);
        cappuccino.setSweetener(Sweetener.NONE);

        BeverageFactory HotCoffeeFactory = new HotCoffeeFactory();
        Beverage HotCoffee = HotCoffeeFactory.createBeverage();
        HotCoffee.setSize(Size.LARGE);
        HotCoffee.setMilk(Milk.ALMOND);
        HotCoffee.setShots(1);
        HotCoffee.setSweetener(Sweetener.SUGAR);

        BeverageFactory CoffeeFactory = new IcedCoffeeFactory();
        Beverage IcedCoffee = CoffeeFactory.createBeverage();
        IcedCoffee.setSize(Size.LARGE);
        IcedCoffee.setMilk(Milk.SOY);
        IcedCoffee.setShots(1);
        IcedCoffee.setSweetener(Sweetener.STEVIA);

        BeverageFactory IcedTeaFactory = new IcedTeaFactory();
        Beverage IcedTea = IcedTeaFactory.createBeverage();
        IcedTea.setSize(Size.SMALL);

        BeverageFactory HotLatteFactory = new HotLatteFactory();
        Beverage HotLatte = HotLatteFactory.createBeverage();
        HotLatte.setSize(Size.MEDIUM);
        HotLatte.setMilk(Milk.OAT);

        order.addBeverage(latte);
        order.addBeverage(tea);
        order.addBeverage(cappuccino);
        order.addBeverage(HotCoffee);
        order.addBeverage(IcedCoffee);
        order.addBeverage(IcedTea);
        order.addBeverage(HotLatte);


        order.printOrder();
    }
}