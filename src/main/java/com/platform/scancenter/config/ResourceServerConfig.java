package com.platform.scancenter.config;

import com.platform.scancenter.constant.BaseUrl;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfiguration;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * TranCung
 * 17/07/2022
 * Config resource server
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    /**
     * open cors
     * config access resource with authorize necessary
     * @param http
     * @throws Exception
     */
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable();
        http.requestMatchers()
                .antMatchers(BaseUrl.API_V1 + "/**")
                .and()
                .authorizeRequests()
                .anyRequest()
                .access("#oauth2.hasScope('read')");
    }
}
