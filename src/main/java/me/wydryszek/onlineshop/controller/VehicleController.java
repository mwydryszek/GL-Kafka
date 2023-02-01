package me.wydryszek.onlineshop.controller;

import lombok.RequiredArgsConstructor;
import me.wydryszek.onlineshop.service.KafkaProducer;
import me.wydryszek.onlineshop.model.Vehicle;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicles")
@RequiredArgsConstructor
public class VehicleController {

    private final KafkaProducer kafkaProducer;

    @PostMapping
    public ResponseEntity<String> addVehicle(@RequestBody Vehicle vehicle){
        kafkaProducer.produceVehicle(vehicle);
        return ResponseEntity.ok("ok");
    }


}
