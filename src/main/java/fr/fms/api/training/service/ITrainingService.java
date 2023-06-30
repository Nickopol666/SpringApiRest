package fr.fms.api.training.service;


import fr.fms.api.training.entities.Training;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ITrainingService {

    public List<Training> getTraining() throws Exception;



}
