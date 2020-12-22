package interfacesegregation.v2;

import java.util.List;

public abstract class ElegantShoe implements BaseShoe, ShoeCord, ShoeLeather {
    @Override
    public String confListOfSize() {
        return "tengo lista de tamanios";
    }

    @Override
    public String calculateComfort() {
        return " calificacion de comfort de 8.5 de 10";
    }

    @Override
    public String applyCordColor() {
        return " cordones negro";
    }

    @Override
    public String applyCordSize() {
        return " de 40cm";
    }

    @Override
    public String applyLeatherBrightness() {
        return " opaco";
    }

    @Override
    public String applyLeatherColor() {
        return " color blanco";
    }
}
