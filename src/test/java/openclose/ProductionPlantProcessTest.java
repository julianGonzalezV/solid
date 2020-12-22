package openclose;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import openclose.v1.ProductionOrder;
import openclose.v2.Camiseta;
import openclose.v2.Zapato;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductionPlantProcessTest  {

    private List<openclose.v1.ProductionOrder> orders;

    private List<openclose.v2.ProductionOrder> ordersV2;

    void initTestConf(){
        orders = new ArrayList<>();
        orders.add(new openclose.v1.ProductionOrder(new Date(), 10000, new Date(),1, 'c'));
        orders.add(new openclose.v1.ProductionOrder(new Date(), 80000, new Date(),3, 'z'));
        //otro b*1.5
        //orders.add(new ProductionOrder(new Date(), 1200000, new Date(),1, 'o'));
    }

    void initTestConfV2(){
        ordersV2 = new ArrayList<>();
        ordersV2.add(new Camiseta(new Date(), 10000, new Date(),1));
        ordersV2.add(new Zapato(new Date(), 80000, new Date(),3));

    }

    @Test
    @DisplayName("V1 Test para calcular el buffer por producto a producir")
    public void getTotalBuffersV1(){
        initTestConf();
        List<ProductionOrder> ordersR = ProductionPlantProcess.calculateRealBufferTestV1(orders);
        double sumBufExpected = ProductionPlantProcess.getTotalBuffers(ordersR.stream().map(o -> o.getBuffer()).collect(Collectors.toList()));
        assertEquals(sumBufExpected, 11);
    }

    @Test
    @DisplayName("V2: Test para calcular el buffer por producto a producir --- quitamos el tipo!")
    public void getTotalBuffersV2(){
        initTestConfV2();
        double sumBufExpected = ProductionPlantProcess.getTotalBuffers(ordersV2.stream().map(o -> o.getBuffer()).collect(Collectors.toList()));
        assertEquals(sumBufExpected, 11);
    }

}
