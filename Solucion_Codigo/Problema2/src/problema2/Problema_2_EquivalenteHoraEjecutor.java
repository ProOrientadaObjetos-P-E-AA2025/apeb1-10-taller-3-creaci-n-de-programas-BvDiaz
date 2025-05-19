package problema2;

import java.util.Random;

public class Problema_2_EquivalenteHoraEjecutor {
    public static void main(String[] args) {
        Random random = new Random();
        double horas = 1 + random.nextDouble() * 100; 

        Problema_2_EquivalenteHoraBase equivalente = new Problema_2_EquivalenteHoraBase(horas);

        System.out.println(equivalente);
    }
}
    
    

