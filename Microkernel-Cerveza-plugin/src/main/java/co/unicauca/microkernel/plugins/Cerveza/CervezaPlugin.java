package co.unicauca.microkernel.plugins.Cerveza;


import co.unicauca.microkernel.common.entities.Medicion;
import co.unicauca.microkernel.common.entities.Product;

import co.unicauca.microkernel.common.interfaces.IMedicionPlugin;
import static java.lang.Math.pow;
/**
 * Plugin para envios a Mexico
 * @author Libardo, Julio
 */
public class CervezaPlugin implements IMedicionPlugin {

    /**
     * Calcular el estado del producto con reglas de medicion de calidad
     *
     */

    
    public String status(Medicion medicion){
        
        double v= volumen(medicion);
        String estado;
        
        if(v >= 500 && v <= 600){
            estado="Aceptado";
        }else{
            estado="Defectuoso";
        }
        
        return estado;
    }
    
    public double volumen(Medicion medicion){
        
        double v;
        double r = ((medicion.getProduct().getDiametro())/2);
        v = (pow(r,2)*(medicion.getProduct().getLargo())*(3.14));
        
        return v;
        
    }
    
    
  
}
