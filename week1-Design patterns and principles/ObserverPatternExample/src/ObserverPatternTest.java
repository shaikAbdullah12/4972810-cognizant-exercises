public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp1 = new MobileApp("MobileApp1");
        Observer mobileApp2 = new MobileApp("MobileApp2");
        Observer webApp = new WebApp("WebApp");

        // Register observers
        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(mobileApp2);
        stockMarket.registerObserver(webApp);

        // Simulate stock price changes
        stockMarket.setStockPrice(100.00);
        stockMarket.setStockPrice(105.50);

        // Deregister one observer and simulate another stock price change
        stockMarket.deregisterObserver(mobileApp1);
        stockMarket.setStockPrice(110.75);
    }
}