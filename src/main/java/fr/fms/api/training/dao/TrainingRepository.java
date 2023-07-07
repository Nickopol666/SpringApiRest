package fr.fms.api.training.dao;

import fr.fms.api.training.entities.Training;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

//@CrossOrigin("*")
//@RepositoryRestResource
public interface TrainingRepository  extends JpaRepository<Training, Long> {
     default void deleteTraining(Long id) {}



    Optional<Training> getTrainingById(Long id);



}
