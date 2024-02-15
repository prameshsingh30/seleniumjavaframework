package SELENIUMJAVAFRAMEWORK.SELENIUMJAVAFRAMEWORK.common.exception;

import SELENIUMJAVAFRAMEWORK.SELENIUMJAVAFRAMEWORK.util.AppUtil;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class AccountNotExistException extends UsernameNotFoundException {

    public AccountNotExistException() {
        super(AppUtil.getMessage("accountNotExistException"));
    }

    public AccountNotExistException(String msg) {
        super(msg);
    }
}
