package lib;
import java.util.ArrayList;
import java.util.List;
public class Portfolio {
    private List<Portfolioitem> items = new ArrayList<>();

    public void buyStock(Stock stock, int quantity, double purchasePrice) {
        items.add(new Portfolioitem(stock, quantity, purchasePrice));
    }

    public void sellStock(Stock stock, int quantity) {
        for (Portfolioitem item : items) {
            if (item.getStock().getName().equals(stock.getName()) && item.getQuantity() >= quantity) {
                item.reduceQuantity(quantity);
                if (item.getQuantity() == 0) {
                    items.remove(item);
                }
                break;
            }
        }
    }

    public double getTotalValue() {
        double total = 0;
        for (Portfolioitem item : items) {
            total += item.getCurrentValue();
        }
        return total;
    }

    public double getTotalProfitOrLoss() {
        double total = 0;
        for (Portfolioitem item : items) {
            total += item.getProfitOrLoss();
        }
        return total;
    }

    public List<Portfolioitem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Portfolio{items=" + items + "}";
    }
}
