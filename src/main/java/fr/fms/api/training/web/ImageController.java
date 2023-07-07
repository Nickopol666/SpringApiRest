package fr.fms.api.training.web;

import fr.fms.api.training.Exception.RecordNotFoundException;
import fr.fms.api.training.dao.ImageRepository;
import fr.fms.api.training.dao.TrainingRepository;
import fr.fms.api.training.entities.Image;
import fr.fms.api.training.entities.Training;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class ImageController {


    @Autowired
    ImageRepository imageRepository;

    @GetMapping("/images")
    public List<Image> allImage() {
        return imageRepository.findAll();
    }

    @PostMapping("/images/{id}")
    public Image saveImage(@RequestBody Image image){
        return imageRepository.save(image);
    }

    @DeleteMapping("/images/{id}")
    public void deleteImage(@PathVariable("id") String id){
        imageRepository.deleteById(id);
    }



    @GetMapping("/images/{id}")
    public ResponseEntity<Image> getImageById(@PathVariable("id") Long id) {
        Optional<Image> image= imageRepository.getImageById(id);
        if (image.isPresent()) {
            return new ResponseEntity<>(image.get(), HttpStatus.OK);
        }
        return null;
    }
}