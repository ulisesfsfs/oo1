import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class MapTest {


    private Map<String,Integer> coleccion;

    @BeforeEach
    void setUp(){
        this.coleccion=new HashMap<>();
    }

    @Test
    void testAdd(){
        this.coleccion.put("Lionel Messi",111);
        this.coleccion.put("Gabriel Batistuta",56);
        this.coleccion.put("Kun Aguero",42);
        assertTrue(this.coleccion.containsKey("Lionel Messi"));
        assertTrue(this.coleccion.containsValue(111));
        assertTrue(this.coleccion.containsKey("Gabriel Batistuta"));
        assertTrue(this.coleccion.containsValue(56));
        assertTrue(this.coleccion.containsKey("Kun Aguero"));
        assertTrue(this.coleccion.containsValue(42));
    }

    @Test
    void testRemove(){
        this.coleccion.remove("Kun Aguero");
        assertFalse(this.coleccion.containsKey("Kun Aguero"));
        assertFalse(this.coleccion.containsValue(42));
    }

    @Test
    void testActualizar(){
        this.coleccion.put("Lionel Messi",112);
        assertTrue(this.coleccion.containsValue(112));
    }

    @Test
    void testGoles(){

    }



}
