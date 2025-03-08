package unitestes;






import calculadora.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Guglielmo H T
 */
public class CalculadoraTest {
        @Test
    public void testCalcularMedia() {
        double resultado = Calculadora.calcularMedia(8.0, 10.0);
        assertEquals(9.0, resultado,0.0001);
    }
}
