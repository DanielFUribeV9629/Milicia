package ejercito;

import Armadura.ArmaduraAbs;
import Armadura.ArmaduraEnano;
import Armas.ArmaEnano;
import Armas.ArmasAbs;
import Cuerpo.CuerpoAbs;
import Cuerpo.CuerpoEnano;
import Escudo.EscudoAbs;
import Escudo.EscudoEnano;

public class EnanoFabrica extends Ejercito{

    @Override
    public CuerpoAbs darCuerpo() {
        return new CuerpoEnano();
    }

    @Override
    public ArmasAbs darArma() {
        return new ArmaEnano();
    }

    @Override
    public EscudoAbs darEscudo() {
        return new EscudoEnano();
    }

    @Override
    public ArmaduraAbs darArmadura() {
        return new ArmaduraEnano();
    }

   
    
    //Singleton
}
