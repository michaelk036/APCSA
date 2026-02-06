public class Shopping {
    private int maxDistance;
    private String bestStore;
    private double bestPrice = 1000.0;
    private int bestDistance;
    private double priceSum = 0.0;
    private int objectTotal = 0;

    public static void main(String[] args) {
        Shopping kayak = new Shopping (20);
        kayak.addShoppingOption("JMart", 225.95, 18); 
        kayak.addShoppingOption("Jest Buy", 189.00, 24); 
        kayak.addShoppingOption("Tarjet", 220.95, 19);
        System.out. println(kayak);
        System.out.println(kayak.streetPrice());
    }

    public Shopping(int maxDistance) {

    }

    public void addShoppingOption(String storeName, double itemPrice, int distance) {
        priceSum+=itemPrice;
        objectTotal++;

        if (distance <= maxDistance && itemPrice < bestPrice) {
            bestStore = storeName;
            bestPrice = itemPrice;
            bestDistance = distance;
        }
    }

    public double streetPrice() {
        double average = priceSum/objectTotal;
        return average;
    }

    public String toString() {
        String info =  bestStore + " " + bestPrice + " " + bestDistance;
        return info;
    } 
}