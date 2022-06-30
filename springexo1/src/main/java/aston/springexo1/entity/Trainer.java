package aston.springexo1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="trainer")
public class Trainer extends Person {
    // Trainer attributes
    @Column(name="hiredate", nullable = false)
    @NotNull
    private Date hiredate;
    @Column(name="experience", nullable = false)
    @NotNull
    private Integer experience;
    @Column(name="intern", nullable = false)
    @NotNull
    private boolean intern;
}
