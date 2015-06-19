/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraexception;

/**
 *
 * @author T-107
 */
public class validarEdad {
    public static void validar(int edad)throws menordeedadexception{
        if(edad<18)throw new menordeedadexception();
        
        
    }
}
