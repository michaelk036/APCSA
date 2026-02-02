public class Cruise {
    private int price;
    private int signups;
    private int currentPrice;
    public static void main(String[] args) {
        Cruise cr = new Cruise(78, 4000);
        cr.setPrice(5000);
        cr.checkResponse("world cruise");
        cr.checkResponse("ship trip");
        cr.calculateRevenue();
    }

    public Cruise(int people, int currentPrice) {
        price = currentPrice;
        signups = people;
    }
    
    public void setPrice(int newPrice) {
        price = newPrice;
    }
    public void checkResponse(String phrase) {
        //somehow check if the string contains "cruise"
        //if it does people++
    }

    public double calculateRevenue() {
        if (signups > 300) {
            price = currentPrice - 500;
        }
        else if (signups >= 200 && signups < 300) {
            price = currentPrice - 350;
        }
        return price*signups;   
    }
}
