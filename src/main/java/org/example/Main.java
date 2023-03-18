package org.example;

import exercici1.Producte;
import exercici1.Venda;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Producte producte1 = new Producte("Samsung Galaxy 10", 450);
        Producte producte2 = new Producte("iPhone 14", 1200);
        Producte producte3 = new Producte("Huawei Mate 2", 300);

        ArrayList<Producte> productes = new ArrayList<>();

        Venda venda = new Venda(productes);

        double preuTotalVentes;

        // Capturamos la exception que hemos creado
        try {

            preuTotalVentes = venda.calcularTotal();
            System.out.println("Preu total de ventes: " + preuTotalVentes);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        productes.add(producte1);
        productes.add(producte2);
        productes.add(producte3);

        // Volvemos a llamar al método calcularTotal() pero esta vez con productos en la colección
        try {

            preuTotalVentes = venda.calcularTotal();
            System.out.println("Preu total de ventes: " + preuTotalVentes);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        // Generación y captura de una excepción de tipo ArrayIndexOutOfBoundsException.

        // Tenemos una colección de 3 productos, si recorremos un array de mas de 3 productos, nos lanzará la excepción ArrayIndexOutOfBoundsException
        for (int i = 0; i < productes.size() + 1; i++) {

            // A la 4a vuelta del loop en vez de mostrar el producto, lanzará la excepción, e irá por el catch msotrando el msg
            try {

                System.out.println(productes.get(i));

            } catch (IndexOutOfBoundsException e) {

                System.out.println(e.getMessage());

            }

        }

    }

}