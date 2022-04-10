package hello.aop.order.aop;

import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by sskim on 2022/04/10
 * Github : http://github.com/sskim91
 */
public class Pointcuts {

    //hello.aop.order 패키지와 하위 패키지
    @Pointcut("execution(* hello.aop.order..*(..))")
    public void allOrder() {
    }  //포인트컷 시그니처 pointcut signature

    //클래스 이름 패턴이 *Service
    @Pointcut("execution(* *..*Service.*(..))")
    public void allService() {
    }

    //allOrder && allService
    @Pointcut("allOrder() && allService()")
    public void orderAndService() {

    }
}
