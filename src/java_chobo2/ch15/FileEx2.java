package java_chobo2.ch15;

import java.io.File;

import javax.swing.JFileChooser;

public class FileEx2 {
	public static void main(String[] args) {
		File f = FileEx.getSearchFile();
		
		if(!f.exists()||!f.isDirectory()) {
			System.err.println("유효하지 않은 디랙토리입니다.");
			System.exit(0);
		}
		
		File[] files = f.listFiles();
		for(File file : files) {
			System.out.println(file.isDirectory() ? "["+file.getName()+"]" : file.getName());
		}
		
	}
	
	public static File getSearchFile() { //자바 파일 검색창으로 파일 선택하는법
		JFileChooser jfc = new JFileChooser(System.getProperty("user.dir"));
		jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);//차죠 모드 변경
		
		int res = jfc.showOpenDialog(null);
		File file = null;
		if(res == JFileChooser.APPROVE_OPTION) {
			file = jfc.getSelectedFile();
			System.out.println(file);
		}
		return file;
	}
}
