package cn.ibengbeng.validator.event.publisher;


import cn.ibengbeng.validator.event.OrderEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class OrderPublisher {
    @Autowired
    private ApplicationContext applicationContext;

    public void publish(){
        String msg = "双11快到了，下单吧...";
        OrderEvent orderEvent = new OrderEvent(msg);
        applicationContext.publishEvent(orderEvent);
    }
}
