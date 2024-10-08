package personas;


import java.util.Date;

public class Persona {
    
    private String nombre;
    private String apellido;
    private Date edad;
    private String amo;

    public Persona(String nombre, String apellido, Date edad, String amo) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.amo = amo;
    }

    public String getNombre () {
        return nombre;
    }  

    public String getapellido () {
        return apellido;
    }

    public Date getedad(){
        return edad;
    }

    public String getamo() {
        return amo;
    }

}
