package aston.springexo1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Intern class inherits from Person
 * @author Adrien MARCEAU
 */

@Entity
@Table(name="intern")
public class Intern extends Person {
    @Column(name="birthdate", nullable = false)
    @NotNull
    private Date birthdate;
}
