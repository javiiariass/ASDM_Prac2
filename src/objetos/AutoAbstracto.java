package objetos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase base abstracta para todos los vehículos
 * @author javiiariass
 */
public abstract class AutoAbstracto {
    // Atributos comunes a todos los vehículos
    protected String fabricante;
    protected String modelo;
    protected String color;
    protected int potencia;
    protected float espacioMaletero;
    protected int nPlazas;
    protected int anyoFabricacion;
    protected float precio;
    
    
        // Getters y setters
    
    public String getFabricante() {
        return fabricante;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public float getPrecioBase(){
        return precio;
    }
    
    public String getColor() {
        return color;
    }

    public int getPotencia() {
        return potencia;
    }

    public float getEspacioMaletero() {
        return espacioMaletero;
    }

    public int getnPlazas() {
        return nPlazas;
    }

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }

    public float getPrecio() {
        return precio;
    }
    
    // Constructor
    public AutoAbstracto(String fabricante, String modelo, String color, int potencia, float espacioMaletero, 
            int nPlazas, int anyoFabricacion, float precio) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.potencia = potencia;
        this.espacioMaletero = espacioMaletero;
        this.nPlazas = nPlazas;
        this.anyoFabricacion = anyoFabricacion;
        this.precio = precio;
    }
    

    
    
    
    // Métodos abstractos que deberán implementar las clases hijas
    
    /**
     * Muestra por pantalla los datos del vehiculo
     */
    public abstract void mostrarCaracteristicas();
    
    /**
     * calcular precio dependiendo de aranceles/subvenciones
     * @return precio final del producto
     */
    public abstract float calcularPrecioFinal();
}
