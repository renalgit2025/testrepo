package com.objectia.JBD_HandsOnLearning.Controllers;

import com.objectia.JBD_HandsOnLearning.DTO.CardResponseDTO;
import com.objectia.JBD_HandsOnLearning.DTO.FindByCvvDTO;
import com.objectia.JBD_HandsOnLearning.models.Card;
import com.objectia.JBD_HandsOnLearning.services.CardService;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import org.togglz.core.manager.FeatureManager;

//import static com.objectia.JBD_HandsOnLearning.togglz.Features.CREATE_CARD;

@RestController
@RequestMapping("card-controller")
@Slf4j
public class CardController {
    @Autowired
    CardService cardService;

    @Autowired
    ModelMapper modelMapper;

//    @Autowired
//    FeatureManager featureManager;
   @PostMapping("/create-card")
    public ResponseEntity<Card> createCard() {
//       if (featureManager.isActive(CREATE_CARD)) {
            log.info("Creating new card");
           Card createdCard = cardService.createCard();
           return new ResponseEntity<>(createdCard, HttpStatus.CREATED);
//       }
//       else{
//           return new ResponseEntity<>(new Card(),HttpStatus.FORBIDDEN);
//       }
    }

    @GetMapping("/find-card-by-cvv")
    public ResponseEntity<CardResponseDTO> findByCvv(@RequestBody FindByCvvDTO cvvDTO){
           Card card =  cardService.findCardByCvv(cvvDTO.getCvv());
           CardResponseDTO cardResponseDTO = modelMapper.map(card,CardResponseDTO.class);
           return new ResponseEntity<>(cardResponseDTO,HttpStatus.FOUND);
    }
    
}
