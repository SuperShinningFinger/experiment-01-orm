package com.experiment.experiment01orm.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @Column(columnDefinition = "DATETIME NOT NULL " +
            "DEFAULT CURRENT_TIMESTAMP" ,
            updatable = false,
            insertable = false)
    private LocalDateTime insertTime;
    @OneToMany(mappedBy = "user")
    private List<Address> addresses;
    public User(String name){
        this.name = name;
    }
}
