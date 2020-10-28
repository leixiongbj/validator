package cn.ibengbeng.validator.controller;


import cn.ibengbeng.validator.event.publisher.OrderPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderPublisher orderPublisher;
    /**
     * spring event测试
     */
    @RequestMapping(value = "/commit",method = RequestMethod.GET)
    public void commit(){
        System.out.println("下单了...");
        orderPublisher.publish();
        System.out.println("done...");
    }
}
