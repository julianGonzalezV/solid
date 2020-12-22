package interfacesegregation.v2;

import java.util.List;

public abstract class SportShoe implements BaseShoe, IconicShoe {
    @Override
    public String confListOfSize() {
        return " tengo lista de tamanios";
    }

    @Override
    public String calculateComfort() {
        return " calificacion de comfort de 9.6 de 10";
    }

    @Override
    public String applySideIconicLogo() {
        return " logo de la marca en ambos lados";
    }
}
