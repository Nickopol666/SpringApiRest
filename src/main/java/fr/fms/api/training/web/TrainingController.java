package fr.fms.api.training.web;

import fr.fms.api.training.dao.TrainingRepository;
import fr.fms.api.training.entities.Training;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping
public class TrainingController {

    @Autowired
    TrainingRepository trainingRepository;



    @GetMapping("/trainings")
    public List<Training> allTrainings() {
        return trainingRepository.findAll();
    }

    @PostMapping("/trainings")
    public Training saveTraining(@RequestBody Training training){
        return trainingRepository.save(training);
    }

    @DeleteMapping("/trainings/{id}")
    public void deleteTraining(@PathVariable("id") Long id){
       trainingRepository.deleteById(id);
    }

   /* @GetMapping("/trainings/{id}")
    public ResponseEntity<Training> getTrainingById(@PathVariable("id")Long id){
        Optional<Training> training = Optional.of(trainingRepository.getById(id));
        if(training.isPresent()){
            return new ResponseEntity<>(training.get(), HttpStatus.OK);
        }
        return null;
    }*/
}

