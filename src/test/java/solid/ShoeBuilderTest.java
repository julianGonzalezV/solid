package solid;

import interfacesegregation.ShoeBuilder;
import interfacesegregation.v2.ReebokShoe;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoeBuilderTest {
    private ShoeBuilder shoeBuilder;

    @Test
    @DisplayName("V1 Test para calcular el buffer por producto a producir")
    public void getTotalBuffersV1(){
        String result = ShoeBuilder.buildSportShoe(new ReebokShoe());
        assertEquals(result, " Rebook Cool tengo lista de tamanios calificacion de comfort de 9.6 de 10 logo de la marca en ambos lados");
    }
}
