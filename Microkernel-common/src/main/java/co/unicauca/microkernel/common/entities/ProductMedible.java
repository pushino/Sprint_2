/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.microkernel.common.entities;

import co.unicauca.microkernel.common.interfaces.IMedicionPlugin;
import static java.lang.Math.pow;

/**
 *
 * @author William
 */
public class ProductMedible implements IMedicionPlugin{

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
