package openclose.v2;

import java.util.Date;

public class TShirtPo extends  ProductionOrder {
    public TShirtPo() {
    }

    public TShirtPo(Date deliveryDate, double cost, Date startDate, double buffer) {
        super(deliveryDate, cost, startDate, buffer);
    }

    @Override
    public double getBuffer() {
        return super.getBuffer()*2;
    }
}
