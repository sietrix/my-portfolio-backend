package com.portfolio.my_portfolio_backend.model;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonalInfo {
    private Long id; // Clave primaria

    @NotBlank(message = "El nombre no puede estar vacío")
    private String firstName;

    @NotBlank(message = "Los apellidos no pueden estar vacíos")
    private String lastName;

    @NotBlank(message = "El titulo no puede estar vacío")
    private String title;  // Ej: "Full Stack Developer"

    @NotBlank(message = "La descripción del perfil no puede estar vacío")
    private String profileDescription;  // URL o ruta a la imagen de perfil

    @NotBlank(message = "La imagen no puede estar vacío")
    private String profileImageUrl;

    @Min(value = 0, message = "Los años de experiencia no pueden ser negativos")
    private Integer yearsOfExperience;

    @Email(message = "El email no es valido")
    private String email;

    @NotBlank(message = "El telefono no puede estar vacío")
    private String phone;

    @URL(message = "LinkedIn es una red obligatoria")
    private String linkedinUrl;

    @URL(message = "Github es una red obligatoria")
    private String githubUrl;
}
