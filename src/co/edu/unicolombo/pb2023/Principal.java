/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicolombo.pb2023;

import co.edu.unicolombo.pb2023.Ventanas.VentanaPrincipal;

public class Principal {
    public static void main(String[] args) {
        System.out.println("APP DE APUESTAS DEPORTIVAS");
        
        VentanaPrincipal ventana = new VentanaPrincipal();
        
        ventana.setLocationRelativeTo(null);
        
        ventana.setVisible(true);
    }
}
