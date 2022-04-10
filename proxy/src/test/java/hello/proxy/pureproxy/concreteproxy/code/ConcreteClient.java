package hello.proxy.pureproxy.concreteproxy.code;

/**
 * Created by sskim on 2022/04/06
 * Github : http://github.com/sskim91
 */
public class ConcreteClient {

    private ConcreteLogic concreteLogic;

    public ConcreteClient(ConcreteLogic concreteLogic) {
        this.concreteLogic = concreteLogic;
    }

    public void execute() {
        concreteLogic.operation();
    }
}
