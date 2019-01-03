package org.jyp.pocketbook.core.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ConfigurationAdapter implements WebMvcConfigurer {

	@Autowired
	private LoginHandlerInterceptor loginHandlerInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//addPathPatterns("/wx/**");
		registry.addInterceptor(loginHandlerInterceptor).excludePathPatterns("/resources/**").addPathPatterns("/**");
	}
}
