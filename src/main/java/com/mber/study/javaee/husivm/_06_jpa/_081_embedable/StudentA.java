package com.mber.study.javaee.husivm._06_jpa._081_embedable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.*;

import java.io.Serializable;

@Entity(name = "081A_student")
@NoArgsConstructor
public class StudentA {

    @EmbeddedId
    private StudentAPK pk;
    private int age;

    public StudentA(String name, String surname, int age) {
        this.pk = new StudentAPK(name, surname);
        this.age = age;
    }
}

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
class StudentAPK implements Serializable {
    private String name;
    private String surname;
}