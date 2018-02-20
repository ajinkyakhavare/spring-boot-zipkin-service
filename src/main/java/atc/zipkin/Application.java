package atc.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;


/**
 * Start the Zipkin distributed tracing service.
 */
@SpringBootApplication
@EnableZipkinServer
@EnableDiscoveryClient
public class Application
{
    public static void main ( final String[] args )
    {
        SpringApplication.run( Application.class, args );
    }
}
