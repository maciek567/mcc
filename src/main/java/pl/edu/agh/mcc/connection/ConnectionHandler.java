package pl.edu.agh.mcc.connection;

import com.google.gson.Gson;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.edu.agh.mcc.connection.dto.CloudsInfoResponse;
import pl.edu.agh.mcc.connection.dto.TaskRequest;
import pl.edu.agh.mcc.connection.dto.TaskResponse;

@RestController
public class ConnectionHandler {

    Gson gson = new Gson();
    RestTemplate restTemplate = new RestTemplate();

    public CloudsInfoResponse getCloudsInfo() {
        final String responseJson = restTemplate.getForObject("http://localhost:8081/clouds", String.class);
        return gson.fromJson(responseJson, CloudsInfoResponse.class);
    }

    public TaskResponse processTask(TaskRequest task) {
        String body = gson.toJson(task);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> request = new HttpEntity<>(body, headers);

        final String responseJson = restTemplate.postForObject("http://localhost:8081/process", request, String.class);
        return gson.fromJson(responseJson, TaskResponse.class);
    }
}
