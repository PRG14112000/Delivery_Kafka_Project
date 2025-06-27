package com.deliveryboy.controller;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired 
    private KafkaService kafkaService;

    @PostMapping("/update")    
    public  ResponseEntity<?> updateLocation() {
        this.kafkaService.updateLocation("( "+Math.round(Math.random()*100)+","+Math.round(Math.random()*100)+" )");
        return new ResponseEntity<>(Map.of("message","Location Updated"),HttpStatus.OK);
    }
}
