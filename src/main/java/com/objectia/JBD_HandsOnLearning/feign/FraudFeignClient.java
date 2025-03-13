//package com.objectia.JBD_HandsOnLearning.feign;
//
//import com.objectia.JBD_HandsOnLearning.DTO.CheckFraudDTO;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import java.util.UUID;
//
//@FeignClient(name = "fraud", url = "http://localhost:9093")  // URL of the other service
//public interface FraudFeignClient {
//    @PostMapping("fraud-controller/check-fraud")
//     ResponseEntity<Boolean> checkFraud(@RequestBody CheckFraudDTO checkFraudDTO);
//
//}
