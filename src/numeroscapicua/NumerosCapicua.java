
package numeroscapicua;

import Model.Cola;
import Model.Pila;
import java.util.Scanner;


public class NumerosCapicua {

   
    public static void main(String[] args) {
       
        Pila miPilita;
        Cola miColita;
        char ch;
        boolean esCapicua = false;
        String numero;
        Scanner sc = new Scanner(System.in);
        try {
            miPilita = new Pila();
            miColita = new Cola();
            System.out.println("Ingrese Un Numero Para Verificar Si Es Capicua");
            System.out.flush();
            numero = sc.next();
            for(int i = 0; i < numero.length(); i++){
                ch = numero.charAt(i);
                miPilita.insertar(ch);
                miColita.desbordamiento(ch); 
            }
            for(int i = 0; i < numero.length(); i++){
                if(miPilita.extraer() == miColita.vacia()){
                    esCapicua = true;
                    break;
                }else{
                    esCapicua = false;
                    break;
                }
        }
            if(esCapicua)
                System.out.println("El Numero " + numero + " Es Capicua");
            else
                System.out.println("El Numero " + numero + " No Es Capicua");
        } catch (Exception e) {
            System.err.println("Exception: " + e);
        }
    }
    
}
