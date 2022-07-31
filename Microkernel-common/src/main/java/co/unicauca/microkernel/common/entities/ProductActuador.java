/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.microkernel.common.entities;

import frameworkMedicion.external.Actuador;
import java.util.ArrayList;

/**
 *
 * @author William
 */
public class ProductActuador extends Actuador{

    
    private ArrayList<Medicion> listaProductosAceptables= new ArrayList<>();
    private ArrayList<Medicion> listaProductosDefectuosos= new ArrayList<>();
   
    FabricaProduct fc = new FabricaProduct();

    public ProductActuador() {
    }
            
    public void addlist(Medicion m){
        ProductMedible pm = (ProductMedible) fc.crearItem();
        if(pm.status(m).equalsIgnoreCase("Aceptado")){
            listaProductosAceptables.add(m);
        }else{
            listaProductosDefectuosos.add(m);
        }
        
    }    

    
    @Override
    public boolean action(Product p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
