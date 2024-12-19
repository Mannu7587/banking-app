package net.bank.banking_app.dto;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//@Data
//@AllArgsConstructor
//public class AccountDto {
//    private long id;
//    private String accountHolderName;
//    private double balance;
//
//}

public record AccountDto(long id,
                         String accountHolderName,
                         double balance) {
}