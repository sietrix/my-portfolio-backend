package com.portfolio.my_portfolio_backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Education {
    private Long id;
    private String degree;  // Ej: "Ingenieria en Sistemas"
    private String institution;  // Ej: "Universidad de Alicante"
    private LocalDate startDate;
    private LocalDate endDate;  // puede ser null si está en curso
    private String description;  // Breve description de logros o cursos
    private Long personalInfoId;  // Clave foránea a PersonalInfo
}
