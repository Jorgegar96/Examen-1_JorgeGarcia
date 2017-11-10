/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JorgeLuis
 */
public class Personal extends Persona{
    // una ocupación dentro de la casa, horario de trabajo, tiempo que lleva trabajando (semanas) y sueldo
    private String ocupacion;
    private int horario_trabajo;
    private int semanasTrabajando;
    private float sueldo;

    public Personal() {
        super();
    }

    public Personal(String ocupacion, int horario_trabajo, int semanasTrabajando, String name, int age, int ID, String sexo, String estado_civil, String password) {
        super(name, age, ID, sexo, estado_civil, password);
        this.ocupacion = ocupacion;
        this.horario_trabajo = horario_trabajo;
        this.semanasTrabajando = semanasTrabajando;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getHorario_trabajo() {
        return horario_trabajo;
    }

    public void setHorario_trabajo(int horario_trabajo) {
        this.horario_trabajo = horario_trabajo;
    }

    public int getSemanasTrabajando() {
        return semanasTrabajando;
    }

    public void setSemanasTrabajando(int semanasTrabajando) {
        this.semanasTrabajando = semanasTrabajando;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return ocupacion;
    }
    
}
