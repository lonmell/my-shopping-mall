package com.shop.demo.service;

import com.shop.demo.entity.Member;
import com.shop.demo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional // 로직을 처리하다 에러가 발생하면 변경된 데이터를 이전 상태로 롤백해줍니다.
@RequiredArgsConstructor // Repository 객체를 자동으로 주입(Injection)해줍니다.
public class MemberService {

    private final MemberRepository memberRepository;

    // 회원가입 로직
    public Member saveMember(Member member) {
        validateDuplicateMember(member); // 중복 회원 검증
        return memberRepository.save(member);
    }

    // 중복 회원 검증 로직
    private void validateDuplicateMember(Member member) {
        Member findMember = memberRepository.findByEmail(member.getEmail());
        if (findMember != null) {
            throw new IllegalStateException("이미 가입된 회원입니다.");
        }
    }
}