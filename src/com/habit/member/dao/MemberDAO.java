package com.habit.member.dao;

import com.hanbit.member.domain.MemberBean;

public interface MemberDAO {
	public void insert(MemberBean member);
	public MemberBean[] selectAll();
	public MemberBean[] selectByName(String name);
	public MemberBean selectById(String id);
	public int count();
	public void update(MemberBean member);
	public void delete(String id);
}
