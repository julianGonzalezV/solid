package openclose.v2;

import java.util.Date;

public class Camiseta extends  ProductionOrder {
    public Camiseta() {
    }

    public Camiseta(Date deliveryDate, double cost, Date startDate, double buffer) {
        super(deliveryDate, cost, startDate, buffer);
    }

    @Override
    public double getBuffer() {
        return super.getBuffer()*2;
    }
}
