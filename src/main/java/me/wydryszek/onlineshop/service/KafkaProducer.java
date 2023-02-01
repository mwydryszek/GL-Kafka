package me.wydryszek.onlineshop.service;

import lombok.RequiredArgsConstructor;
import me.wydryszek.onlineshop.model.Vehicle;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class KafkaProducer {

    private final StreamBridge streamBridge;

    public void produceVehicle(Vehicle vehicle) {
        streamBridge.send("vehicle-create", vehicle);
    }
}
