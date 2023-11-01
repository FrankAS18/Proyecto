/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicolombo.pb2023.Datos;

import java.time.LocalDate;
import java.util.HashMap;

/**
 *
 * @author ASUS
 */
public class Recarga_Retiro {
    public int id_recarga;
    public int id_retiro;
    public Usuario usuario;
    public double saldo;
    public double saldoRecargado;
    public double saldoRetirado;
    public static HashMap<String, Recarga_Retiro> recarga_retiroBD = new HashMap<>();
}
