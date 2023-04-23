package org.example;

public class Calculador {
        public enum TipoEmpleado {
            VENDEDOR, ENCARGADO
        }

        public static class CAException extends Exception {
            public CAException(String errorMessage) {
                super(errorMessage);
            }
        }

        public float calculaSalarioBruto(TipoEmpleado tipo, float ventasMes, float horasExtra) throws CAException {
            if (tipo == null || ventasMes < 0f || horasExtra < 0f) {
                throw new CAException("Los parámetros no pueden ser nulos o negativos");
            }

            float salarioBase = tipo == TipoEmpleado.VENDEDOR ? 1000f : 1500f;
            float prima = 0f;
            if (ventasMes >= 1000f) {
                prima = ventasMes >= 1500f ? 200f : 100f;
            }
            float salarioHorasExtra = horasExtra * 20f;
            return salarioBase + prima + salarioHorasExtra;
        }

        public float calculaSalarioNeto(float salarioBruto) throws CAException {
            if (salarioBruto < 0f) {
                throw new CAException("El salario bruto no puede ser negativo");
            }
            float retencion;
            if (salarioBruto < 1000f) {
                retencion = 0f;
            } else if (salarioBruto < 1500f) {
                retencion = 0.16f;
            } else {
                retencion = 0.18f;
            }
            return salarioBruto * (1 - retencion);
        }
    }

