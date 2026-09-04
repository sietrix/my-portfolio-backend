package com.portfolio.my_portfolio_backend.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDto {
    private Long id;

    @NotBlank(message = "El nombre del titulo no puede estar vacío")
    @Size(min = 2, max = 255, message = "El titulo debe tener entre 2 y 255 caracteres")
    private String title;

    @NotBlank(message = "La descripción del titulo no puede estar vacío")
    @Size(min = 10, message = "El descripción debe tener al menos 10 caracteres")
    private String description;

    @URL(message = "La URL de la imagen no tiene un formato válido")
    private String imageUrl;  // URL o ruta a la imagen del proyecto

    @URL(message = "La URL del proyecto no tiene un formato válido")
    private String projectUrl;  // URL al proyecto desplegado (si existe) o GitHub

    @NotNull(message = "El ID de información personal no puede ser nulo")
    @Min(value = 1, message = "El ID de información personal debe ser un número positivo")
    private Long personalInfoId;  // Clave foránea a PersonalInfo
}

