package com.example.mybatis.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Employee_SEQ")
    @SequenceGenerator(name = "Employee_SEQ", sequenceName = "Employee_SEQ",
            initialValue = 1, allocationSize = 1)
    @Column(name = "id")
    private Integer id;

    private String name;
    private String address;
    private String phone;
}
