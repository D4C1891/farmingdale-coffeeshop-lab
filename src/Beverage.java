public interface Beverage {
    void setSize(Size size);
    void setMilk(Milk milk);
    void setShots(int shots);
    void setSweetener(Sweetener sweetener);

    String getName();
    double getPrice();
    String getDescription();
}