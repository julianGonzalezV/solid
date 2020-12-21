package openclose;

import java.util.Date;

public class ProductionOrder {
    private Date deliveryDate;
    private double cost;
    private Date startDate;
    private  double buffer;
    private char type;

    public ProductionOrder() {
    }

    public ProductionOrder(Date deliveryDate, double cost, Date startDate, double buffer, char type) {
        this.deliveryDate = deliveryDate;
        this.cost = cost;
        this.startDate = startDate;
        this.buffer = buffer;
        this.type = type;
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

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "ProductionOrder{" +
                "deliveryDate=" + deliveryDate +
                ", cost=" + cost +
                ", startDate=" + startDate +
                ", buffer=" + buffer +
                ", type=" + type +
                '}';
    }
}
