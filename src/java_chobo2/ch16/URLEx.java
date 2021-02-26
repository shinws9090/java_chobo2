package java_chobo2.ch16;

import java.net.URL;

public class URLEx {
		public static void main(String[] args) throws Exception {
			
			URL url = new URL("https://sports.news.naver.com/index.nhn");
			
			System.out.println(url.getAuthority());//호스트명 포트
			
			System.out.println(url.getContent());
			
			System.out.println(url.getDefaultPort()); //기본포트
			
			System.out.println(url.getPort()); //현재포트
			
			System.out.println(url.getFile()); //파일명이랑 쿼리
			
			System.out.println(url.getHost()); //호스트 (주소)
			
			System.out.println(url.getPath()); //경로명
			
			System.out.println(url.getProtocol()); //프로토콜 http stmp top 등등
			
			System.out.println(url.getQuery()); //쿼리
			
			System.out.println(url.getRef()); //인덱스 (참조)
			
			System.out.println(url.getUserInfo()); // 사용자정보
			
			System.out.println(url.toExternalForm()); //URL을 문자열로 반환
			
			System.out.println(url.toURI()); //URL을 객체로 반환
			
		}
	
}
