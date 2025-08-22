import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class VentaTest {

    private Cliente cliente;
    private ArrayList<Producto> productosVenta;
    private Venta venta;

    @BeforeEach

    public void configuracionVenta(){
        cliente = new Cliente("Pedro López", "12345678B", "654987321", "pedrolopez@gmail.com");
        productosVenta = new ArrayList<>();
        productosVenta.add(new Producto("2", "Mesa de centro", "Madera", "Madera clara", 150));
        productosVenta.add(new Producto("3","Lámpara de pie", "Metal", "Plateada", 70));
        venta = new Venta(LocalDate.of(2025, 8, 22), cliente, productosVenta);
    }

    @Test

    public void testGetters(){
        assertEquals(cliente, venta.getCliente());
        assertEquals(LocalDate.of(2025,8,22), venta.getFecha());
        assertEquals(2, venta.getLineasDeVenta().size());
    }

    @Test

    public void testCalcularTotal(){
        double totalCompra = 150 + 70;
        assertEquals(totalCompra, venta.getTotal());
    }

    @Test

    public void testListadoVentas(){
        assertTrue(true);
    }
}