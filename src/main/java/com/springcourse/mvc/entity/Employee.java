package com.springcourse.mvc.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @NonNull
    private String name;

    @Column(name = "surname")
    @NonNull
    private String surname;

    @Column(name = "department")
    @NonNull
    private String department;

    @Column(name = "salary")
    @NonNull
    private int salary;

}
