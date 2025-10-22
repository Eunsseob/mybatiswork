package com.mybatis.member.service;

import com.mybatis.member.dto.member;

public interface MemberService {
	int checkId(String userId);
	
	member loginMember(member m);
	int updateMember(member m);
	int insertMember(member m);
	int deleteMember(String userId);
}
