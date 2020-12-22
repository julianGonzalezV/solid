package openclose;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import dependencyinversion.v2.Automatic;
import dependencyinversion.v2.BuildingMethod;
import dependencyinversion.v2.ByHand;
import openclose.v1.ProductionOrder;
import openclose.v2.TShirtPo;
import openclose.v2.ShoesPo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductionPlantProcessTest  {
    private List<openclose.v1.ProductionOrder> orders;
    private List<openclose.v2.ProductionOrder> ordersV2;
    ProductionPlantProcess productionPlantProcess = new ProductionPlantProcess();

    void initTestConf(){
        orders = new ArrayList<>();
        orders.add(new openclose.v1.ProductionOrder(new Date(), 10000, new Date(),1, 'c'));
        orders.add(new openclose.v1.ProductionOrder(new Date(), 80000, new Date(),3, 'z'));
        //otro b*1.5
        //orders.add(new ProductionOrder(new Date(), 1200000, new Date(),1, 'o'));
    }

    void initTestConfV2(){
        ordersV2 = new ArrayList<>();
        ordersV2.add(new TShirtPo(new Date(), 10000, new Date(),1));
        ordersV2.add(new ShoesPo(new Date(), 80000, new Date(),3));
    }

    @Test
    @DisplayName("V1 Test para calcular el buffer por producto a producir")
    public void getTotalBuffersV1(){
        initTestConf();
        List<ProductionOrder> ordersR = productionPlantProcess.calculateRealBufferTestV1(orders);
        double sumBufExpected = productionPlantProcess.getTotalBuffers(ordersR.stream().map(o -> o.getBuffer()).collect(Collectors.toList()));
        assertEquals(sumBufExpected, 11);
    }

    @Test
    @DisplayName("V2: Test para calcular el buffer por producto a producir --- quitamos el tipo!")
    public void getTotalBuffersV2(){
        initTestConfV2();
        double sumBufExpected = productionPlantProcess.getTotalBuffers(ordersV2.stream().map(o -> o.getBuffer()).collect(Collectors.toList()));
        assertEquals(sumBufExpected, 11);
    }

    @Test
    @DisplayName("Building process v1")
    public void  buildingMethodV1(){
        assertEquals(productionPlantProcess.buildingMethodV1(), "Manual personalizada");
    }


    @Test
    @DisplayName("By hand Building process ")
    public void  buildingHandMethod(){
        productionPlantProcess = new ProductionPlantProcess(new ByHand());
        assertEquals(productionPlantProcess.buildingMethod(), "A mano, en donde nuestros artesanos son unos tesos en esto");
    }
    @Test
    @DisplayName("Automatic Building process ")
    public void  buildingAutoMethod(){
        productionPlantProcess = new ProductionPlantProcess(new Automatic());
        assertEquals(productionPlantProcess.buildingMethod(), "Automatic,maquinas");
    }

}
