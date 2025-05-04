package pe.com.dev.documentmicroservice.model;

import lombok.Data;

import java.util.List;

@Data
public class ChangeStatusRequest {
    private String idContract;
    private List<String> userApproval;
    private String comment;

}
