
import java.util.ArrayList;
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
public class Persona {
  //Nombre, Edad, ID, un Sexo, Estado civil y una lista de mensajes
    private String name;
    private String password;
    private Date fecha_nacimiento;
    private int age;
    private int ID;
    private String sexo;
    private String estado_civil;
    private ArrayList<Mensaje> mensajes = new ArrayList();

    public Persona() {
    }

    public Persona(String name, Date nacimiento, int ID, String sexo, String estado_civil, String password) {
        this.name = name;
        this.fecha_nacimiento = nacimiento;
        setAge();
        this.ID = ID;
        this.sexo = sexo;
        this.estado_civil = estado_civil;
        this.password = password;
    }

    public Persona(String name,  int age, int ID, String sexo, String estado_civil, String password) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.ID = ID;
        this.sexo = sexo;
        this.estado_civil = estado_civil;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = (int)(fecha_nacimiento.getTime() - (new Date()).getTime() / (1000*60*60*24*365));
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
          
}
