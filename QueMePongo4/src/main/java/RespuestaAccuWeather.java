

public class RespuestaAccuWeather {
    // Esto es necesario solamente para "agregarle" a las condiciones
// climáticas una expiración
        public RespuestaAccuWeather(Map<String, Object> estadoDelTiempo, DateTime expiracion) {
// ...etc...
// getters
// si no fuera por este método en algunos lenguajes
// bien podría haber sido una tupla
        public boolean expiro() {
            return this.expiracion.isAfter(DateTime.now);
        }
    }
}
