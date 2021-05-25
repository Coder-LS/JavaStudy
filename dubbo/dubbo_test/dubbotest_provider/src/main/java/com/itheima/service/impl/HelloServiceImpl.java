package com.itheima.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.service.HelloService;
import org.springframework.transaction.annotation.Transactional;


/**
 * 通过上面的断点调试可以看到，在HelloServiceImpl类上加入事务注解后，
 * Spring会为此类基于JDK动态代理技术创建代理对象，创建的代理对象完整类名为com.sun.proxy.$Proxy35，
 * 导致Dubbo在进行包匹配时没有成功（因为我们在发布服务时扫描的包为com.itheima.service），
 * 所以后面真正发布服务的代码没有执行。
 *
 * 解决方式操作步骤：
 */


//(2)修改HelloServiceImpl类，在Service注解中加入interfaceClass属性，
// 值为HelloService.class，作用是指定服务的接口类型

@Service(interfaceClass = HelloService.class,protocol = "dubbo") //发布服务必须使用Dubbo提供的Service注解
@Transactional
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "8083 hello " + name;
    }
}
