package com.habit.member.dao;

import java.util.List;

import com.hanbit.member.domain.MemberBean;

public interface MemberDAO {
	public int insert(MemberBean member);
	public List<MemberBean> selectAll();
	public List<MemberBean> selectByName(String name);
	public MemberBean selectById(String id);
	public int count();
	public int update(MemberBean member);
	public int delete(String id);
}
