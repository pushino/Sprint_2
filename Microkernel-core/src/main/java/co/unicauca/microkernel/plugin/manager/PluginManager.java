package co.unicauca.microkernel.plugin.manager;

import co.unicauca.microkernel.common.interfaces.IPublisherPlugin;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.URLDecoder;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import co.unicauca.microkernel.common.interfaces.IMedicionPlugin;

public class PluginManager {

    private static final String FILE_NAME = "plugin.properties";
    private static PluginManager instance;

    private Properties pluginProperties;

    private PluginManager() {
        pluginProperties = new Properties();
    }

    public static PluginManager getInstance() {
        return instance;
    }

    public static void init(String basePath) throws Exception {

        instance = new PluginManager();
        instance.loadProperties(basePath);
        if (instance.pluginProperties.isEmpty()) {
            throw new Exception("Could not initialize plugins");
        }

    }

    public IMedicionPlugin getDeliveryPlugin(String codigoProducto) {
        //Verificar si existe una entrada en el archivo para el país indicado.
        String propertyName = "delivery." + codigoProducto.toLowerCase();
        IMedicionPlugin plugin = null;
        Object pluginObject = getAnyObject(propertyName);
        if (pluginObject instanceof IMedicionPlugin) {
                    plugin = (IMedicionPlugin) pluginObject;
                }
        return plugin;
        }


      private Object getAnyObject(String classNameProperty) {
        if (!pluginProperties.containsKey(classNameProperty)) {
            return null;
        }

        Object plugin = null;
        //Obtener el nombre de la clase del plugin.
        String pluginClassName = pluginProperties.getProperty(classNameProperty);
        System.out.println(pluginClassName);

        try {

            //Obtener una referencia al tipo de la clase del plugin.
            Class<?> pluginClass = Class.forName(pluginClassName);
            if (pluginClass != null) {
                //Crear un nuevo objeto del plugin.
                plugin = pluginClass.getDeclaredConstructor().newInstance();
            }

        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException ex) {
            Logger.getLogger("PluginManager").log(Level.SEVERE, "Error al ejecutar la aplicación", ex);
        }
        return plugin;
    }
    
    
    public IPublisherPlugin getPublisherPlugin(String propertyTechPublisher) {
        IPublisherPlugin plugin = null;
        Object pluginObject= getAnyObject(propertyTechPublisher);
        if (pluginObject instanceof IPublisherPlugin) {
                    plugin = (IPublisherPlugin) pluginObject;
        }
        plugin.setProperties(pluginProperties);
        return plugin;
    }
    
    private void loadProperties(String basePath){   
        try {
            String filePath = basePath+FILE_NAME;
            filePath = URLDecoder.decode(filePath, "UTF-8");
            try (FileInputStream stream = new FileInputStream(filePath)) {
                
                pluginProperties.load(stream);
                
            } catch (IOException ex) {
                Logger.getLogger("DeliveryPluginManager").log(Level.SEVERE, "Error al ejecutar la aplicación", ex);
            }            
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(PluginManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
