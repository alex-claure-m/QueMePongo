import java.util.List;

public class AsesorDeImagen {
        private ServicioMeteorologico servicioMeteorologico;
        // .... constructor que inyecta al servicio meteorologico....
        public Atuendo sugerirAtuendo(String direccion, Guardarropas guardarrpas) {
            Map estadoDelTiempo = this.servicioMeteorologico()
                    .obtenerCondicionesClimaticas(direccion);
            int temperatura = (int) prediccion.get(¿¿??);
            Humedad humedad = (double) prediccion.get(¿¿???) > 0.8 ? LLUVIOSO : SECO;
// El enunciado no lo pide, pero a modo de ejemplo
// de cómo fácilmente se podría complicar más
            List<Atuendo> combinaciones = guardarropas.todasLasPosiblesCombinaciones()
            return combinaciones
                    .filter( combinacion -> combinacion.aptaParaTemperatura(temperatura) )
                    .filter( combinacion -> combinacion.aptaParaHumedad(humedad) )
                    .first();
        }

}
