package pe.com.dev.documentmicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Document(collection = "status_contracts")
public class Status {
    @EqualsAndHashCode.Include
    private String id;
    @Field
    private String name;
    @Field
    private String description;
    @Field
    private Long order;
    @Field
    private String color;
    @Field
    private Boolean isActive;

}
