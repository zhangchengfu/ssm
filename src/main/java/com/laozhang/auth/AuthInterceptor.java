package com.laozhang.auth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
/**
 * 拦截器
 * @author Lenovo
 *
 */
public class AuthInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		System.out.println("++++++++++++++++++++++interceptor++++++++++++++++++++++++++++++++");
		if(handler.getClass().isAssignableFrom(HandlerMethod.class)){
			Auth auth = ((HandlerMethod)handler).getMethod().getDeclaringClass().getAnnotation(Auth.class);
			//没有声明需要权限,或者声明不验证权限
			if(auth == null || auth.val() == "") {
				return true;
			} else {
				//todo something
				return true;
			}
		} else {
			return true;
		}
	}
}
