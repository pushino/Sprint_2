/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.microkernel.common.entities;

import co.unicauca.microkernel.common.interfaces.IMedicionPlugin;
import co.unicauca.microkernel.common.interfaces.ItemFabrica;

/**
 *
 * @author William
 */
public class FabricaProduct extends ItemFabrica{

    private ProductMedible item;
    
    public FabricaProduct(){
            super();
            item = new ProductMedible();
    }
    
    public IMedicionPlugin crearItem() {
        return item;
    }
    
    
  
    
}
