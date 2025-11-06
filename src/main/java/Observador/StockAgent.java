package Observador;

import java.util.Random;
import java.util.ArrayList;

public class StockAgent {
    private ArrayList<StockAgency> agencies;
    private String status;
    private Random rdm;

    public StockAgent() {
        this.agencies = new ArrayList<>();
        this.rdm = new Random();
    }
    private static final String notNull = "Stock Agency cannot be null";

    public void addObserver(StockAgency agency) {
        if (agency == null) {
            System.out.println(notNull);
            return;
        }
        this.agencies.add(agency);
        System.out.println("Stock Agency: " + agency.toString() + " add to the list.");
    }

    public void deleteObserver(StockAgency agency) {
        if (agency == null) {
            System.out.println(notNull + " or is not in the list.");
            return;
        } else if (!agencies.contains(agency)){System.out.println(agency + " is not in the list.");
        return;}
        this.agencies.remove(agency);
        System.out.println("Stock Agency " + agency.toString() + " removed from the list.");
    }

    public ArrayList<StockAgency> showList() {
        if (this.agencies.isEmpty()) {
            System.out.println("List is empty");
        }
        System.out.println("Showing the List: ");
        for (Observer obs: agencies){System.out.println("- " + obs);}
        return agencies;
    }

    public void notifyObservers() {
        if (rdm.nextBoolean()){
            this.status = ": MARKET IS UP";
        } else {
            this.status= ": MARKET IS DOWN";}
        for (StockAgency agency : agencies) {
            agency.update(status);
        }
    }
}


