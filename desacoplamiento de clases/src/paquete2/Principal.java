/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author Jose
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Comunicador c1 =ClaseComunicador.creandoComunicador();
        c1.enviarMensaje("enviando mi mensaje");
        
         
        
    }
    
}
