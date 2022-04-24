package hello.aop.internalcall;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created by sskim on 2022/04/24
 * Github : http://github.com/sskim91
 */
@Slf4j
@Component
public class CallServiceV0 {

    public void external() {
        log.info("call external");
        internal(); //내부 메서드 호출(this.interval())
    }

    public void internal() {
        log.info("call internal");
    }
}
