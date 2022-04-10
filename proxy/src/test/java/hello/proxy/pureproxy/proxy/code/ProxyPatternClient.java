package hello.proxy.pureproxy.proxy.code;

/**
 * Created by sskim on 2022/04/03
 * Github : http://github.com/sskim91
 */
public class ProxyPatternClient {
    private Subject subject;

    public ProxyPatternClient(Subject subject) {
        this.subject = subject;
    }

    public void execute() {
        subject.operation();
    }
}
