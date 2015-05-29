
package Encapsulamiento;


public class Usuario {
private String nombre;
private int edad;
public void setNombre(String nombre){
this.nombre=nombre;
}
public void setEdad(int edad){
    this.edad=edad; 
}
public String getNombre(){
    return nombre; 
}
public int getedad(){
    return edad;
}

    void getEdad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
