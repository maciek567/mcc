package pl.edu.agh.mcc.connection.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CloudletInfo {

    private int cloudletSize;
    private int inputAndProgramFileSize;
    private int outputFileSize;
    private int processingUnits;

}
