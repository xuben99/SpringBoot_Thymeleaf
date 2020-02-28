package edu.hue.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userid;
    @Column
    private String username;
    @Column
    private String useraddress;
    @Column
    private Integer userage;
}
