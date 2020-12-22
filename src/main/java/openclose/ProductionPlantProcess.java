package openclose;

import dependencyinversion.v1.Manually;
import dependencyinversion.v2.BuildingMethod;

import java.util.List;
import java.util.stream.Collectors;

public class ProductionPlantProcess {
    private  BuildingMethod buildingMethod;
    public ProductionPlantProcess() {
    }

    public ProductionPlantProcess(BuildingMethod buildingMethod) {
        this.buildingMethod = buildingMethod;
    }

    public static List<openclose.v1.ProductionOrder>  calculateRealBufferTestV1(List<openclose.v1.ProductionOrder> ProductionOrders){
        return ProductionOrders.stream().map( x -> {
            //bad smell
           if(x.getType()=='z') x.setBuffer(x.getBuffer() * 3);
           if(x.getType()=='c') x.setBuffer(x.getBuffer() * 2);
           return x;
        }).collect(Collectors.toList());
    }

    // NO necesita un calculateRealBufferTest cuando se usa  openclose.v2.ProductionOrder !
    /*...calculateRealBufferTestV2(List<openclose.v2.ProductionOrder> ProductionOrders){
        ...
    }*/



    public  double  getTotalBuffers(List<Double> ProductionOrders){
        return ProductionOrders.stream().reduce((x,y) -> x+y).get();
    }

    public  String  buildingMethodV1(){
        return new Manually().getData();
    }

    public  String  buildingMethod(){
        return buildingMethod.getData();
    }
}
