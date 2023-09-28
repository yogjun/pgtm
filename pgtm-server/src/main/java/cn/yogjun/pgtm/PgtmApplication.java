package cn.yogjun.pgtm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@EnableMongoRepositories(basePackages = {"cn.yogjun.pgtm.repository.dao"})
@SpringBootApplication(scanBasePackages = {"cn.yogjun.pgtm"})
public class PgtmApplication {

    public static void main(String[] args) {
        SpringApplication.run(PgtmApplication.class, args);
    }

}
