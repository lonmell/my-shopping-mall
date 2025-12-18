package com.shop.demo.entity;

import com.shop.demo.constant.Role;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="member")
@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="member_id")
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    private String address;

    @Enumerated(EnumType.STRING)
    private Role role;
}