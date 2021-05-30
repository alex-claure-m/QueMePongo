import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class ServicioMeteorologico {
        private AccuWeatherAPI api;
        private Map<String, RespuestaAccuWeather> ultimasRespuestas;
        private Duration periodoDeValidez;
 // ¿es el API un componente pesado? ¿es un componente que podemos compartir?
// si instanciamos el objeto acá mismo, estamos asumiendo un montón de cosas
// (que es liviano, que no parece ser compartible),
// pero al usar inyección de dependencias evitamos
// hacer esas suposiciones: "pateamos el problema para adelante"
        public ServicioMeteorologico(AccuWeatherAPI api, Duration periodoDeValidez) {
            this.api = api;
            this.periodoDeValidez = periodoDeValidez;
            this.ultimasRespuestas = new HashMap<String, EstadoDelTiempo>>();
        }
        // esto es un algoritmo clásico de caché:
//     * si no está en caché o está expirada, recalcular y guardar.
//     * en cualquier caso: devolver el resultado de la caché

    /*
        public Map<String, Object> obtenerCondicionesClimaticas0(String direccion) {
            if (!this.ultimasRespuestas.contains(direccion)
                            || this.ultimasRespuestas.get(direccion).expiro()) {
                ultimasRespuestas.put(
                        new RespuestaAccuWeather(this.consultarApi(direccion), proximaExpiracion()));
            }
            return this.ultimasRespuestas.get(direccion).getEstadoDelTiempo();
}*/

    // notar que cambió el retorno del método
    public EstadoDelTiempo obtenerCondicionesClimaticas(String direccion) {
        if (!this.ultimasRespuestas.contains(direccion)
                || this.ultimasRespuestas.get(direccion).expiro()) {
            ultimasRespuestas.put(
                    new RespuestaAccuWeather(this.consultarApi(direccion), proximaExpiracion()));
        }
        return this.ultimasRespuestas.get(direccion).getEstadoDelTiempo();
    }


    private LocalDateTime proximaExpiracion() {
        return LocalDateTime.now().plus(this.periodoDeValidez);
    }
// optimización: acá podríamos guardar directamente las próxima predicciones y
// actualizar las cacheadas si las nuevas son diferentes
    private Map<String, Object> consultarApi(String direccion) {
        return this.api.getWeather(direccion).get(0);
    }
}
