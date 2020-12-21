package openclose;

import java.util.List;
import java.util.stream.Collectors;

public class ProductionPlantProcess {

    public List<ProductionOrder>  calculateRealBufferTest(List<ProductionOrder> ProductionOrders){
        return ProductionOrders.stream().map( x -> {
            //bad smell
           if(x.getType()=='z') x.setBuffer(x.getBuffer() * 3);
           if(x.getType()=='c') x.setBuffer(x.getBuffer() * 1);
           return x;
        }).collect(Collectors.toList());
    }
}
