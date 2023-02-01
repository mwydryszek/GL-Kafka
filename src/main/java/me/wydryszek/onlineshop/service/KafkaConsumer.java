package me.wydryszek.onlineshop.service;

import lombok.extern.slf4j.Slf4j;
import me.wydryszek.onlineshop.model.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
@Slf4j
public class KafkaConsumer {

    @Bean
    public Consumer<Vehicle> vehicleCreate(){
        return vehicle -> {
            log.info("received vehicle={}", vehicle);
        };
    }

}
