package com.mybatis.member.repository;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.member.dto.member;

public class MemberRepository {

	public int checkId(SqlSession sqlSession, String userId) {
		return sqlSession.selectOne("memberMapper.checkId",userId);
	}

	public int insertMember(SqlSession sqlSession, member m) {
		return sqlSession.insert("memberMapper.insertMember", m);
	}
}
