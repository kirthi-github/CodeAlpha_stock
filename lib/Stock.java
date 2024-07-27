package lib;

public class Stock {
    private String name;
    private double currentprice;

    public Stock(String name, double currentprice){
        this.name = name;
        this.currentprice = currentprice;
    }

    public String getName(){
        return name;
    }
    public double getCurrentPrice(){
        return currentprice;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCurrentPrice(double currentprice){
        this.currentprice = currentprice;
    }
    @Override
    public String toString() {
        return "Stock{name='" + name + "', currentPrice=" + currentprice + "}";
    }
}
