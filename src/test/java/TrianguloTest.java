import org.example.Calculador;
import org.example.Triangulo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TrianguloTest {

    @Test
    public void testTipoTrianguloEquilatero() {
        String tipo = Triangulo.tipoTriangulo(3, 3, 3);
        assertEquals("Equilatero", tipo);
    }



    @Test
    public void testTipoTrianguloIsosceles() {
        String tipo = Triangulo.tipoTriangulo(5, 7, 5);
        assertEquals("Isosceles", tipo);
    }
    @Test
    public void testTipoTrianguloEscaleno() {
        String tipo = Triangulo.tipoTriangulo(3, 4, 5);
        assertEquals("Escaleno", tipo);
    }

    @Test
    public void testTipoTrianguloNoExiste() {
        String tipo = Triangulo.tipoTriangulo(1, 2, 10);
        assertEquals("No existe", tipo);
    }

}
