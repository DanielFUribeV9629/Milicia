package ejercito;

import Armadura.ArmaduraAbs;
import Armas.ArmasAbs;
import Cuerpo.CuerpoAbs;
import Escudo.EscudoAbs;

public abstract class Ejercito {
    
    public abstract CuerpoAbs darCuerpo();
          
    public abstract ArmasAbs darArma();
    
    public abstract EscudoAbs darEscudo();
    
    public abstract ArmaduraAbs darArmadura();
    
}
