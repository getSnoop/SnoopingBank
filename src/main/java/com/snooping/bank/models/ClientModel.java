package com.snooping.bank.models;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.hateoas.RepresentationModel;

@Entity
@Table(name = "TB_Clients")
public class ClientModel extends RepresentationModel<ClientModel> implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idClient;
    private String name;
    private String accountType;
    private float balance;
    private boolean card;


    public UUID getIdClient(){
        return idClient;
    }
    public void setIdClient(UUID idClient){
        this.idClient = idClient;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAccountType(){
        return accountType;
    }
    public void setAccountType(String accountType){
        this.accountType = accountType;
    }
    public float getBalance(){
        return balance;
    }
    public void setBalance(float balance){
        this.balance = balance;
    }
    public boolean isCard() {
        return card;
    }
    public void setCard(boolean card) {
        this.card = card;
    }
    
}
