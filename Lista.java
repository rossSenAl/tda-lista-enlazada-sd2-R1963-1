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
        if (estaVacia()) {
            System.out.println("La lista está vacía, no se puede buscar el elemento.");
            return null;
        }

        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getDato().equals(elementoaBuscar)) {
                return actual;
            }
            actual = actual.getEnlace();
        }

        System.out.println("El elemento " + elementoaBuscar + " no se encuentra en la lista.");
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
        String recorridoString = "";
        if (estaVacia()) {
            return "No se puede recorrer la lista, ya que esta vacia.";
        }
        Nodo auxNodo = cabeza;
        while (auxNodo != null) {
            recorridoString = recorridoString + auxNodo.getDato() + " ";
            auxNodo = auxNodo.getEnlace();
        }
        return recorridoString;
    }

    // TODO : Implementar el metodo recorrer lista, para hoy 22/08/2024
    // practica en clase
    @Override
    public boolean seEncuentraElemento(Object elementoaEncontrar) {
        if (estaVacia()) {
            System.out.println("No se pudo encontrar el elemento");
            return false;
        }
        if (!(elementoaEncontrar instanceof Integer)) { // Si es un String u otro tipo, se mostrará un mensaje de error.
            System.out.println("Error: El elemento a buscar debe ser un número entero.");
            return false;
        }

        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getDato().equals(elementoaEncontrar)) {
                return true;
            }
            actual = actual.getEnlace();
        }
        return false;
    }

}
