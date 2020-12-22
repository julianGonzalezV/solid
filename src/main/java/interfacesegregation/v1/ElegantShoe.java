package interfacesegregation.v1;

import java.util.List;

public class ElegantShoe implements ShoesBuildingProcessI {
    @Override
    public boolean applyLeatherColor() {
        return false;
    }

    @Override
    public boolean confListOfSize(List<String> countrySizes) {
        return false;
    }

    @Override
    public boolean applyCordColor() {
        return false;
    }

    @Override
    public boolean applyLeatherBrightness() {
        return false;
    }

    @Override
    public boolean applySideIconicLogo() {
        return false;
    }

    @Override
    public double calculateComfort() {
        return 0;
    }
}
