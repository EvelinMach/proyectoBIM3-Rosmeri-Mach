
package agendatelefonica;

public class contactos {
     private String nombre,domicilio,telefono;
    public contactos(String nombre,String domicilio,String telefono){
        this.nombre=nombre;
        this.domicilio=domicilio;
        this.telefono=telefono;
        
    }
    public String verNombre(){
        return this.nombre;
    }
    public String verDomicilio(){
        return this.domicilio;
    }
   public String verTelefono(){
       return this.telefono;
   }
    
    
}
