public interface ILista {
    void inicializacionoCreacion();

    void insertarElemento(Object elementoaInsertar);

    void eliminarElemento(Object elementoaEliminar);

    Nodo buscarElemento(Object elementoaBuscar);

    String recorrerLista();

    boolean estaVacia();
}
