/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicolombo.pb2023.Datos;

import java.util.ArrayList;
import java.util.HashMap;

public class Usuario {
    public String nombre;
    public String apellidos; 
    public String documento;
    public String telefono;
    public String correo;
    public String contraseña;
    
    public ArrayList<Recarga_Retiro> recargar_retirar = new ArrayList<>();
    
    private int contadorRecargas = 0;
    
    public int getContadorRecargas() {
        return this.contadorRecargas;
    }

    public void aumentarContadorRecargas() {
        this.contadorRecargas++;
    }
    
    private int contadorRetiros = 0;
    
    public int getContadorRetiros() {
        return this.contadorRetiros;
    }

    public void aumentarContadorRetiros() {
        this.contadorRetiros++;
    }
    public static HashMap<String, Usuario> usuariosBD = new HashMap<>();
    
}
