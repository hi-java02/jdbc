package com.javaex.author01;

import java.util.List;

public class AuthorApp {

	public static void main(String[] args) {
		
		AuthorDao authorDao = new AuthorDao();
		
		//int count = authorDao.authorInsert("이문열", "경북영양"); //작가테이블에 데이터 저장
		//System.out.println(count + "건  등록되었습니다.");
		
		
		//등록
		//authorDao.authorInsert("이문열", "경북영양"); //작가테이블에 데이터 저장
		//authorDao.authorInsert("박경리", "경상남도 통영"); //작가테이블에 데이터 저장
		
		
		//리스트
	    List<AuthorVo> authorList = authorDao.getAuthorList();
	    
	    //리스트 전체 출력
	    System.out.println("=======작가 리스트=======");
	    for(int i=0; i<authorList.size(); i++) {
	    	  AuthorVo vo = authorList.get(i);
	    	  System.out.println(vo.getAuthorId() + ". " + vo.getAuthorName() + ", " + vo.getAuthorDesc());
	    }
	    
	    
	    
	    //리스트 출력
		
	    /*
	    authorDao.authorDelete(1);
	    authorDao.authorUpdate(2, "김경리", "제주도" );
		*/
		
	}

}
