
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
public class Objeto {
    //color, descripción, marca, tamaño, calidad (escala de 1 a 10), precio y dueño

    private String color;
    private String descripcion;
    private String marca;
    private String tamaño;
    private int calidad;
    private float precio;
    private Familiar dueño;

    public Objeto() {
    }

    public Objeto(String color, String descripcion, String marca, String tamaño, int calidad, float precio, Familiar dueño) {
        this.color = color;
        this.descripcion = descripcion;
        this.marca = marca;
        this.tamaño = tamaño;
        if (calidad <= 10 && calidad > 0) {
            this.calidad = calidad;
        }
        this.precio = precio;
        this.dueño = dueño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Familiar getDueño() {
        return dueño;
    }

    public void setDueño(Familiar dueño) {
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        return "Objeto{" + "descripcion=" + descripcion + '}';
    }

}
