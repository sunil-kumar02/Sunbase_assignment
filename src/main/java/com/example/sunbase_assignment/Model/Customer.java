package com.example.sunbase_assignment.Model;

import lombok.*;
import lombok.experimental.FieldDefaults;


@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level =  AccessLevel.PRIVATE)


public class Customer {

        private Long id;

        private String firstName;
        private String lastName;
        private String street;
        private String address;
        private String city;
        private String state;
        private String email;
        private String phone;


        // Getters and setters
    }


}
