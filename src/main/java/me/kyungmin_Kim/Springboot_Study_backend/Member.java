package me.kyungmin_Kim.Springboot_Study_backend;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id; // DB 테이블의 'id' 컬럼과 매핑

    @Column(name = "name", nullable = false)
    private String name; // DB 테이블의 'name' 컬럼과 매핑
}