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
@Document(collection = "addendums")
public class Addendum {
    @EqualsAndHashCode.Include
    private String id;
    @Field
    private Contract contractRef;
    @Field
    private String description;
    @Field
    private String addendumType;
    @Field
    private String addendumNumber;
    @Field
    private LocalDate startDate;
    @Field
    private Boolean modifyEndDateContract;
    @Field
    private LocalDate newEndDate;
    @Field
    private Boolean modifyTotalAmount;
    @Field
    private Double newTotalAmount;
    @Field
    private Boolean modifyCurrency;
    @Field
    private String newCurrency;
    @Field
    private Boolean modifyPaymentMethod;
    @Field
    private String newPaymentMethod;
    @Field
    private Boolean modifyPaymentFrequency;
    @Field
    private String newPaymentFrequency;
    @Field
    private Boolean modifyPaymentTerms;
    @Field
    private String newPaymentTerms;
    @Field
    private Boolean modifyActivities;
    @Field
    private List<String> newActivities;
    @Field
    private Boolean modifyDeliverables;
    @Field
    private List<String> newDeliverables;
    @Field
    private Boolean modifyTermsAndConditions;
    @Field
    private List<String> newTermsAndConditions;
    @Field
    private String status;
}
