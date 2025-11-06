package Observador;

import java.util.ArrayList;

public class StockAgency implements Observer {
    private String name;

    public StockAgency(String name) {
        this.name = name;
    }

    public void getName() {
        this.name = name;
    }

    @Override
    public void update(String marketStatus) {
        System.out.println(name + ", receiving update" + marketStatus);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
