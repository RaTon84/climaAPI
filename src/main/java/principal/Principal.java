package principal;

import model.Datos;
import service.ConsumoAPI;
import service.ConvierteDatos;

public class Principal {

    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos convierteDatos= new ConvierteDatos();

    public void start(){
        var json = consumoAPI.obtenerDatos("http://api.weatherapi.com/v1/current.json?key=519436c41e8d4128885144459242105&q=berisso&aqi=no");
        //System.out.println(json);

        var datos = convierteDatos.obtenerDatos(json, Datos.class);
        System.out.println(datos.ubicacion());
        System.out.println(datos.climaActual());
    }

}
