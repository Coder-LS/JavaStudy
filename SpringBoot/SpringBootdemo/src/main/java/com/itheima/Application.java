package com.itheima;

//import org.mybatis.spring.annotation.MapperScan;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * @Description TODO
 * @Author W12777
 * @Date 2021/5/11 14:01
 * @Version 1.0
 **/

/**
 *      1.这个注解的作用就是声明当前类是一个配置类，然后Spring会自动扫描到添加了@Configuration的类，
 *          并且读取其中的配 置信息。而@SpringBootConfiguration是来声明当前类是SpringBoot应用的配置类，
 *          项目中只能有一个。所以一 般我们无需自己添加。
 *
 *      2.总结，Spring Boot内部对大量的第三方库或Spring内部库进行了默认配置，这些配置是否生效，
 *          取决于我们是否引 入了对应库所需的依赖，如果有那么默认配置就会生效,也提供了自定义配置的入口.
 *
 *      3.@SpringBootApplication注解声明的类就是main函数所在的启动类，因此扫描的包是该类所在包及其子 包。
 *          因此，一般启动类会放在一个比较前的包目录中。
 *
 *
 *
 *
 *
 * SpringBoot为我们提供了默认配置，而默认配置生效的步骤：
 * 1.@EnableAutoConfiguration注解会去寻找META-INF/spring.factories文件，
 *      读取其中以 EnableAutoConfiguration为key的所有类的名称，
 *      这些类就是提前写好的自动配置类
 * 2.这些类都声明了@Configuration注解，并且通过@Bean注解提前配置了我们所需要的一切实例
 * 3.但是，这些配置不一定生效，因为有@ConditionalOn注解，满足一定条件才会生效。比如条件之一：
 *      是一些 相关的类要存在
 * 4.类要存在，我们只需要引入了相关依赖（启动器），依赖有了条件成立，自动配置生效。
 * 5.如果我们自己配置了相关Bean，那么会覆盖默认的自动配置的Bean
 * 6.我们还可以通过配置application.yml文件，来覆盖自动配置中的属性
 * 7.如果properties和yml文件都存在，如果有重叠属性，默认以Properties优先.
 *
 *
 */

@SpringBootApplication
@MapperScan("com.itheima.mapper")
public class Application {
    public static void main(String[] args) {
        // 启动代码
        SpringApplication.run(Application.class,args);
        System.out.println("成功22!");
    }
}
