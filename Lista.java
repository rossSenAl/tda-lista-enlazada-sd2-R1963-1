public class Lista implements ILista {
    private Nodo cabeza;

    public Lista() {
        cabeza = null;
    }

    public Lista(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    @Override
    public void inicializacionoCreacion() {

    }

    @Override
    public Nodo buscarElemento(Object elementoaBuscar) {
        return null;
    }

    @Override
    public void eliminarElemento(Object elementoaEliminar) {

    }

    @Override
    public boolean estaVacia() {
        if (cabeza == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Lista [cabeza=" + cabeza + "]";
    }

    @Override
    public void insertarElemento(Object elementoaInsertar) {
        Nodo nuevoNodo = new Nodo(); // se crea un nodo vacio
        nuevoNodo.setDato(elementoaInsertar); // se agrega el dato al nuevo nodo
        nuevoNodo.setEnlace(cabeza); // el enlace del nuevo nodo es la cabeza
        cabeza = nuevoNodo; // la cabeza es el nuevo nodo
    }

    @Override
    public String recorrerLista() {

        return null;
    }

}
