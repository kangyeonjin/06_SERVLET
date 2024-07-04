package com.ohgiraffers.common;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/*@component
* 처음 ioc컨테이너가 동작할때 해당 어노테이션이 붙은 클래스들을 찾아서 빈으로 등록하고
* 알아서 객체로 만들어준다*/

@Component
public class MemberDAO {

    private final Map<Integer,MemberDTO> memberMap;

    //의존성 주입
    public MemberDAO(){
        memberMap = new HashMap<Integer, MemberDTO>();

        memberMap.put(1, new MemberDTO(1, "user01", "pass01", "홍길동"));
        memberMap.put(2, new MemberDTO(2, "user02", "pass02", "유관순"));

    }
    public MemberDTO selectMember(int sequence){
        return memberMap.get(sequence);
    }

    //매개변수를 전달 받은 회원정보를 map에 추가하고 성공실패여부를 boolean으로 리턴하는 메소드
    public boolean insertMember(MemberDTO newMember){

        int before = memberMap.size();

        memberMap.put(newMember.getSequence(), newMember);

        int after = memberMap.size();

        return after > before ? true : false;

    }


}
