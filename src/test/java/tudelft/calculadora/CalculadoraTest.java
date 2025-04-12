package tudelft.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    // Cobertura de sentencia: linea return a + b; sera ejecutada
    @Test
    public void testSumar() {
        Calculadora calcu = new Calculadora();
        assertEquals(5, calcu.sumar(2, 3));
        assertEquals(0, calcu.sumar(-1, 1));
        assertEquals(-7, calcu.sumar(-3, -4));
    }

    // Cobertura de decisiones: se prueba  if (numero > 0)
    // Cobertura de condiciones: se verifica que numero > 0 se evalue como true
    @Test
    public void testEvaluarPositivo() {
        Calculadora calcu = new Calculadora();
        assertEquals("Positivo", calcu.evaluarNumero(10));
    }

    // Cobertura de decisiones: se prueba else if (numero < 0)
    // Cobertura de condiciones: se verifica que numero < 0 se evalue como true
    @Test
    public void testEvaluarNegativo() {
        Calculadora calcu = new Calculadora();
        assertEquals("Negativo", calcu.evaluarNumero(-5));
    }

    // Cobertura de decisiones: se prueba "else"
    // Cobertura de caminos: completa la 3ra ruta posible
    @Test
    public void testEvaluarCero() {
        Calculadora calcu = new Calculadora();
        assertEquals("Cero", calcu.evaluarNumero(0));
    }

    // Cobertura de sentencia: evalua return numero % 2 == 0;
    // Cobertura de condiciones: evalua true y false del resultado booleano
    // Cobertura de caminos: cubre caminos con par, impar, cero y negativos
    @Test
    public void testEsPar() {
        Calculadora calcu = new Calculadora();
        assertTrue(calcu.esPar(2));  // par
        assertFalse(calcu.esPar(3)); // impar
        assertTrue(calcu.esPar(-4)); // par
        assertFalse(calcu.esPar(-3)); // impar
    }
}
