package day_09;

import java.util.*;

public class MemberRepositoryMap {
	static Map<Long, MemberDTO> memberMap = new HashMap<>();

	public MemberDTO save(MemberDTO newMember) {
		return memberMap.put(newMember.getId(), newMember);
	}

	public boolean login(String memberId, String memberPassword) {
		boolean result = false;
		for (Long key: memberMap.keySet()) {
			if(memberId.equals(memberMap.get(key).getMemberId()) && 
					memberPassword.equals(memberMap.get(key).getMemberPassword())) {
				result = true;
			} 
		}
		return result;
	}

	public Map<Long, MemberDTO> findAll() {
		return memberMap;
	}

	public MemberDTO findById(Long findId) {
		MemberDTO member = null;
		for (Long key: memberMap.keySet()) {
			if(findId.equals(memberMap.get(key).getId())) {
				member = memberMap.get(key);
			} 
		}
		return member;
	}

	public Long loginCheck(String memberId, String memberPassword) {
		Long loginId = null;
		for (Long key: memberMap.keySet()) {
			if(memberId.equals(memberMap.get(key).getMemberId()) && 
					memberPassword.equals(memberMap.get(key).getMemberPassword())) {
				loginId = memberMap.get(key).getId();
			} 
		}
		return loginId;
	}

	public MemberDTO update(Long loginId, String updateMobile) {
		MemberDTO member = null;
		for (Long key: memberMap.keySet()) {
			if(loginId.equals(memberMap.get(key).getId())) {
				memberMap.get(key).setMemberMobile(updateMobile);
				member = memberMap.get(key); 
			} 
		}
		return member;
	}

	public void delete(Long deleteId) {
		for (Long key: memberMap.keySet()) {
			if(deleteId.equals(memberMap.get(key).getId())) {
				memberMap.remove(key);
			} 
		}
	}



}
