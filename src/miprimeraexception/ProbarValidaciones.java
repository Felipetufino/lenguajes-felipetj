/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraexception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class ProbarValidaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
int edad=21;
        System.out.println("vamos a validar tu edad");
        try {
            validarEdad.validar(edad);
            System.out.println("si tu te vez no se lanzo la excepcion");
        } catch (menordeedadexception ex) {
            System.out.println(ex.getMessage());
            
        }catch(NumberFormatException ex){
            System.out.println("metiste letras y no numeros tonto");
            
        }
        
    }
    
}
