package com.objectia.JBD_HandsOnLearning.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.*;

@Entity
@Table(name = "cards")
@Getter
@Setter
// Note: The following annotation is only added when we explain db Auditing
@Audited
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "card_id")
    private UUID id;
    @Column(name = "cvv", length = 3)
    private String cvv;
    @Column(name = "card_number")
    private String cardNumber;
    @Column(name = "expiry_date")
    private Date expiryDate;
    //the following relations are added after we expolain the relations not when we attempt to create teh models first
    @OneToMany(mappedBy = "card")
    @JsonIgnore
    private List<AccountCard> accountCards;
}
