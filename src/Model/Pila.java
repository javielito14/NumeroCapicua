
package Model;


public class Pila {
    private static final int TamañoPila = 20;
    private int Inicio;
    private char ListaPila[];

    public Pila() {
        Inicio = -1;
        ListaPila = new char[TamañoPila];
    }

    public void insertar(char elemento) throws Exception {
        if (pilaLlena()) {
            throw new Exception("Desbordamiento De Pila");
        }
        Inicio++;
        ListaPila[Inicio] = elemento;
    }

    public char extraer() throws Exception {
        char aux;
        if (pilaVacia()) {
            throw new Exception("Pila Vacia, No Se Puede Extraer");
        }
        aux = ListaPila[Inicio];
        Inicio--;
        return aux;
    }

    public boolean pilaVacia() {
        return Inicio == -1;
    }

    public boolean pilaLlena() {
        return Inicio == TamañoPila - 1;
    }
    
}
