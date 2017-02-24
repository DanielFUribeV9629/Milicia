package Main;

import Fabrica.FabricaEjercito;
import ejercito.Ejercito;

public class Principal {

    public static void main(String[] args) {

        Ejercito e = FabricaEjercito.getEjercito("ho"); //Switch para caso 1 ho, case 2 = en case 3 = el, case 4 = he

     /*   e.setArma("arma");
        e.setArmadura("armadura");
        e.setCuerpo("cuerpo");
        e.setEscudo("escudo");

        System.out.println(e.getParte());*/

    }

}
