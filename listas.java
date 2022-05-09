package lcde;
public class listas {
    Nodo inicio;
    public lista(){
        inicio = null;

    }
    public boolean estaVacio(){
        return inicio == null;
    }
    public void insetarFinal(Object dato){
        if (estaVacio()){
            Nodo nuevo = new Nodo();
            nuevo.setAnterior(nuevo);
            nuevo.setDato(dato);
            nuevo.setSiguiente(nuevo);

            inicio =nuevo;
        }
        else {
            Nodo ultimo= inicio;
            while (ultimo.getSiguiente() ! = inicio){
                ultimo = ultimo.getSiguiente();

            }
            Nodo nuevo = new Nodo();
            nuevo,setAmterior(ultimo);
            nuevo.setDato(dato);
            nuevo.setSiguiente(inicio);

            ultimo.setSiguiente(nuevo);
            inicio.setAnterior(nuevo);

        }

    }
    public void eliminarFinal(){
        if (!estaVacio()){
        Nodo ultimo= inicio;
        while (ultimo.getSiguiente() ! = inicio){
            ultimo = ultimo.getSiguiente();
    }
        Modo penultimo = ultimo.getAnterior();
        penultimo.setSiguiente(inicio);
        inicio.setAnterior(penultimo);

}

    }
    public void mostrar(){
        if (!estaVacio()){
            Nodo temp = inicio;
            while (temp.getSiguiente() ! = inicio);{
                System.out.print(temp.getDato()+ ¨ ¨ );
                temp = temp.getAnterior();
            }
            System.out.print(temp.getDato());



        }
    }
    public void mostrarAtras(){
        if (!estaVacio()){
            Nodo temp = inicio.getAnterior;
            int contador = 0;
            while (contador < vueltas){
                if (temp.getAnterior() == inicio){
                    contador++;
                }
                System.out.print(temp.getDato() +¨ ¨ );
                temp = temp.getAnterior();
            }
            System.out.println(temp.getDato);
        }
    }
}