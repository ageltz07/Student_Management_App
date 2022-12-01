package com.springProject.springApp.student;

import jakarta.persistence.*;
import lombok.*;



/**
 * Lombok allows us to get rid of boilerplate code with the following
 * annotation.
 *
 * Could replace all of these annotations with a single
 * @Data but this would make the fields final which we don't want.
 *
 * @Entity and @Table annotations are used for Spring data JPA
 */
@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Student {
    // @Id notation is for Spring Data JPA, we need at least 1 @Id field
    // @SequenceGenerator is used to increment our sequence for generating student Id's 1 at a time.
    // @GeneratedValue is used to create unique values for our Id field
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "student_sequence",
            strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String email;
    // Using our Gender enum
    // @Enumerated used to specify that this is an enum otherwise
    // it would be put in the DB as an int.
    @Enumerated(EnumType.STRING)
    private Gender gender;

    public Student(String name, String email, Gender gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
}
