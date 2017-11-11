
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JorgeLuis
 */
public class Zapato extends Objeto{
    // una talla, tipo de suela y confort (escala del 1 al 10).
    private String talla;
    private String tipo_suela;
    private int confort;

    public Zapato() {
        super();
    }

    public Zapato(String talla, String tipo_suela, int confort, String color, String descripcion, String marca, String tamaño, int calidad, float precio, Familiar dueño) {
        super(color, descripcion, marca, tamaño, calidad, precio, dueño);
        this.talla = talla;
        this.tipo_suela = tipo_suela;
        this.confort = confort;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipo_suela() {
        return tipo_suela;
    }

    public void setTipo_suela(String tipo_suela) {
        this.tipo_suela = tipo_suela;
    }

    public int getConfort() {
        return confort;
    }

    public void setConfort(int confort) {
        this.confort = confort;
    }

    @Override
    public String toString() {
        return "Zapatos";
    }
    
    
}
