package com.example.demoH2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyDetails {
    private Integer id;
    private String name;
    private String phoneNumber;

    private String email;

    private String gender;
}
