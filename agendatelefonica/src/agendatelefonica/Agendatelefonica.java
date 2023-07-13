
package agendatelefonica;

import java.util.Scanner;


public class Agendatelefonica {
static contactos miagenda[]= new contactos[15];
 static int contar=0;
   
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
                Scanner entrada=new Scanner(System.in);
                System.out.println("------Guardar nuevo contacto--------------");
                System.out.println("Ingrese el nombre del contacto");
                String nombre=entrada.nextLine();
                System.out.println("Ingrese el domicilio del contacto");
                String domi=entrada.nextLine();
                System.out.println("Ingrese el numero de telefono");
                String numero=entrada.nextLine();
                miagenda[contar]=new contactos(nombre,domi,numero);
                System.out.println("contacto guardado");
                contar++;
                
                }else if (op==2){
                System.out.println("-----------Mis contactos son-------");
                verAgenda();
            }else if(op==3){
                System.out.println("-----------Buscar contacto---------------------");
            }else{
                System.out.println("opcion incorrecta");
                
            }
        }
               
                
        }
    static public void verAgenda(){
        for(int i=0;i<contar;i++){
         
        }
    }
    
}
