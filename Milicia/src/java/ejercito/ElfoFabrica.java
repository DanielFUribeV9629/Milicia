package ejercito;

import Armadura.ArmaduraAbs;
import Armadura.ArmaduraElfo;
import Armas.ArmaElfo;
import Armas.ArmasAbs;
import Cuerpo.CuerpoAbs;
import Cuerpo.CuerpoElfo;
import Escudo.EscudoAbs;
import Escudo.EscudoElfo;

public class ElfoFabrica extends Ejercito{
    
    public ArmasAbs darArma(){
        return new ArmaElfo();  
    }  
    @Override
    public CuerpoAbs darCuerpo() {
        return new CuerpoElfo();
    }

    @Override
    public EscudoAbs darEscudo() {
        return new EscudoElfo();
    }

    @Override
    public ArmaduraAbs darArmadura() {
        return new ArmaduraElfo();
    }
}
