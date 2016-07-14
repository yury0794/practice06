package prob6;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public List<Board> getBoardList(){
		List<Board> list = new ArrayList<Board>();
		
		// Database에서 데이터를 가져와서
		// Board 객체를 만들고 리스트 저장
		Board borad = new Board();
		borad.setTitle("제목");
		borad.setContent("내용");
		list.add(borad);		
		return list;
	}
}
