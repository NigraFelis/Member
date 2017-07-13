package com.hanbit.member.controller;

import javax.swing.JOptionPane;

import com.habit.member.dao.MemberDAO;
import com.habit.member.daoImpl.MemberDAOImpl;
import com.hanbit.member.domain.MemberBean;
import com.hanbit.member.service.MemberService;
import com.hanbit.member.serviceImpl.MemberServiceImpl;

public class MemberController {
//1회원 추가 2.회원수 보기 3회원 목록보기
	
	public static void main(String[] args) {
		/*String sCount=(JOptionPane.showInputDialog("관리자님 총 최원수를 입력해주세요"));*/
		/*int count = Integer.parseInt(sCount);*/
		MemberService service = new MemberServiceImpl(/*count*/);
		MemberDAO service2 = new MemberDAOImpl();
		MemberBean member = null;
		while(true){
			switch(JOptionPane.showInputDialog("0.end 1.추가 .2수 3.목록 4.findById 5.findByName 6.update 7.delete")){
			case "0" :
				return;
			case "1" :
				member = new MemberBean();
				String[] arr = JOptionPane.showInputDialog("name/id/pass/snn").split("/");
				member.setName(arr[0]);
				member.setId(arr[1]);
				member.setPassword(arr[2]);
				member.setSNN(arr[3]);
				service.addMember(member);
				JOptionPane.showMessageDialog(null, "welecome");
				break;
			case "2" :
				JOptionPane.showMessageDialog(null, service.countMembers());
				break;
				
			case "3" :
				MemberBean[] list = service.getMembers();
				/*String result[] = new String[list.length];*/
				
				String slist="";
				for(int i=0; i<service.countMembers(); i++){
					slist = list[i].toString();
							/*"name:"+list[i].getName() + " Id:"+list[i].getId() + " SSN:"+list[i].getSSN() + " Pw" +list[i].getPassword();*/
				}
				JOptionPane.showMessageDialog(null, slist);
				break;
			
			case "4":
				
				JOptionPane.showMessageDialog(null, (service2.selectById(JOptionPane.showInputDialog("insert id"))).toString());
				break;
				
			case "5":
				String name = JOptionPane.showInputDialog("insert find id");
				MemberBean[] members=service.findByName(name);
				String result2="";
				if(members.length == 0){
					result2 = "조회할 이름이 없습니다";
				}
				else{
					for (int i=0; i<members.length;i++){
						result2+=members[i].toString()+"\n";
					}
				}
				JOptionPane.showMessageDialog(null, result2);
				
				/*JOptionPane.showMessageDialog(null, (service.findByName(JOptionPane.showInputDialog("insert name"))));*/
				break;
				
			case "6":
				/*
				String[] idpw = JOptionPane.showInputDialog("id/pass");
				member = new MemberBean();
				member.setId(idpw[0]);
				member.setPassword(idpw[1]);
				service.updatePass(member);
				JOptionPane.showMessageDialog(null, "비밀번호 변경");
				*/
				
				member = new MemberBean();
				member.setId(JOptionPane.showInputDialog("insert find id"));
				member.setPassword(JOptionPane.showInputDialog("insert update password"));
				service.modify(member);
				
				
				JOptionPane.showMessageDialog(null, "비밀번호 변경");
				break;
				
			case"7":
				member = new MemberBean();
				service.remove(JOptionPane.showInputDialog("insert delete id"));
				JOptionPane.showMessageDialog(null, "삭제완료");
				
				break;
			}
		}
	}
}
