package pe.com.dev.documentmicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Document(collection = "contracts")
public class Contract {
    @EqualsAndHashCode.Include
    private String id;
    @Field
    private String title;
    @Field
    private String description;
    @Field
    private Provider provider;
    @Field
    private Responsible responsible;
    // Contract details
    @Field
    private String contractType;
    @Field
    private String contractNumber;
    @Field
    private LocalDate startDate;
    @Field
    private LocalDate endDate;

    @Field
    private Double totalAmount;
    @Field
    private String currency;
    @Field
    private String paymentMethod;
    @Field
    private String paymentFrequency;
    @Field
    private String paymentTerms;
    @Field
    private List<String> activities;
    @Field
    private List<String> deliverables;
    @Field
    private List<String> termsAndConditions;
    // Contract history
    @Field
    private List<Action> history;

    @Field
    private Status status;


}
