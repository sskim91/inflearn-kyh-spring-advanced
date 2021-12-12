package hello.advanced.trace.logtrace;

import hello.advanced.trace.TraceStatus;
import hello.advanced.trace.threadlocal.code.ThreadLocalService;
import org.junit.jupiter.api.Test;

/**
 * Created by sskim on 2021/12/05
 * Github : http://github.com/sskim91
 */
class ThreadLocalLogTraceTest {

    ThreadLocalLogTrace trace = new ThreadLocalLogTrace();

    @Test
    void begin_end_level2() throws Exception{
        TraceStatus status1 = trace.begin("hello1");
        TraceStatus status2 = trace.begin("hello2");
        trace.end(status2);
        trace.end(status1);
    }

    @Test
    void begin_exception_level2() throws Exception{
        TraceStatus status1 = trace.begin("hello1");
        TraceStatus status2 = trace.begin("hello2");
        trace.exception(status2, new IllegalStateException());
        trace.exception(status1, new IllegalStateException());
    }

}