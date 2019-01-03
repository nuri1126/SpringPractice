import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args){
        //원래의 자바 코드
        //TansportationWalk tw = new TransportationWalk();
        //tw.move();

        //컨테이너 생성
        GenericXmlApplicationContext ctx  = new GenericXmlApplicationContext("classpath:applicationContext.xml");

        //객체를 가져옴
        TransportationWalk transportationWalk = ctx.getBean("tw", TransportationWalk.class);
        transportationWalk.move();

        ctx.close();
    }
}
