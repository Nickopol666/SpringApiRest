package fr.fms.api.training.service;

import fr.fms.api.training.entities.Training;
import fr.fms.api.training.dao.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ImplTrainingService implements ITrainingService{



    @Override
    public List<Training> getTraining() {
        return null;
    }
}
