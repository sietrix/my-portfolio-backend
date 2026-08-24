package com.portfolio.my_portfolio_backend.model;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Skill {
    private Long id;

    @NotBlank(message = "El nombre de la habilidad no puede estar vacío")
    private String name; // Ej: "Java, HTML, CSS"

    @NotNull(message = "El porcentaje no puede se nulo")
    @Min(value = 0, message = "El porcentaje debe ser igual o mayor a 0")
    @Max(value = 100, message = "El porcentaje debe ser igual o menor a 100")
    private Integer levelPercentage; // Ej: 90, 85 (para barra de progreso)

    @NotBlank(message = "La clase del icono no puede estar vacía")
    private String iconClass; // Ej: "fab fa-java" para FontAwesome

    private Long personalInfoId; // Clave foránea a PersonalInfo
}
