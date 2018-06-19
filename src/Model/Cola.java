
package Model;


public class Cola {
    private char[] Cola;
    private int Inicio;
    private int Final;
    private int Nulo;
    private int MaximoCola = 20;

    public Cola() {
        Cola = new char[MaximoCola + 1];
        MaximoCola -= 1;
        Nulo = - 1;
        Inicio = Nulo;
        Final = Nulo;
    }

    public void desbordamiento(char elemento) {
        if ((Inicio == 0 && Final == MaximoCola) || (Inicio == (Final + 1))) {
            System.out.println("Desbordamiento De Memoria");
            return;
        } else {
            if (Inicio == Nulo) {
                Inicio = 0;
                Final = 0;
            } else if (Final == MaximoCola) {
                Final = 0;
            } else {
                Final += 1;
            }
            Cola[Final] = elemento;
        }
    }
    
    public char vacia(){
        char aux;
        if(Inicio == Nulo){
            System.out.println("Cola Vacia");
            return 0;
        }else {
            aux = Cola[Inicio];
            if(Inicio == Final){
                Inicio = Nulo;
                Final = Nulo;
            }else if(Inicio == MaximoCola)
                Inicio = 0;
            else
                Inicio += 1;
            return  aux;
        }
    }
    
}
