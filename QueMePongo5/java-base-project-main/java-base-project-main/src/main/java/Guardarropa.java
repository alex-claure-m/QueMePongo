public class Guardarropa {
    CriterioPrenda prenda;
    List<Prenda> unasPrendas;
    List<Usuario> usuariosQueComparten;

    void agregarPrendas(Prenda unaPrenda){
        unasPrendas.add(unPrenda);
    }
    void sacarPrenda(Prenda unPrenda){
        unasPrendas.remove(unPrenda);
    }
}