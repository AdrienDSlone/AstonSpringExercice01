package aston.springexo1.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {
    //     Set commons attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="type", nullable = false)
    @NotNull
    @Size(max=1)
    private String type;

    @Column(name="civility", nullable = false)
    @NotNull
    @Size(max=10)
    private String civility;

    @Column(name="lastname", nullable = false)
    @NotNull
    @Size(max=255)
    private String lastname;

    @Column(name="firstname", nullable = false)
    @NotNull
    @Size(max=255)
    private String firstname;

    @Column(name="email", nullable = false)
    @NotNull
    @Size(max=255)
    private String email;

//    @Column(name="adress_id", nullable = false)
//    @ManyToOne
//    @JoinColumn(name="adress_id", nullable=false)
//    private Adress adress;

    public Person() {
    }

}
