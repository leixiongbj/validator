package cn.ibengbeng.validator.event.listener;

import cn.ibengbeng.validator.event.OrderEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;


@Component
public class SmsListener implements SmartApplicationListener {

    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("发送短信:"+event.getSource());
    }

    /**
     * Determine whether this listener actually supports the given event type.
     *
     * @param eventType the event type (never {@code null})
     */
    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
        return eventType == OrderEvent.class;
    }

    /**
     * Determine whether this listener actually supports the given source type.
     * <p>The default implementation always returns {@code true}.
     *
     * @param sourceType the source type, or {@code null} if no source
     */
    @Override
    public boolean supportsSourceType(Class<?> sourceType) {
        return true;
    }

    /**
     * Determine this listener's order in a set of listeners for the same event.
     * <p>The default implementation returns {@link #LOWEST_PRECEDENCE}.
     */
    @Override
    public int getOrder() {
        return 1;
    }
}
