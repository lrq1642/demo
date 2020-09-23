import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");
        Bean1 bean2 = (Bean1) applicationContext.getBean("bean1");

        Bean2 bean3 = (Bean2) applicationContext.getBean("bean2");
        Bean2 bean4 = (Bean2) applicationContext.getBean("bean2");

        System.out.println("单例模式");
        System.out.println(bean1);
        System.out.println(bean2);

        System.out.println("原型模式");
        System.out.println(bean3);
        System.out.println(bean4);
    }

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");
        Bean1 bean2 = (Bean1) applicationContext.getBean("bean1");

        Bean2 bean3 = (Bean2) applicationContext.getBean("bean2");
        Bean2 bean4 = (Bean2) applicationContext.getBean("bean2");

        System.out.println("单例模式");
        System.out.println(bean1);
        System.out.println(bean2);

        System.out.println("原型模式");
        System.out.println(bean3);
        System.out.println(bean4);
    }
}
