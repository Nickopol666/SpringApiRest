package fr.fms.api.training;

import fr.fms.api.training.dao.TrainingRepository;
import fr.fms.api.training.entities.Training;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiTrainingApplication implements CommandLineRunner {
	@Autowired
	private TrainingRepository trainingRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApiTrainingApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception{
		trainingRepository.save(new Training(null,"java","java standard edition 8 sur 5 jours",2530,1));
		trainingRepository.save(new Training(null,"c#","C standard edition",650,1));
		trainingRepository.save(new Training(null,"c++","C++ standard edition",650,1));
		trainingRepository.save(new Training(null,"Scheme","scheme recursivité",560,1));
		trainingRepository.save(new Training(null,"JS","Java Script edotion 9",860,1));

	}
}
