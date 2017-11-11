
import java.awt.Color;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JorgeLuis
 */
public class objetoHogar extends Objeto{
    // un tiempo de vida, área de casa (cocina, sala, habitación), instrucciones de armado y fecha de compra.
    private int tiempo_vida;
    private String area_casa;
    private String instrucciones;
    private Date fecha_compra;

    public objetoHogar() {
        super();
    }

    public objetoHogar(int tiempo_vida, String area_casa, String instrucciones, Date fecha_compra, String color, String descripcion, String marca, String tamaño, int calidad, float precio, Familiar dueño) {
        super(color, descripcion, marca, tamaño, calidad, precio, dueño);
        this.tiempo_vida = tiempo_vida;
        this.area_casa = area_casa;
        this.instrucciones = instrucciones;
        this.fecha_compra = fecha_compra;
    }

    public int getTiempo_vida() {
        return tiempo_vida;
    }

    public void setTiempo_vida(int tiempo_vida) {
        this.tiempo_vida = tiempo_vida;
    }

    public String getArea_casa() {
        return area_casa;
    }

    public void setArea_casa(String area_casa) {
        this.area_casa = area_casa;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    @Override
    public String toString() {
        return "Objeto de Hogar";
    }
    
    
}
