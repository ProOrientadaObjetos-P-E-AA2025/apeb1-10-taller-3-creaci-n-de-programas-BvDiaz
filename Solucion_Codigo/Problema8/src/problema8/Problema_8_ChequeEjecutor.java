package problema8;

import java.util.Random;

public class Problema_8_ChequeEjecutor {
    public static void main(String[] args) {
        Random rand = new Random();

        String[] clientes = {"Carlos Pérez", "Ana Torres", "Luis Mejía"};
        String[] bancos = {"Banco Pichincha", "Banco del Pacífico", "Produbanco"};
        String nombreCliente = clientes[rand.nextInt(clientes.length)];
        String nombreBanco = bancos[rand.nextInt(bancos.length)];
        double valorCheque = 500 + rand.nextDouble() * 9500;  

        Problema_8_ChequeBase cheque = new Problema_8_ChequeBase(nombreCliente, nombreBanco, valorCheque);

        System.out.println(cheque);
    }
}
