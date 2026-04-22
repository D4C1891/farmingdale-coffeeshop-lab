public abstract class BaseBeverage implements Beverage {
    protected Size size;
    protected Milk milk;
    protected int shots;
    protected Sweetener sweetener;

    public BaseBeverage() {
        this.size = Size.MEDIUM;
        this.milk = Milk.NONE;
        this.shots = 0;
        this.sweetener = Sweetener.NONE;
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void setMilk(Milk milk) {
        this.milk = milk;
    }

    @Override
    public void setShots(int shots) {
        this.shots = shots;
    }

    @Override
    public void setSweetener(Sweetener sweetener) {
        this.sweetener = sweetener;
    }

    @Override
    public String getDescription() {
        return getName() +
                " [" + size +
                ", Milk: " + milk +
                ", Shots: " + shots +
                ", Sweetener: " + sweetener + "]";
    }
}