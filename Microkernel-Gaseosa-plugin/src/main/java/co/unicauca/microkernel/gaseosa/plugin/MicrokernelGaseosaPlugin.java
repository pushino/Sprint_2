/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.unicauca.microkernel.gaseosa.plugin;

import co.unicauca.microkernel.common.entities.Medicion;
import co.unicauca.microkernel.common.interfaces.IMedicionPlugin;
import static java.lang.Math.pow;

public class MicrokernelGaseosaPlugin implements IMedicionPlugin {

    @Override
    public String status(Medicion medicion){
        System.out.println("gaseosa");
        double v= volumen(medicion);
        String estado;
        
        if(v >= 500 && v <= 600){
            estado="Aceptado";
        }else{
            estado="Defectuoso";
        }
        
        return estado;
    }
    
    @Override
    public double volumen(Medicion medicion){
        
        double v;
        double r = ((medicion.getProduct().getDiametro())/2);
        v = (pow(r,2)*(medicion.getProduct().getLargo())*(3.14));
        
        return v;
        
    }
}
