package fr.fms.api.training.web;

import fr.fms.api.training.Exception.RecordNotFoundException;
import fr.fms.api.training.dao.TrainingRepository;
import fr.fms.api.training.entities.Training;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jca.cci.RecordTypeNotSupportedException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
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

//    @GetMapping("/trainings/{id}")
//    public ResponseEntity<Training> getTrainingById(@PathVariable("id")Long id){
//        Optional<Training> training = trainingRepository.getTrainingById(id);
//        if(training.isPresent()){
//            return new ResponseEntity<>(training.get(), HttpStatus.OK);
//
//        }

      //  return null;
  //  }
    @GetMapping ("/trainings/{id}")
        public Training getTrainingById2(@PathVariable("id")Long id){
            return trainingRepository.getTrainingById(id)
                    .orElseThrow(()-> new RecordNotFoundException("Id de formation"+id+"n'existe pas"));

    }
}

