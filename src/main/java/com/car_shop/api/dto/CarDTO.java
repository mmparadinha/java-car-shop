package com.car_shop.api.dto;

import java.util.Date;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;

public record CarDTO(
    @NotBlank String modelo,

    @NotBlank String fabricante,

    @Past @NotNull Date dataFabricacao,

    @NotNull @Positive int valor,

    @NotNull @Min(0001) @Max(9999) int anoModelo) {
}
