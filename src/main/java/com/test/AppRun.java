/**
 * 启动类规则
 * 1.启动类位置：主包下面和子包同级
 * 2.需要一个@SpringBootApplication
 */
@SpringBootApplication
public class AppRun {
    public static void main(String[] args) {
//        参数：启动类类对象 主函数形参名
        SpringApplication.run(AppRun.class,args);
    }
}
