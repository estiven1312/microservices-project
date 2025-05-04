package pe.com.dev.documentmicroservice.model;

import lombok.Data;

@Data
public class Provider {
    private String id;
    private String name;
    private String ruc;
    private String address;
    private String address2;
    private String phone;
    private String phone2;
    private String email;
    private String contactName;
    private String contactPhone;
    private String contactEmail;
    private String status;
    private Boolean active;
    private Boolean validInSunat;

}
