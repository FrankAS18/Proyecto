/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicolombo.pb2023.Datos;

import java.util.ArrayList;
import java.util.HashMap;

public class EventoDeportivo {
    public String nombre_evento;
    public String fecha_hora;
    public String tipo_deporte;
    public String equipos_participantes;
    public String resultados;
    public String cuotas;
    public ArrayList<Apuestas> apuestas = new ArrayList<>();
    public static HashMap<String, EventoDeportivo> eventoBD;

}
