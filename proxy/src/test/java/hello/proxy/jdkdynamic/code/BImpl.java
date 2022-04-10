package hello.proxy.jdkdynamic.code;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by sskim on 2022/04/09
 * Github : http://github.com/sskim91
 */
@Slf4j
public class BImpl implements BInterface{
    @Override
    public String call() {
        log.info("B호출");
        return "b";
    }
}
