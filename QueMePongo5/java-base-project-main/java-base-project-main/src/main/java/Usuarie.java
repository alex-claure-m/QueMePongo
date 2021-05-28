public class Usuarie{
    private List<Guardarropa> unGuardarropa;
    private List<Propuesta> propuesta;

    public void compartirGuardarropaCon(Usuarie unUsuario, Guardarropa unGuardarropa){
        unUsuario.agregarSuGuardarropa(unGuardarropa);
    }
    public void agregarSuGuardarropa(unGuardarropa){
        unGuardarropa.add(unGuardarropa)
    }
    public void sacarPrendaDeRopa(Prenda unaPrenda){
        unGuardarropa.sacarPrenda(unPrenda)
    }
    public void agregarPropuestaDe(Usuario unUsuarie,Prenda unaPrenda, Guardarropa unGuardarropa){
        propuesta.add(new Propuesta(unaPrenda,unGuardarropa))
    }

}