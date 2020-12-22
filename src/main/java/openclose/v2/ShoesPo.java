package openclose.v2;

import java.util.Date;

public class ShoesPo extends ProductionOrder {
    public ShoesPo() {
    }

    public ShoesPo(Date deliveryDate, double cost, Date startDate, double buffer) {
        super(deliveryDate, cost, startDate, buffer);
    }
    @Override
    public double getBuffer() {
        return super.getBuffer()*3;
    }
}
