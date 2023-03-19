import java.time.LocalDate;

public class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;


    //Constructor
    public Persona(String nombre){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    //Metodos
    public String getNombre(){
        return this.nombre;
    }
    public void setApellido (String apellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento){
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public LocalDate getFechaDeNacimiento(){
        return this.fechaDeNacimiento;
    }
}

