package Observador;

public class Main {
    public static void main(String[] args) {
    StockAgent agent = new StockAgent();

    StockAgency bloomberg = new StockAgency("Bloomberg");
    StockAgency reuters = new StockAgency("Reuters");
    StockAgency cnbc = new StockAgency("cnbc");
    StockAgency financialTimes = new StockAgency("Financial Times");
    StockAgency yahooFinance = new StockAgency("Yahoo Finance");
    StockAgency wallStreetJournal = new StockAgency("Wall Street Journal");

    agent.addObserver(bloomberg);
    agent.addObserver(reuters);
    agent.addObserver(yahooFinance);
    agent.addObserver(financialTimes);
    System.out.println();

    agent.showList();
    System.out.println();

    agent.deleteObserver(financialTimes);
    agent.deleteObserver(wallStreetJournal);
    System.out.println();

    agent.showList();
    System.out.println();

    agent.notifyObservers();
    System.out.println();

    agent.notifyObservers();
    System.out.println();

    agent.notifyObservers();
    }
}