package com.snooping.bank.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ClientRecordDto(@NotBlank String name, @NotBlank String accountType, @NotNull float balance, @NotNull boolean card) {

}
