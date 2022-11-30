package com.springProject.springApp.student;

import lombok.*;



/**
 * Lombok allows us to get rid of boilerplate code with the following
 * annotation.
 *
 * Could replace all of these annotations with a single
 * @Data but this would make the fields final which we don't want.
 */
@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private Long id;
    private String name;
    private String email;
    // Using our Gender enum
    private Gender gender;

}
