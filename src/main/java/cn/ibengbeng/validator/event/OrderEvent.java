package cn.ibengbeng.validator.event;

import org.springframework.context.ApplicationEvent;

/**
 * 定义订单事件
 */
public class OrderEvent extends ApplicationEvent {
    public OrderEvent(Object source) {
        super(source);
    }
}
