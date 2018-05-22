package cn.udrm.soa.eureka.eureka_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Eureka Client
 * @author 钱文达
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EureKaClient extends SpringBootServletInitializer{
	
    public static void main( String[] args ){
    	SpringApplication.run(EureKaClient.class, args);
    }
}
