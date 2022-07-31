package co.unicauca.microkernel.common.entities;

/**
 * Envio
 * 
 */
public class Medicion {

    private Product product;
    
    private String codigoProducto;

    public Medicion(Product product, String codigoProducto) {
        this.product = product;
        this.codigoProducto = codigoProducto;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    
}
