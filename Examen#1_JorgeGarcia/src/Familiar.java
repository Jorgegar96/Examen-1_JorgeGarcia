
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JorgeLuis
 */
public class Familiar extends Persona{
    //n rol (el cual se explica después), un trabajo, altura, peso y una lista de objetos
    private String rol;
    private String trabajo;
    private float altura;
    private float peso;
    private ArrayList<Objeto> objects = new ArrayList();

    public Familiar() {
        super();
    }

    public Familiar(String rol, String trabajo, float altura, float peso, String name, int age, int ID, String sexo, String estado_civil) {
        super(name, age, ID, sexo, estado_civil);
        this.rol = rol;
        this.trabajo = trabajo;
        this.altura = altura;
        this.peso = peso;
    }

    

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public ArrayList getObjects() {
        return objects;
    }

    public void setObjects(ArrayList objects) {
        this.objects = objects;
    }

    @Override
    public String toString() {
        return  rol;
    }
    
    
}
