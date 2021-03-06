package config.bean;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 빈 설정 파일이란 뜻 => xml파일로 작성 안하고 자바로 설정파일을 만들면 보기도 더 편하고 xml파일을 없앨 수 도 있다.
@ComponentScan("com.company.souvcoffee") // base-package 스캔의 기준이 되는 패키지
public class JavaBeanConfig {


/*
AnnotationConfigApplicationContext를 사용해서 애노테이션으로 경로를 찾음

=> 이걸 적용할 곳에 넣기 (com.company.souvcoffee.MS.dao.msimpl )
    ApplicationContext context = new AnnotationConfigApplicationContext(  자바설정파일이름 작성=>JavaBeanConfig.class);

여러개 하고싶다면
  ApplicationContext context = new AnnotationConfigApplicationContext( );
context.register(AppConfig.class,OtherConfig.class);
context.refresh(); // 이걸 작성해야 IoC컨테이너에 담긴 것들이 등록되 활용가능



*/


  /*
  <bean id ="prodao" class="com.company.souvcoffee.MS.dao.msimpl"/>
    @Bean // 빈생성
    public productDao[인터페이스] prodao(){ //  함수 이름이라기 보단 =>  객체이름 (bean id에 해당)이라고 생각

         return new productDaoImpl(); // 요것이 bean으로써 IoC컨테이너에 담기는데 이 때 이름이 prodao가 되는것
    }



*/
}
