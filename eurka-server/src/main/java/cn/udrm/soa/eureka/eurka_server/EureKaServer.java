package cn.udrm.soa.eureka.eurka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EureKa Server
 * @author 钱文达
 *
 */

@SpringBootApplication
@EnableEurekaServer
public class EureKaServer extends SpringBootServletInitializer{
	
    public static void main( String[] args ){
    	SpringApplication.run(EureKaServer.class, args);
    }
}
