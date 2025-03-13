//package com.objectia.JBD_HandsOnLearning.services;
//
//import com.objectia.JBD_HandsOnLearning.DTO.CheckFraudDTO;
//import com.objectia.JBD_HandsOnLearning.DTO.TransactionRequestDTO;
//import com.objectia.JBD_HandsOnLearning.DTO.TransactionResponseDTO;
//import com.objectia.JBD_HandsOnLearning.feign.FraudFeignClient;
//import com.objectia.JBD_HandsOnLearning.models.Account;
//import com.objectia.JBD_HandsOnLearning.models.AccountCard;
//import com.objectia.JBD_HandsOnLearning.models.Card;
//import com.objectia.JBD_HandsOnLearning.models.Transaction;
//import com.objectia.JBD_HandsOnLearning.repositories.AccountCardRepository;
//import com.objectia.JBD_HandsOnLearning.repositories.AccountRepository;
//import com.objectia.JBD_HandsOnLearning.repositories.CardRepository;
//import com.objectia.JBD_HandsOnLearning.repositories.TransactionRepository;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//
//import java.util.Date;
//import java.util.List;
//import java.util.Optional;
//import java.util.UUID;
//
//
//@Service
//public class TransactionService {
//
//
//    @Autowired
//    CardRepository cardRepository;
//
//    @Autowired
//    AccountRepository accountRepository;
//
//    @Autowired
//    ModelMapper modelMapper;
//    @Autowired
//    TransactionRepository transactionRepository;
//
//    @Autowired
//    AccountCardRepository accountCardRepository;
//
//    @Autowired
//    FraudFeignClient fraudFeignClient;
//
//
//    public void createTransaction(TransactionRequestDTO transactionDto) throws Exception {
//
//        AccountCard accountCard = accountCardRepository.findById(transactionDto.getAccountCard()).get();
//        Card card = accountCard.getCard();
//        if (!card.getExpiryDate().after(new Date())) {
//            throw new Exception();
//        }
//        Account account = accountCard.getAccount();
//        if (transactionDto.getTransactionType().equals("D")) {
//            if (account.getBalance().subtract(transactionDto.getAmount()).intValue() < 0) {
//                throw new Exception();
//            }
//        }
//        UUID transactionId = UUID.randomUUID();
//        CheckFraudDTO checkFraudDTO = new CheckFraudDTO();
//        checkFraudDTO.setTransactionId(transactionId);
//        checkFraudDTO.setTransactionAmount(transactionDto.getAmount());
//        checkFraudDTO.setCardId(card.getId());
//        if(fraudFeignClient.checkFraud(checkFraudDTO).getBody()){
//            throw new Exception();
//        }
//        if (transactionDto.getTransactionType().equals("D")) {
//            account.setBalance(account.getBalance().subtract(transactionDto.getAmount()));
//        } else {
//            account.setBalance(account.getBalance().add(transactionDto.getAmount()));
//        }
//        accountRepository.save(account);
//        Transaction transaction = modelMapper.map(transactionDto, Transaction.class);
//        transaction.setCard(card);
//        transaction.setId(transactionId);
//        transactionRepository.save(transaction);
//    }
//
//    public int findTransactionByCard(UUID cardId){
//       return  transactionRepository.findByCardId(cardId).size();
//    }
//}
