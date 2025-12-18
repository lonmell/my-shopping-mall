package com.shop.demo.repository;

import com.shop.demo.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository를 상속받으면 기본적인 CRUD(저장, 조회, 수정, 삭제) 메서드가 자동으로 생성됩니다.
public interface MemberRepository extends JpaRepository<Member, Long> {
    
    // 이메일로 회원을 찾는 쿼리 메서드 추가
    // 가입 시 중복 이메일 체크를 위해 필요합니다.
    Member findByEmail(String email);
}