package com.itheima.intercepter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * 总结：通过实现WebMvcConfigurer并添加@Configuration注解来实现自定义部分SpringMvc配置
 *
 * @Description TODO
 * @Author W12777
 * @Date 2021/5/13 21:10
 * @Version 1.0
 **/


/**
 *  http://localhost/hello
 *
 * 2021-05-13 21:41:04.919 DEBUG 19436 --- [p-nio-80-exec-2] com.itheima.intercepter.MyInterceptor    : 这是MyInterceptor拦截器的postHandle方法
 * 2021-05-13 21:41:04.919 DEBUG 19436 --- [p-nio-80-exec-2] com.itheima.intercepter.MyInterceptor    : 这是MyInterceptor拦截器的afterCompletion方法
 */

@Slf4j
public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        log.debug("这是MyInterceptor拦截器的preHandle方法");
        return true;
    }

    @Override public void postHandle(HttpServletRequest request, HttpServletResponse response,
                                     Object handler, ModelAndView modelAndView) throws Exception {
        log.debug("这是MyInterceptor拦截器的postHandle方法");
    }

    @Override public void afterCompletion(HttpServletRequest request, HttpServletResponse
            response, Object handler, Exception ex) throws Exception {
        log.debug("这是MyInterceptor拦截器的afterCompletion方法");
    }

}
