package com.ultimatesoftware.banking.account.cmd.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@JsonRootName(value = "transaction")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto {
    @NotNull
    @NotBlank
    private String id;
    @NotNull
    @NotBlank
    private String accountId;
    @NotNull
    @NotBlank
    private String customerId;
    @Min(value = 0)
    private double amount;
    private String destinationAccountId;

    public TransactionDto(
        @JsonProperty("id") @NotNull @NotBlank String id,
        @JsonProperty("accountId") @NotNull @NotBlank String accountId,
        @JsonProperty("customerId") @NotNull @NotBlank String customerId,
        @JsonProperty("amount") double amount,
        @JsonProperty("destinationAccountId") String destinationAccountId) {
        this.id = id;
        this.accountId = accountId;
        this.customerId = customerId;
        this.amount = amount;
        this.destinationAccountId = destinationAccountId;
    }
}
