package top.kuangcp.graduate.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Created by https://github.com/kuangcp
 * 跨域设置
 * @author kuangcp
 * @date 18-4-22  上午9:17
 */
@Configuration
public class CorsConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addCorsMappings(CorsRegistry registry) {
//        super.addCorsMappings(registry);
        registry.addMapping("/**")
                .allowedMethods("*")
                .allowedOrigins("*")
                .allowedHeaders("*");
    }

//    @Bean
//    public HttpMessageConverter<String> responseBodyConverter() {
//        StringHttpMessageConverter converter = new StringHttpMessageConverter(
//                Charset.forName("UTF-8"));
//        return converter;
//    }
//    @Override
//    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        super.configureMessageConverters(converters);
//        converters.add(responseBodyConverter());
//    }

}
