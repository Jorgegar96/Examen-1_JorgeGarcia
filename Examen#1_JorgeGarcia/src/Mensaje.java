
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
public class Mensaje {

    private String titulo;
    private String cuerpo;
    private Date fecha;
    private Persona emisor;
    private Persona receptor;
    private boolean cifrado = false;

    public Mensaje() {
    }

    public Mensaje(String titulo, String cuerpo, Date fecha, Persona emisor, Persona receptor) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.fecha = fecha;
        this.emisor = emisor;
        this.receptor = receptor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Persona getEmisor() {
        return emisor;
    }

    public void setEmisor(Persona emisor) {
        this.emisor = emisor;
    }

    public Persona getReceptor() {
        return receptor;
    }

    public void setReceptor(Persona receptor) {
        this.receptor = receptor;
    }

    public void cifradoCesar() {
        String nuevo = "";
        for (int x = 0; x < cuerpo.length(); x++) {
            if (cuerpo.charAt(x) != 'z' && cuerpo.charAt(x) != 'Z' && cuerpo.charAt(x) != 'Y' && cuerpo.charAt(x) != 'y'
                    && cuerpo.charAt(x) != 'x' && cuerpo.charAt(x) != 'X') {
                nuevo += Character.toString((char) ((int) (cuerpo.charAt(x)) + 3));
            } else if (cuerpo.charAt(x) == 'z' || cuerpo.charAt(x) == 'Z') {
                nuevo += Character.toString((char) ((int) (cuerpo.charAt(x)) - 23));
            } else if (cuerpo.charAt(x) == 'Y' || cuerpo.charAt(x) == 'y') {
                nuevo += Character.toString((char) ((int) (cuerpo.charAt(x)) - 23));
            } else if (cuerpo.charAt(x) == 'x' || cuerpo.charAt(x) == 'X') {
                nuevo += Character.toString((char) ((int) (cuerpo.charAt(x)) - 23));
            }
        }
        cuerpo = nuevo;
    }
    
    public void descifradoCesar(){
        String nuevo = "";
        for (int x = 0; x < cuerpo.length(); x++) {
            if (cuerpo.charAt(x) != 'a' && cuerpo.charAt(x) != 'A' && cuerpo.charAt(x) != 'B' && cuerpo.charAt(x) != 'b'
                    && cuerpo.charAt(x) != 'c' && cuerpo.charAt(x) != 'C') {
                nuevo += Character.toString((char) ((int) (cuerpo.charAt(x)) - 3));
            } else if (cuerpo.charAt(x) == 'a' || cuerpo.charAt(x) == 'A') {
                nuevo += Character.toString((char) ((int) (cuerpo.charAt(x)) + 23));
            } else if (cuerpo.charAt(x) == 'b' || cuerpo.charAt(x) == 'B') {
                nuevo += Character.toString((char) ((int) (cuerpo.charAt(x)) + 23));
            } else if (cuerpo.charAt(x) == 'c' || cuerpo.charAt(x) == 'C') {
                nuevo += Character.toString((char) ((int) (cuerpo.charAt(x)) + 23));
            }
        }
        cuerpo = nuevo;
    }

    public boolean isCifrado() {
        return cifrado;
    }

    public void setCifrado(boolean cifrado) {
        this.cifrado = cifrado;
    }
        

}
