package co.unicauca.microkernel.common.interfaces;

import co.unicauca.microkernel.common.entities.Medicion;

public interface IMedicionPlugin {

    /**
     * Establece el estado de un producto.
     *
     * @param medicion
     * @return estado del producto
     */
    public abstract String status(Medicion medicion);
    public abstract double volumen(Medicion medicion);
}
