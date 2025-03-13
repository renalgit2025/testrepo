//package com.objectia.JBD_HandsOnLearning.models;
//
//import lombok.Getter;
//import lombok.Setter;
//import org.hibernate.annotations.GenericGenerator;
//import org.hibernate.envers.Audited;
//
//import javax.persistence.*;
//import javax.validation.constraints.DecimalMin;
//import javax.validation.constraints.NotNull;
//import java.math.BigDecimal;
//import java.sql.Timestamp;
//import java.util.UUID;
//
//@Entity
//@Table(name = "transaction")
//@Getter
//@Setter
//@Audited
//public class Transaction {
//    @Id
//    @Column(name = "transaction_id")
//    private UUID id;
//
//    @ManyToOne
//    @NotNull(message = "Card is mandatory")
//    @JoinColumn(name = "card_id")
//    private Card card;
//
//    @NotNull(message = "Transaction amount is mandatory")
//    @DecimalMin(value = "0.01", message = "Transaction amount must be greater than 0")
//    private BigDecimal transactionAmount;
//
//    @NotNull(message = "Transaction date is mandatory")
//    private Timestamp transactionDate = new Timestamp(System.currentTimeMillis());
//
//
//    @NotNull(message = "Transaction type is mandatory")
//    private String transactionType;
//}