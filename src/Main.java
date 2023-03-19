import java.time.*;
public class Main {
    public static void main(String[] args) {

        //Crear Objeto Persona

    Persona persona1 = new Persona ("Mariana");
    persona1.setApellido("Gomez");
    persona1.setFechaDeNacimiento(LocalDate.of(1989,01,19));

        //Crear Objeto Producto 1
    Producto prod1 = new Producto ("Jabón en Polvo");
    prod1.setDescripcion("Art. de Limpieza");
    prod1.setFechaAlta(LocalDate.now());
    prod1.setPrecio(40.0);

        //Crear Objeto Producto 2
    Producto prod2 = new Producto ("Esponjas");
    prod2.setDescripcion("Art. de Limpieza");
    prod2.setFechaAlta(LocalDate.now());
    prod2.setPrecio(10.0);

        //Crear Objeto Producto 3
    Producto prod3 = new Producto ("Chocolates");
    prod3.setDescripcion("Alimentos");
    prod3.setFechaAlta(LocalDate.now());
    prod3.setPrecio(100.0);

        //Crear Objeto Carrito
    Carrito carrito = new Carrito();
    carrito.setPersona(new Persona[]{persona1});
    carrito.setProducto(new Producto[]{prod1,prod2,prod3});

        //Calcular Precio Carrito
    double precioTotal = 0;
    for (Producto producto : carrito.getProducto()){
        precioTotal+=producto.getPrecio();
    }
    carrito.setPrecio(precioTotal);

    System.out.println("El precio final del carrito es: $" + carrito.getPrecio());

    }
}
