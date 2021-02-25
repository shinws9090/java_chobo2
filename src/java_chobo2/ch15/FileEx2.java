package java_chobo2.ch15;

import java.io.File;
import java.util.ArrayList;

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
		
		printFileList(f);
		
	}
	
	private static void printFileList(File f) {
		System.out.println(f.getAbsolutePath()+"디렉토리");
		File[] files = f.listFiles();
		ArrayList subDir = new ArrayList();
		
		for(int i =0; i <files.length;i++) {
			String filename = files[i].getName();
			if(files[i].isDirectory()) {
				filename = "["+filename+"]";
				subDir.add(i+"");
			}
			System.out.println(filename);
		}
		
		int dirNum = subDir.size();
		int fileNum = files.length-dirNum;
		
		System.out.println(fileNum + "개의 파일"+dirNum+"개의 디랙토리");
		System.out.println();
		
		for(int i = 0; i <subDir.size();i++) {
			int index = Integer.parseInt((String)subDir.get(i));
			printFileList(files[index]);
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
