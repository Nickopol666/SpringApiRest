package fr.fms.api.training;

import fr.fms.api.training.dao.TrainingRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ApiTrainingApplicationTests {

//	@Test
//	void contextLoads() {
//	}
	@Autowired
	private MockMvc mockMvc;
	@Autowired
	TrainingRepository trainingRepository;


	@Test
	void testGetTrainingsAndTestName() throws Exception{
		mockMvc.perform(get("/api/trainings"))
				.andExpect(status().isOk())
				.andExpect( jsonPath("$[0].name",is("java")));
	}
}
