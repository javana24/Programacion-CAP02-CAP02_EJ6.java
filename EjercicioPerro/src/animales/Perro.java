package animales;

import java.util.Date;
import personas.Persona;

public class Perro {
    
    private String nombre;
    private String raza;
    private Date edad;
    private Persona amo;

    public Perro(String nombre, String raza, Date edad, Persona amo){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.amo = amo;
    }

    public String getNombre () {
        return nombre;
    }  

    public String getraza () {
        return raza;
    }

    public Date getedad(){
        return edad;
    }

    public Persona getamo() {
        return amo;
    }
}

