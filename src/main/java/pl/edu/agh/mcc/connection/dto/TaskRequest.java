package pl.edu.agh.mcc.connection.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class TaskRequest {

    private List<CloudletInfo> cloudlets;
    private int cloudId;

}
