package nd.rw.apollo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ApolloApplication {

  public static void main(String[] args) {
    SpringApplication.run(ApolloApplication.class, args);
  }

}

