package by.itacademy.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long id;

    @Column(name = "name")
    @Getter
    @Setter
    private String name;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "gender")
    @Getter
    @Setter
    private Gender gender;


    @Column(name = "creation_time")
    @Getter
    @Setter
    private LocalDateTime creationDate;

}