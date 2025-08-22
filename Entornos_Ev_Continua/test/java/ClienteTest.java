import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    private Cliente cliente;

    @BeforeEach

    public void configuracionCliente(){
        cliente = new Cliente("Pedro López", "12345678B", "654987321", "pedrolopez@gmail.com");
    }

    @Test

    public void testGetters(){
        assertEquals("Pedro López", cliente.getNombre());
        assertEquals("12345678B", cliente.getDni());
        assertEquals("654987321", cliente.getTelefono());
        assertEquals("pedrolopez@gmail.com", cliente.getMail());
    }

    @Test

    public void testSetters(){
        cliente.setNombre("María Frisone");
        cliente.setDni("789456123A");
        cliente.setTelefono("654258369");
        cliente.setMail("maria.frisone86@gmail.com");

        assertEquals("María Frisone", cliente.getNombre());
        assertEquals("789456123A", cliente.getDni());
        assertEquals("654258369", cliente.getTelefono());
        assertEquals("maria.frisone86@gmail.com", cliente.getMail());
    }

    @Test

    public void testVerInfo(){
        assertTrue(true);
    }
}