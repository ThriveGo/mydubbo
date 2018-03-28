package consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import service.DemoService;

@Component
public class Consumer implements CommandLineRunner {

    @Reference
    DemoService service;

    @Override
    public void run(String... args) {
        int a = 1;
        int b = 2;
        System.err.printf("%s+%s=%s", a, b, service.add(a, b));
        System.err.println();
    }
}
