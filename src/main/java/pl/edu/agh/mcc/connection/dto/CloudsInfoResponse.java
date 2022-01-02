package pl.edu.agh.mcc.connection.dto;

import lombok.Data;

import java.util.List;


@Data
public class CloudsInfoResponse {

    List<CloudInfo> cloudInfoList;

}
