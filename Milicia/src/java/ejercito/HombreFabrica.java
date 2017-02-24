package ejercito;

import Armadura.ArmaduraAbs;
import Armadura.ArmaduraHombre;
import Armas.ArmaHombre;
import Armas.ArmasAbs;
import Cuerpo.CuerpoAbs;
import Cuerpo.CuerpoHombre;
import Escudo.EscudoAbs;
import Escudo.EscudoHombre;

public class HombreFabrica extends Ejercito{

    @Override
    public CuerpoAbs darCuerpo() {
        return new CuerpoHombre();
    }

    @Override
    public ArmasAbs darArma() {
        return new ArmaHombre();
    }

    @Override
    public EscudoAbs darEscudo() {
        return new EscudoHombre();
    }

    @Override
    public ArmaduraAbs darArmadura() {
        return new ArmaduraHombre();
    }

    
    //Singleton
    
}
