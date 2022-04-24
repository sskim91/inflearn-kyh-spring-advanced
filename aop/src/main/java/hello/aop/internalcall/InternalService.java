package hello.aop.internalcall;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created by sskim on 2022/04/24
 * Github : http://github.com/sskim91
 */
@Slf4j
@Component
public class InternalService {
    public void internal() {
        log.info("call internal");
    }
}
