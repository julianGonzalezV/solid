package interfacesegregation.v2;

import java.util.List;

public class ElegantShoe implements BaseShoe, ShoeCord, ShoeLeather {
    @Override
    public String confListOfSize(List<String> countrySizes) {
        return "tengo lista de tamanios";
    }

    @Override
    public String calculateComfort() {
        return " calificacion de comfort de 9 de 10";
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
