package day_05;

import java.util.ArrayList;
import java.util.List;

// 조회수 처리
public class PostRepository {
	static List<PostDTO> postList = new ArrayList<>();
	int a = 0;
	/*
	 * 매개변수타입:
	 * 매개변수이름:
	 * 리턴:
	 * 메서드이름:
	 */
	void save(PostDTO post) {
		postList.add(post);
	}

	public List<PostDTO> findAll() {
		return postList;
	}

	public List<PostDTO> view(Long aId) {
		return postList;
		
	}
	public void aupdateHits(Long aId) {
		for (int i = 0; i < postList.size(); i++) {
			if(aId.equals(postList.get(i).getId())) {
				int hits = postList.get(i).getHits(); // 현재 조회수 값
				hits = hits +1; //현재 조회수에서 하나증가
				postList.get(i).setHits(hits);
				//postList.get(i).setHits(postList.get(i).getHits()+1);
			}
		}
	}
	
	public Long chek(Long id, String pass) {
		Long chek = null;
		for (int i = 0; i < postList.size(); i++) {
			
			if (id.equals(postList.get(i).getId()) && pass.equals(postList.get(i).getPass())) {
				chek = postList.get(i).getId();
			}
		}
		return chek;
	}
	
	public PostDTO update(Long id, String title, String cont) {
		PostDTO q = null;
		for (int i = 0; i < postList.size(); i++) {
			if (id.equals(postList.get(i).getId())) {
				postList.get(i).setTitle(title);
				postList.get(i).setCont(cont);
				q = postList.get(i);
			}
		}
		return q;
	}
	
	public List<PostDTO> findById(String name) {
		// name: 사용자가 찾고 싶은 작성
		// postList에 저장된 작성자와 일치하는 것만 찾아서 findByIdList에 저장
		List<PostDTO> findByIdList = new ArrayList<>();
		for (int i = 0; i < postList.size(); i++) {
			if (name.equals(postList.get(i).getName())) {
				PostDTO findByIdPost = postList.get(i);
				findByIdList.add(findByIdPost);
				//findByIdList.add(postList.get(i));
			}
		}return findByIdList;
	}
	
	public void delete(Long id, String pass) {
		for (int i = 0; i < postList.size(); i++) {
			if (id.equals(postList.get(i).getId())) {
				postList.remove(i);
				
			}
		}
	}
}
				
