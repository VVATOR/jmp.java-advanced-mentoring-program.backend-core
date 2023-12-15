import com.epam.learn.jmp.cloud.service.SubscriptionServiceImpl;
import com.epam.learn.jmp.service.api.SubscriptionServiceApi;

module jmp.cloud.service.impl {
    requires transitive jmp.service.api;

    provides SubscriptionServiceApi with SubscriptionServiceImpl;

    exports com.epam.learn.jmp.cloud.service;
}