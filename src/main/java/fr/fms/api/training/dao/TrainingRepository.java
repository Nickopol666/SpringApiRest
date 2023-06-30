package fr.fms.api.training.dao;

import fr.fms.api.training.entities.Training;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TrainingRepository  extends JpaRepository<Training, Long> {
     default void deleteTraining(Long id) {

     }

     //Optional<Training> getTrainingById(Long id);



   


  /*  void deleteTraining(Long id);

    public String saveTraining(Training training);*/
}
