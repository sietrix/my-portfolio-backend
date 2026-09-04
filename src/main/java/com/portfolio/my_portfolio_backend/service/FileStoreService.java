package com.portfolio.my_portfolio_backend.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class FileStoreService {

    @Value("$(file.upload.der")
    private String uploadDir;

    public String storeFile(MultipartFile file) throws IOException {
        if (file.isEmpty()) {
            throw new IOException("El archivo está vacío");
        }

        String originalFilename = file.getOriginalFilename();
        String extension = "";
        if (originalFilename != null) {
            int dotIndex = originalFilename.lastIndexOf('.');

            if(dotIndex > 0){
                extension = originalFilename.substring(dotIndex);
            }
        }
        // creamos un nombre aleatorio pero unico (UUID)
        // tipo b4a893f3-3a16-4d16-a1dc-8040e4c9ab0f + extensión
        String fileName = UUID.randomUUID() + "." + extension;

        // Creación de la ruta
        Path filePath = Paths.get(uploadDir + fileName).normalize();

        // Copia del archivo al destino
        Files.copy(file.getInputStream(), filePath);

        // Retorno de la url relativa
        return "img/projects/" + fileName;
    }
}
