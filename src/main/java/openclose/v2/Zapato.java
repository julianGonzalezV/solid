package openclose.v2;

import java.util.Date;

public class Zapato extends ProductionOrder {
    public Zapato() {
    }

    public Zapato(Date deliveryDate, double cost, Date startDate, double buffer) {
        super(deliveryDate, cost, startDate, buffer);
    }
    @Override
    public double getBuffer() {
        return super.getBuffer()*3;
    }
}
