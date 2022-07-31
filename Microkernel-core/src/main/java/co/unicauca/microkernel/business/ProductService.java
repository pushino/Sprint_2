package co.unicauca.microkernel.business;

import co.unicauca.microkernel.common.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    public List<Product> getAll() {

        List<Product> products = new ArrayList<>();

        /*En un escenario normal, los productos vendrían de la capa de acceso a datos.
         * Para este ejemplo, se crearán objetos de prueba directamente aquí.
         * */
        Product productOne = new Product(1, "Cerveza");
        Product productTwo = new Product(2, "Gaseosa");
        Product productThree = new Product(2, "Jugo");

        products.add(productOne);
        products.add(productTwo);
        products.add(productThree);

        return products;
    }

}
