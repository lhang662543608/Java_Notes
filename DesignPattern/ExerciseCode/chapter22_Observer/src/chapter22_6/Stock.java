package chapter22_6;

import java.util.ArrayList;

/**
 * @author lhang
 * @create 2019-11-18 22:01
 */
//股票：观察目标
public class Stock {
    private ArrayList<Investor> investors;
    private String stockName;
    private double price;

    public Stock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
        investors = new ArrayList<Investor>();
    }

    public void attach(Investor investor) {
        investors.add(investor);
    }

    public void detach(Investor investor) {
        investors.remove(investor);
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getStockName() {
        return this.stockName;
    }

    public void setPrice(double price) {
        double range = Math.abs(price - this.price) / this.price;
        this.price = price;
        if (range >= 0.05) {
            this.notifyInvestor();
        }
    }

    public double getPrice() {
        return this.price;
    }

    public void notifyInvestor() {
        for (Object obj : investors) {
            ((Investor) obj).response(this);
        }
    }
}
