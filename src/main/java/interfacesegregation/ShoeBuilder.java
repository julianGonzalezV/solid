package interfacesegregation;

import interfacesegregation.v2.ElegantShoe;
import interfacesegregation.v2.SportShoe;

public class ShoeBuilder {
    public static String buildSportShoe(SportShoe shoe){
        return String.format("%s%s%s%s%s",shoe.brand(),shoe.model(),shoe.confListOfSize(),
                shoe.calculateComfort(), shoe.applySideIconicLogo());
    }

    public static String buildElegantShoe(ElegantShoe shoe){
        return String.format("%s%s%s%s%s",shoe.brand(),shoe.model(),shoe.confListOfSize(),
                shoe.calculateComfort(), shoe.applyCordColor(),shoe.applyCordSize(),
                shoe.applyLeatherColor(), shoe.applyLeatherBrightness());
    }

}
