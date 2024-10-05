package com.portal.job_utils.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "JSQualificationDetails")
public class JSQualification {

    private int JSQualificationId;

    private int qualificationId;

}
