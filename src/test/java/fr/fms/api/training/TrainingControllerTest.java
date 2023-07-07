package fr.fms.api.training;

import fr.fms.api.training.dao.TrainingRepository;
import fr.fms.api.training.web.TrainingController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = TrainingController.class)
public class TrainingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TrainingRepository trainingRepository;

    @Test
    public  void testGetTrainings() throws Exception{
        mockMvc.perform(get("/api/trainings")).andExpect(status().isOk());
    }
}
