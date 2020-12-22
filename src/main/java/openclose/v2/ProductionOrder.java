package openclose.v2;

import java.util.Date;

public abstract class ProductionOrder {
    private Date deliveryDate;
    private double cost;
    private Date startDate;
    private  double buffer;

    public ProductionOrder() {
    }

    public ProductionOrder(Date deliveryDate, double cost, Date startDate, double buffer) {
        this.deliveryDate = deliveryDate;
        this.cost = cost;
        this.startDate = startDate;
        this.buffer = buffer;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public double getBuffer() {
        return buffer;
    }

    public void setBuffer(double buffer) {
        this.buffer = buffer;
    }



    @Override
    public String toString() {
        return "ProductionOrder{" +
                "deliveryDate=" + deliveryDate +
                ", cost=" + cost +
                ", startDate=" + startDate +
                ", buffer=" + buffer +
                '}';
    }
}
