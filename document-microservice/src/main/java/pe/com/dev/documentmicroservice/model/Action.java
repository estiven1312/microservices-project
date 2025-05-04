package pe.com.dev.documentmicroservice.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Action {
    private String user;
    private String action;
    private String comment;
    private LocalDate date;
}
