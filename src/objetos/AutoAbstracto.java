package objetos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Interfaz común a todos los tipos y marcas de coche
 * @author javiiariass
 */
public abstract class AutoAbstracto {
    protected String modelo;
    protected String color;
    protected int potencia;
    protected float espacioMaletero; // capacidad del coche
    protected int nPlazas;
    protected int anyoFabricacion;
    protected float precio;
    
    public AutoAbstracto(float precio, String modelo, String color, int potencia, float espacioMaletero, int nPlazas, int anyoFabricacion){
        this.modelo = modelo;
        this.color = color;
        this.potencia = potencia;
        this.espacioMaletero = espacioMaletero;
        this.nPlazas = nPlazas;
        this.anyoFabricacion = anyoFabricacion;
        this.precio = precio;
    }
    
    public abstract void mostrarCaracteristicas();
}
