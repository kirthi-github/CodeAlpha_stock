package lib;

public class Portfolioitem {

    private Stock stock;
    private int quantity;
    private double purchaseprice;

    public Portfolioitem(Stock stock, int quantity, double purchaseprice){
        this.stock = stock;
        this.quantity = quantity;
        this.purchaseprice = purchaseprice;
    }
    public Stock getStock(){
        return stock;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPurchaseprice(){
        return purchaseprice;
    }

    public void setStock(Stock stock){
        this.stock = stock;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setPurchaseprice(double purchaseprice){
        this.purchaseprice = purchaseprice;
    }
    public double getCurrentValue() {
        return stock.getCurrentPrice() * quantity;
    }

    public double getProfitOrLoss() {
        return getCurrentValue() - (purchaseprice * quantity);
    }

    public void reduceQuantity(int amount) {
        this.quantity -= amount;
    }

    @Override
    public String toString() {
        return "PortfolioItem{stock=" + stock + ", quantity=" + quantity + ", purchasePrice=" + purchaseprice + "}";
    }
}