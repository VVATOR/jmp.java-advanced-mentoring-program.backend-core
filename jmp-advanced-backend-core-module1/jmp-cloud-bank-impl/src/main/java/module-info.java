import com.epam.learn.jmp.bank.api.BankApi;
import com.epam.learn.jmp.cloud.bank.BankServiceImpl;

module jmp.cloud.bank.impl {
    requires transitive jmp.bank.api;

    provides BankApi with BankServiceImpl;

    exports com.epam.learn.jmp.cloud.bank;
}