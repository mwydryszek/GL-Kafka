package me.wydryszek.onlineshop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
@Slf4j
public class KafkaConsumer {

    @Bean
    public Consumer<Vehicle> vehicleCreate(){
        return vehicle -> {
            log.info("received vehicle={}", vehicle);
        };
    }

}
