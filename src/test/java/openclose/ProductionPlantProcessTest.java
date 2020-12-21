package openclose;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductionPlantProcessTest  {

    private ProductionPlantProcess plantProcess;
    private List<ProductionOrder> ordersExpected;
    private List<ProductionOrder> orders;

    void initTestConf(){
        plantProcess = new ProductionPlantProcess();
        orders = new ArrayList<>();
        orders.add(new ProductionOrder(new Date(), 10000, new Date(),1, 'c'));
        orders.add(new ProductionOrder(new Date(), 80000, new Date(),3, 'z'));
        //orders.add(new ProductionOrder(new Date(), 1200000, new Date(),1, 'o'));

        ordersExpected = new ArrayList<>();
        ordersExpected.add(new ProductionOrder(new Date(), 10000, new Date(),1, 'c'));
        ordersExpected.add(new ProductionOrder(new Date(), 80000, new Date(),8, 'z'));
    }

    @Test
    @DisplayName("Test para calcular el buffer por producto a producir")
    public void calculateRealBufferTest(){
        initTestConf();
        List<ProductionOrder> ordersR = plantProcess.calculateRealBufferTest(orders);
        double sumBufExpected = ordersR.stream().map(o -> o.getBuffer()).reduce((x,y) -> x+y).get();
        double sumBufActual = ordersExpected.stream().map(o -> o.getBuffer()).reduce((x,y) -> x+y).get();
        assertEquals(sumBufExpected, sumBufActual);
    }

}
