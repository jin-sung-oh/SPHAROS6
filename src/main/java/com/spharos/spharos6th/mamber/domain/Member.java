package com.spharos.spharos6th.mamber.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("회원 이름")
    @Column(nullable = false, length = 100)
    private String name;

    @Comment("회원 닉네임")
    @Column(nullable = false, unique = true, length = 100)
    private String email;

    private String password;

    private String phoneNumber;

    private String birth;

@Builder
    public Member(String birth, String phoneNumber, String password, String email, String name, Long id) {
        this.birth = birth;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.email = email;
        this.name = name;
        this.id = id;
    }

}
