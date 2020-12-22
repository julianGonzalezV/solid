package interfacesegregation.v2;

import java.util.List;

public class SportShoe implements BaseShoe, IconicShoe {
    @Override
    public String confListOfSize(List<String> countrySizes) {
        return "tengo lista de tamanios";
    }

    @Override
    public String calculateComfort() {
        return " calificacion de comfort de 9 de 10";
    }

    @Override
    public String applySideIconicLogo() {
        return " logo de la marca en ambos lados";
    }
}
