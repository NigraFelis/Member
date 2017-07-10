package com.hanbit.member.serviceImpl;


import com.hanbit.member.domain.MemberBean;
import com.hanbit.member.service.MemberService;

public class MemberServiceImpl implements MemberService {
	int count;
	
	MemberBean member;
	MemberBean[] list;
	public MemberServiceImpl(){
		count=0;
		member = new MemberBean();
		list = new MemberBean[count];
	}
	
	@Override
	public void addMember(MemberBean member) {
		if (count==list.length){
			MemberBean[] temp = new MemberBean[count +1];
			System.arraycopy(list, 0, temp, 0, count);
			list=temp;
		}
		list[count++] = member;
	}

	@Override
	public MemberBean[] getMembers() {
		MemberBean[] result = new MemberBean[count];
		if(count==list.length){
			result = list;	
		}
		else{
			for(int i=0; i<count;i++){
				result[i] = list[i];
			}
		}
		return result;
	}

	@Override
	public int countMembers() {
		return count;
	}

	/*@Override
	public MemberBean findById(String id) {
		MemberBean result = null;
		for(int i=0; i<list.length; i++){
			if(id.equals (list[i].getId())){
				result = list[i];
			}
		}
		return result;
	}*/
	@Override
	public MemberBean findById(String id) {
		member=new MemberBean();
		for(int i=0;i<list.length;i++){
			if(id.equals(list[i].getId())){
				member=list[i];
				
			}
		}
		return member;
	}

	@Override
	public MemberBean[] findByName(String name) {
		int count=0;
	
		for(int i=0; i<list.length; i++){
			if(name.equals (list[i].getName())){
				count++;
			}
		}
		MemberBean[] temp = new MemberBean[count];
		
		/*for(int i=0; i<count; i++){
			for(int j=0; j<list.length; j++){
				if(name.equals (list[j].getName())){
					temp[i] = list[j];	
				}
			}
		}*/
		
		int j=0;
		for(int i=0;i<list.length;i++){
			if(name.equals(list[i].getName())){
				temp[j]=list[i];
				j++;
			}
			if(count==j){
				break;
			}
		}
		return temp;
	}

	@Override
	public void updatePass(MemberBean member) {
		
		/*for(int i=0;i<list.length;i++){
			if(member.getId().equals(list[i].getId())){
				list[i].setPassword(member.getPassword());;
			}
		}*/
		/*for(int i=0;i<list.length;i++){
			if(findById(member.getId()).equals(list[i].getId())){
				list[i].setPassword(member.getPassword());;
			}
		}*/
		(findById(member.getId())).setPassword(member.getPassword());;
		
	}
	
	@Override
	public void delete(String id) {
		/*MemberBean deleteId = findById(id);
		deleteId.setId(null);
		deleteId.setPassword(null);
		deleteId.setName(null);
		deleteId.setSNN(null);*/
		
		/*findById(id).setPassword(null);
		findById(id).setName(null);
		findById(id).setSNN(null);
		findById(id).setId(null);*/
		
		for(int i=0;i<count;i++){
			if(id.equals(list[i].getId())){
				list[i] = list[count-1];
				list[count-1]=null;
				count --;
			}
		}
		
		
		
	}
}
