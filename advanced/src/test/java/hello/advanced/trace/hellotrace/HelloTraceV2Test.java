package hello.advanced.trace.hellotrace;

import hello.advanced.trace.TraceStatus;
import org.junit.jupiter.api.Test;

/**
 * Created by sskim on 2021/11/29
 * Github : http://github.com/sskim91
 */
class HelloTraceV2Test {

    @Test
    void begin_end() throws Exception{
        HelloTraceV2 trace = new HelloTraceV2();
        TraceStatus status1 = trace.begin("hello1");
        TraceStatus status2 = trace.beginSync(status1.getTraceId(), "hello2");
        trace.end(status2);
        trace.end(status1);
    }

    @Test
    void begin_exception() throws Exception{
        HelloTraceV2 trace = new HelloTraceV2();
        TraceStatus status1 = trace.begin("hello");
        TraceStatus status2 = trace.beginSync(status1.getTraceId(),"hello2");
        trace.exception(status2, new IllegalStateException("예외"));
        trace.exception(status1, new IllegalStateException("예외"));
    }

}