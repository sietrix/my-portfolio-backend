package com.portfolio.my_portfolio_backend.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Experience {
    private Long id;

    @NotBlank(message = "El titulo del puesto no puede estar vacío")
    private String jobTitle;  // Ej: "Full Stack Developer"

    @NotBlank(message = "El nombre de la compañia no puede estar vacío")
    private String companyName;

    @NotNull(message = "El fecha de inicio no puede se nula")
    @PastOrPresent(message = "La fecha de inicio no puede ser futura")
    private LocalDate startDate;

    @PastOrPresent(message = "La fecha de fin no puede ser futura")
    private LocalDate endDate;  // Puede ser null si está en curso

    @NotBlank(message = "La descripción no puede estar vacía")
    private String description;  // Responsabilidades y logros

    // La validación de la clave foránea se maneja a nivel de servicio
    private Long personalInfoId;  // Clave foránea a PersonalInfo
}
