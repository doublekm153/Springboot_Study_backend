package me.kyungmin_Kim.Springboot_Study_backend;

import me.kyungmin_Kim.Springboot_Study_backend.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}