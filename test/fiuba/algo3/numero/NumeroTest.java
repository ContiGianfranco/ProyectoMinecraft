package fiuba.algo3.numero;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumeroTest {


    //Test redundante
    @Test
    public void test01NumeroEs8() {

        Numero num = new Numero();
        num.guardarValor();

        assertEquals(8, (num.numeroRandom));
    }
}
