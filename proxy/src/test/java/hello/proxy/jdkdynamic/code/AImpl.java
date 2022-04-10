package hello.proxy.jdkdynamic.code;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by sskim on 2022/04/09
 * Github : http://github.com/sskim91
 */
@Slf4j
public class AImpl implements AInterface{
    @Override
    public String call() {
        log.info("A호출");
        return "a";
    }
}
