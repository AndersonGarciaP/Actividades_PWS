import org.example.Calculador;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CalculadorTest {


    @Test
    public void testCalculaSalarioBruto_vendedor_8h() throws Calculador.CAException {
        Calculador calculador = new Calculador();
        float salarioBruto = calculador.calculaSalarioBruto(Calculador.TipoEmpleado.VENDEDOR, 2000f, 8f);
        assertEquals(1360f, salarioBruto, 0.0f);
    }


    @Test
    public void testCalculaSalarioBruto_vendedor_3h() throws Calculador.CAException {
        Calculador calculador = new Calculador();
        float salarioBruto = calculador.calculaSalarioBruto(Calculador.TipoEmpleado.VENDEDOR, 1500f, 3f);
        assertEquals(1260f, salarioBruto, 0.0f);
    }

    @Test
    public void testCalculaSalarioBruto_vendedor_0h() throws Calculador.CAException {
        Calculador calculador = new Calculador();
        float salarioBruto = calculador.calculaSalarioBruto(Calculador.TipoEmpleado.VENDEDOR, 1499.99f, 0f);
        assertEquals(1100f, salarioBruto, 0.0f);
    }

    @Test
    public void testCalculaSalarioBruto_encargado_8h() throws Calculador.CAException {
        Calculador calculador = new Calculador();
        float salarioBruto = calculador.calculaSalarioBruto(Calculador.TipoEmpleado.ENCARGADO, 1250f, 8f);
        assertEquals(1760f, salarioBruto, 0.0f);
    }

    @Test
    public void testCalculaSalarioBruto_horas_0() throws Calculador.CAException {
        Calculador calculador = new Calculador();
        float salarioBruto = calculador.calculaSalarioBruto(Calculador.TipoEmpleado.ENCARGADO, 1000, 0f);
        assertEquals(1600f, salarioBruto, 0.0f);
    }


    @Test
    public void testCalculaSalarioBruto_encargado_3h() throws Calculador.CAException {
        Calculador calculador = new Calculador();
        float salarioBruto = calculador.calculaSalarioBruto(Calculador.TipoEmpleado.ENCARGADO,999.99f , 3f);
        assertEquals(1560f, salarioBruto, 0.0f);
    }

    @Test
    public void testCalculaSalarioBruto_encargado_0h_500() throws Calculador.CAException {
        Calculador calculador = new Calculador();
        float salarioBruto = calculador.calculaSalarioBruto(Calculador.TipoEmpleado.ENCARGADO, 500f, 0f);
        assertEquals(1500f, salarioBruto, 0.0f);
    }

    @Test
    public void testCalculaSalarioBruto_encargado_0() throws Calculador.CAException {
        Calculador calculador = new Calculador();
        float salarioBruto = calculador.calculaSalarioBruto(Calculador.TipoEmpleado.ENCARGADO, 0f, 8f);
        assertEquals(1660f, salarioBruto, 0.0f);
    }


    @Test
    public void testCalculaSalarioBruto_vendedor_menos1() {
        Calculador calculador = new Calculador();
        try {
            calculador.calculaSalarioBruto(Calculador.TipoEmpleado.VENDEDOR, -1f, 8f);
            fail("Se esperaba una excepción CAException");
        } catch (Calculador.CAException e) {
            assertEquals("Los parámetros no pueden ser nulos o negativos", e.getMessage());
        }
    }


    @Test
    public void testCalculaSalarioBruto_vendedor_1500_menos1() {
        try {
            Calculador calculador = new Calculador();
            calculador.calculaSalarioBruto(Calculador.TipoEmpleado.VENDEDOR, 1500f, -1f);
            fail("Se esperaba una excepción de tipo CAException");
        } catch (Calculador.CAException ex) {
            assertEquals("Los parámetros no pueden ser nulos o negativos", ex.getMessage());
        }
    }

    @Test
    public void testCalculaSalarioBruto_Vendedor_HorasExtraInvalidas() {
        Calculador calculador = new Calculador();
        try {
            float salarioBruto = calculador.calculaSalarioBruto(null, 1500f, -1f);
            fail("Se esperaba una excepción pero no se lanzó ninguna.");
        } catch (Calculador.CAException e) {
            assertEquals("Los parámetros no pueden ser nulos o negativos", e.getMessage());
        }
    }


    @Test
    public void testCalculaSalarioBruto_null() {
        Calculador calculador = new Calculador();
        try {
            float salarioBruto = calculador.calculaSalarioBruto(null, 1500f, 8f);
            fail("Se esperaba una excepción pero no se lanzó ninguna.");
        } catch (Calculador.CAException e) {
            assertEquals("Los parámetros no pueden ser nulos o negativos", e.getMessage());
        }
    }
    @Test
    public void testCalculaSalarioNeto() throws Calculador.CAException {
        Calculador calculador = new Calculador();
        float salarioNeto = calculador.calculaSalarioNeto(2000f);
        assertEquals(1640f, salarioNeto, 0.0f);
    }
}
