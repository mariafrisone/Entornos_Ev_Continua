import java.time.LocalDate;
import java.util.ArrayList;

public class Venta {

    private Cliente cliente;
    private LocalDate fecha;
    private ArrayList<Producto> lineasDeVenta;
    private double total;

    public Venta(LocalDate fecha, Cliente cliente, ArrayList<Producto> lineasDeVenta) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.lineasDeVenta = lineasDeVenta;
        this.total = calcularTotal();
    }

    /**
     * Función para obtener los datos completos del cliente que realizó
     * la compra
     * @return - Datos cliente
     */
    public Cliente getCliente() {return cliente;}

    /**
     * Función para obtener la fecha en la que se está realizando la
     * venta del/los producto/s
     * @return - Fecha
     */
    public LocalDate getFecha() {return fecha;}

    /**
     * Función donde se guarda la información de los productos de cada venta realizada
     * @return - Listado productos vendidos
     */

    public ArrayList<Producto> getLineasDeVenta() {return lineasDeVenta;}

    /**
     * Función que me devuelve el total de cada venta realizada
     * @return - Total venta
     */

    public double getTotal() {return total;}

    /**
     * Función que me permite ver el listado de ventas detalladas con los datos
     * de los clientes, los productos vendidos y la fecha de la venta.
     */

    public void listadoVentas(){
        System.out.println("\n Cliente: " + this.cliente.getNombre() + "("+this.cliente.getDni() + ")");
        System.out.println("\n Fecha de la venta: " + this.fecha);
        System.out.println("Productos: ");
        for (Producto producto : this.lineasDeVenta){
            System.out.println("\nID mueble: " + producto.getId() + "\nModelo: " + producto.getModelo() + "\nMaterial: " + producto.getMaterial() +
                    "\nColor: " + producto.getColor() + "\nPrecio: " + producto.getPrecio() + "€");
        }
        System.out.println("Total: " + this.total + "€");
    }
    /**
     * Función que me permite realizar el cálculo de las ventas realizadas.
     * @return - Suma total
     */
    private double calcularTotal(){
        double sumaTotal = 0;
        for (Producto producto : lineasDeVenta){
            sumaTotal += producto.getPrecio();
        }
        return sumaTotal;
    }
}
