package pe.com.dev.documentmicroservice.model;

import lombok.Data;

@Data
public class Responsible {
    private String id;
    private String name;
    private String nationality;
    private String documentType;
    private String documentNumber;
    private String address;
    private String phone;
    private String email;
    private Boolean active;
    private Boolean validInCAL;
}
