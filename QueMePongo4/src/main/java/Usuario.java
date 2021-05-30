public class Usuario {

    AccuWeatherAPI apiClima = new AccuWeatherAPI();
    apiClima.getWeather("Buenos Aires, Argentina");
    estadoDelTiempo.get(0).get("Temperature");
}
