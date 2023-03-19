import java.time.LocalDate;

public class Carrito {

    //Atributos
    private Persona[] persona;
    private Producto[] producto;
    private LocalDate fecha;
    private double precio;

    //Constructor
    public Carrito(){
        this.persona = persona;
        this.producto = producto;
        this.fecha = LocalDate.now();
        this.precio = precio;
    }

    //Metodo

    public Persona[] getPersona() {
        return persona;
    }
    public void setPersona(Persona[] persona) {
        this.persona = persona;
    }
    public Producto[] getProducto() {
        return producto;
    }
    public void setProducto(Producto[] producto) {
        this.producto = producto;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
