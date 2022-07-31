package co.unicauca.microkernel.business;

import co.unicauca.microkernel.common.entities.Medicion;
import co.unicauca.microkernel.plugin.manager.PluginManager;
import co.unicauca.microkernel.common.interfaces.IMedicionPlugin;

public class ServicioMedicion {

    public String calcularMedicionEstandar(Medicion datosMedicion) throws Exception {

        String codigoProducto = datosMedicion.getCodigoProducto();
        PluginManager manager = PluginManager.getInstance();
        IMedicionPlugin plugin = manager.getDeliveryPlugin(codigoProducto);

        if (plugin == null) {
            throw new Exception("No hay un plugin disponible para el producto indicado: " + codigoProducto);
        }

        return plugin.status(datosMedicion);

    }

}
