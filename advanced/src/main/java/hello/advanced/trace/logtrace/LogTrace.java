package hello.advanced.trace.logtrace;

import hello.advanced.trace.TraceStatus;

/**
 * Created by sskim on 2021/12/05
 * Github : http://github.com/sskim91
 */
public interface LogTrace {

    TraceStatus begin(String message);

    void end(TraceStatus status);

    void exception(TraceStatus status, Exception e);
}
