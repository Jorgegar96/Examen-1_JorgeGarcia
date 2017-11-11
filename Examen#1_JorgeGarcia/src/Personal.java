
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
public class Personal extends Persona{
    // una ocupación dentro de la casa, horario de trabajo, tiempo que lleva trabajando (semanas) y sueldo
    private String ocupacion;
    private int horario_trabajo;
    private int semanasTrabajando;
    private float sueldo;
    private int entrada;
    private int salida;
    private Date nacimiento;

    public Personal() {
        super();
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Personal(String ocupacion, int entrada, int salida, Date fecha, int semanasTrabajando, String name, int ID, String sexo, String estado_civil, String password) {
        super(name, fecha, ID, sexo, estado_civil, password);
        this.ocupacion = ocupacion;
        this.entrada = entrada;
        this.salida = salida;
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
