import org.example.calcularSalarioBruto;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
public class calcularSalarioBrutoTest {
    @Test

public void testCalculaSalarioBruto() throws Empleado.CAException {
    Empleado empleado = new Empleado();

    // Pruebas para vendedor
    Assertions.assertEquals(2000f, empleado.calculaSalarioBruto(Empleado.TipoEmpleado.VENDEDOR, 1000f, 8f), 0.001f);
    Assertions.assertEquals(1500f, empleado.calculaSalarioBruto(Empleado.TipoEmpleado.VENDEDOR, 0f, 3f), 0.001f);
    Assertions.assertEquals(1100f, empleado.calculaSalarioBruto(Empleado.TipoEmpleado.VENDEDOR, 1499.99f, 0f), 0.001f);

    // Pruebas para encargado
    Assertions.assertEquals(1250f + 200f + 160f, empleado.calculaSalarioBruto(Empleado.TipoEmpleado.ENCARGADO, 0f, 8f), 0.001f);
    Assertions.assertEquals(1000f + 150f, empleado.calculaSalarioBruto(Empleado.TipoEmpleado.ENCARGADO, 0f, 0f), 0.001f);
    Assertions.assertEquals(999.99f + 150f + 60f, empleado.calculaSalarioBruto(Empleado.TipoEmpleado.ENCARGADO, 0f, 3f), 0.001f);
    Assertions.assertEquals(500f + 150f, empleado.calculaSalarioBruto(Empleado.TipoEmpleado.ENCARGADO, 0f, 0f), 0.001f);

    // Pruebas de excepción
    Assertions.assertThrows(Empleado.CAException.class, () -> empleado.calculaSalarioBruto(null, 0f, 0f));
    Assertions.assertThrows(Empleado.CAException.class, () -> empleado.calculaSalarioBruto(Empleado.TipoEmpleado.VENDEDOR, -1f, 8f));
    Assertions.assertThrows(Empleado.CAException.class, () -> empleado.calculaSalarioBruto(Empleado.TipoEmpleado.VENDEDOR, 1500f, -1f));
}

    @Test
    public void testCalculaSalarioNeto() throws Empleado.CAException {
        Empleado empleado = new Empleado();

        // Pruebas de retención
        Assertions.assertEquals(1640f, empleado.calculaSalarioNeto(2000f), 0.001f);
        Assertions.assertEquals(1680f, empleado.calculaSalarioNeto(2000f - 0.16f * 1000f), 0.001f);
        Assertions.assertEquals(1640f, empleado.calculaSalarioNeto(1500f), 0.001f);
        Assertions.assertEquals(1300f, empleado.calculaSalarioNeto(1250f + 200f + 160f), 0.001f);
        Assertions.assertEquals(1000f, empleado.calculaSalarioNeto(1000f + 150f), 0.001f);

        // Pruebas de excepción
        Assertions.assertThrows(Empleado.CAException.class, () -> empleado.cal

    }
}
