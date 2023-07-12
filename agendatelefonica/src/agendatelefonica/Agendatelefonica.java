
package agendatelefonica;

import java.util.Scanner;


public class Agendatelefonica {

    public static void main(String[] args) {
        int op=0;
        Scanner teclado = new Scanner(System.in);
        while(op!=4){
            System.out.println("--------------Menu principal------------------");
            System.out.println("1. Guardar contacto");
            System.out.println("2. Ver todos los contactos");
            System.out.println("3. Buscar un contacto");
            System.out.println("4. salir");
            System.out.println("ingrese el numero de opcion");
            op= teclado.nextInt();
            if(op==1){
                System.out.println("------Guardar nuevo contacto--------------");
                
            }else if (op==2){
                System.out.println("------informacion del los contactos-------");
            }else if(op==3){
                System.out.println("--------buscar contacto---------------------");
            }else{
                System.out.println("opcion incorrecta");
            }
        }
               
                
        
    }
    
}
