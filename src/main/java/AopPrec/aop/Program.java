package AopPrec.aop;

import AopPrec.aop.aopsample.Exam;
import AopPrec.aop.aopsample.NewExam;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

public class Program {

    public static void main(String[] args) {
        // 인터페이스   /   클래스
        Exam exam1= new NewExam(1, 1, 1, 1);


     //   System.out.println(exam1.total());


        // 프락시 사용
        //Exam proxy=  Proxy.newProxyInstance(loader,interfaces,h);
        // loader => 실제 업무를 호출 할 수 있어야기 때문에 실 객체(NewExam 같이 실제 존재하는 이름) 클래스 넣음
        // 인터페이스 => 복수 가능( == class[] { , }) /정보 넘겨줌 , NewExam에서 여러 인터페이스를 받고 있으면 모두 적어줘야 가짜를 만들때 문제가 없음

        Exam proxy = (Exam) Proxy.newProxyInstance(
                NewExam.class.getClassLoader(),
                new Class[]{Exam.class},
                new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

                long start = System.currentTimeMillis();

                //실제 업무 호출
                Object result = method.invoke(exam1, args);

                long end = System.currentTimeMillis();

                String message = "main에서 값이 온 후 걸린시간을 계산 이후 반환 "+(end - start)+" ms";
                System.out.println(message);

                return result;

            }
        });

        System.out.println("스프링을 사용하지 않고 aop 구현 : aop는 방법론   : 트랜젝션 로그 등등을 곁다리 업무를  분리하기 위함 ");
        System.out.println("기존의 자바코드를 수정하지 않고 꼈다 뺐다가 할 수 있는 aop 기능 \n 곁다리 업무를 따로 분리해서 로그,트렌젝션등을 처리할 수 있게 해준다");
        System.out.println("새객체가 생성되고 값을  인터페이스 Exam -> 실 객체 NewExam으로 가 계산 후 함수서 계산한 값 프린트  \n 이후 main으로 돌아와서 main 프린트 출력 \n");

        System.out.printf("[ 원 객체 ] total exam1 total is  %d " , exam1.total());

        System.out.printf("[ 프록시 토탈 ] total proxy total is %d " , proxy.total());

        System.out.printf("[ 프록시 평균 ] total proxy avg is %f " , proxy.avg());


    }
}