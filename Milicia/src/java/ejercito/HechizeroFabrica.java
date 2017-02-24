package ejercito;

import Armadura.ArmaduraAbs;
import Armadura.ArmaduraHechizero;
import Armas.ArmaHechizero;
import Armas.ArmasAbs;
import Cuerpo.CuerpoAbs;
import Cuerpo.CuerpoHechizero;
import Escudo.EscudoAbs;
import Escudo.EscudoHechizero;

public class HechizeroFabrica extends Ejercito{

    @Override
    public CuerpoAbs darCuerpo() {
        return new CuerpoHechizero();
    }

    @Override
    public ArmasAbs darArma() {
        return new ArmaHechizero();
    }

    @Override
    public EscudoAbs darEscudo() {
        return new EscudoHechizero();
    }

    @Override
    public ArmaduraAbs darArmadura() {
        return new ArmaduraHechizero();
    }

    
    
    //Singleton
}
