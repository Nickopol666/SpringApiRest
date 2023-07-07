package fr.fms.api.training.dao;

import fr.fms.api.training.entities.Image;
import fr.fms.api.training.entities.Training;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ImageRepository extends JpaRepository<Image, String> {
    Optional<Image> getImageById(Long id);
}
