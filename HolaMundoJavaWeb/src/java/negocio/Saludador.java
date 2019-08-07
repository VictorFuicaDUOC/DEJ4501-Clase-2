/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 * Clase que genera saludos al azar...
 * @author cetecom
 */
public class Saludador {
    private static String[] saludos = {"Hola Mundo","Hello World","Ciao Mondo","Hej Varlden"};
    public static String elegirSaludo(){
        return saludos[(int) (Math.random() * saludos.length)];
    }
}
