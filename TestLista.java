public class TestLista {
    public static void main(String[] args) {
        // prueba del tda lista
        Lista listaNumeros = new Lista();
        listaNumeros.insertarElemento(4);
        listaNumeros.insertarElemento(5);
        listaNumeros.insertarElemento(1);
        boolean estaVacia = listaNumeros.estaVacia();
        System.out.println(estaVacia);
        String listaString = listaNumeros.toString();
        System.out.println(listaString);
    }
}
