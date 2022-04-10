package hello.proxy.common.service;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by sskim on 2022/04/09
 * Github : http://github.com/sskim91
 */
@Slf4j
public class ConcreteService {
    public void call() {
        log.info("ConcreteService 호출");
    }
}
