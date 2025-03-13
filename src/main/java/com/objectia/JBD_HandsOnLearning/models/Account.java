package com.objectia.JBD_HandsOnLearning.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "account")
@Getter
@Setter
// Note: The following annotation is only added when we explain db Auditing
@Audited
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_id")
    private UUID id;
    @Column
    private BigDecimal balance;
    @Column
    private String status;
    //the following relations are added after we expolain the relations not when we attempt to create teh models first
    @ManyToOne
    @JoinColumn(name = "account_holder_id")
    private AccountHolder accountHolder;
    @OneToMany(mappedBy = "account")
    @JsonIgnore
    private List<AccountCard> accountCards;
}
