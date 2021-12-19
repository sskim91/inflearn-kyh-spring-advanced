package hello.advanced.trace.template.code;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by sskim on 2021/12/18
 * Github : http://github.com/sskim91
 */
@Slf4j
public class SubClassLogic2 extends AbstractTemplate {

    @Override
    protected void call() {
        log.info("비즈니스 로직2 실행");
    }
}
