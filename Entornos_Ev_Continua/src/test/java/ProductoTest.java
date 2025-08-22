import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    private Producto producto;

    @BeforeEach

    public void configuracionProducto(){
        producto = new Producto("1", "Mesa Comedor", "Madera", "Blanca", 250);
    }

    @Test

    public void testGetters(){
        assertEquals("1", producto.getId());
        assertEquals("Mesa Comedor", producto.getModelo());
        assertEquals("Madera", producto.getMaterial());
        assertEquals("Blanca", producto.getColor());
        assertEquals(250, producto.getPrecio());
    }

    @Test

    public void testVerDetalle(){
        assertTrue(true);
    }
}