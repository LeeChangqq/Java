package day_07;

import java.util.HashMap;
import java.util.Map;

import day_05.MemberDTO;

public class MemberRepository {
	static Map<Long, MemberDTO> map = new HashMap<>();
	

	public void save(Long id, MemberDTO mem) {
		map.put(id, mem);
	}
	public boolean login(String memberId, String memberPassword) {
		boolean result = false;
		for (Long i: map.keySet()) {
			if(memberId.equals(map.get(i).getMemberId()) && 
					memberPassword.equals(map.get(i).getMemberPassword())) {
				result = true;
			} 
		}
		return result;
	}
	
	public MemberDTO findAll() {
		MemberDTO a = null;
		for (Long s : map.keySet()) {
			System.out.println(map.get(s));
			a = map.get(s);
		}
		return a;
	}
	public MemberDTO findById(Long findId) {
		MemberDTO member = null;
		for (Long i: map.keySet()) {
			if(findId.equals(map.get(i).getId())) {
				member = map.get(i);
			} 
		}
		return member;
	}
	public Long loginCheck(String memberId, String memberPassword) {
		Long loginId = null;
		for (Long i: map.keySet()) {
			if(memberId.equals(map.get(i).getMemberId()) && 
					memberPassword.equals(map.get(i).getMemberPassword())) {
				loginId = map.get(i).getId();
			} 
		}
		return loginId;
	}

	public MemberDTO update(Long loginId, String updateMobile) {
		MemberDTO member = null;
		for (Long i : map.keySet()) {
			if(loginId.equals(map.get(i).getId())) {
				map.get(i).setMemberMobile(updateMobile);
				member = map.get(i); 
			} 
		}
		return member;
	}
	public void delete(Long deleteId) {
		for (Long i: map.keySet()) {
			if(deleteId.equals(map.get(i).getId())) {
				map.remove(i);
			} 
		}
	}
}
