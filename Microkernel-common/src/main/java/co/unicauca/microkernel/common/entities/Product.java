package co.unicauca.microkernel.common.entities;

/**
 * Producto
 *
 * @author Libardo, Julio
 */
public class Product {

    private static Product p = null;
    private int productId;
    private String name;

    /**
     * Peso del producto, en kilogramos.
     *
     */
    private double largo;
    /**
     * Ancho del producto, en centímetros.
     *
     */
    private double diametro;
    /**
     * Alto del producto, en centímetros.
     *
     */
    private String Referencia;
    /**
     * Profundidad del producto, en centímetros.
     *
     */
    
    private String estado;
    
    public static Product getEjemplar(){
        if(p == null){
            p=new Product();
        }
        return p;
    } 
   

    public Product() {

    }

    public Product(int productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    public Product(int productId, double largo, double diametro, String Referencia) {
        this.productId = productId;
        this.largo = largo;
        this.diametro = diametro;
        this.Referencia = Referencia;
    }
    
    
    
    

    public Product(int productId, String name, double largo, double diametro, String Referencia, String estado) {
        this.productId = productId;
        this.name = name;
        this.largo = largo;
        this.diametro = diametro;
        this.Referencia = Referencia;
        this.estado = estado;
    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
