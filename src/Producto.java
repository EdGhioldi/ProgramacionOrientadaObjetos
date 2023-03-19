import java.time.LocalDate;

public class Producto {

    //Atributos
    private String nombre;
    private String descripcion;
    private LocalDate fechaAlta;
    private Double precio;

    //Constructores

    public Producto(String nombre) {
        this.nombre = nombre;
        this.fechaAlta = LocalDate.now();
        this.precio = precio;
    }

    //Metodos

    public String getNombre(){
        return this.nombre;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public String getDescripcion(){
        return this.descripcion;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }
    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
