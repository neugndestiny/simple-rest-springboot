package warakorn.springframework.simplespringbootapi.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class StudentModel {
    @Id
    @GeneratedValue
    private Long StudentId;
    private String name;
    private String lastName;
}
