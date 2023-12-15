import com.epam.learn.jmp.bank.api.BankApi;
import com.epam.learn.jmp.service.api.SubscriptionServiceApi;

module jmp.application {
    uses BankApi;
    uses SubscriptionServiceApi;

    requires jmp.service.api;
    requires jmp.bank.api;
}