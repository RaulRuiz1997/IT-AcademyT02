package exercici1;

import java.util.ArrayList;
import java.util.Collection;

public class Venda {

    private Collection<Producte> colleccioProductes = new ArrayList<>();
    private double preuTotalVendes;

    public Venda(Collection<Producte> colleccioProductes) {
        this.colleccioProductes = colleccioProductes;
    }

    public Collection<Producte> getColleccioProductes() {
        return colleccioProductes;
    }

    public double getPreuTotalVendes() {
        return preuTotalVendes;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "colleccioProductes=" + colleccioProductes +
                ", preuTotalVendes=" + preuTotalVendes +
                '}';
    }

    public double calcularTotal() throws VendaBuidaException {

        if (colleccioProductes.isEmpty()) {

            throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");

        }

        for (Producte producte : colleccioProductes) {
            preuTotalVendes += producte.getPreu();
        }

        return preuTotalVendes;

    }

}
