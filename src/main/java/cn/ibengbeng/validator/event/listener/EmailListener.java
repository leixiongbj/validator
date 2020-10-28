package cn.ibengbeng.validator.event.listener;

import cn.ibengbeng.validator.event.OrderEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EmailListener implements ApplicationListener<OrderEvent> {
    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    @Override
    public void onApplicationEvent(OrderEvent event) {
        System.out.println("发送邮件:"+event.getSource());
    }
}
