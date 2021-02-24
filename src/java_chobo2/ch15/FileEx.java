package java_chobo2.ch15;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;

public class FileEx {
	public static void main(String[] args) throws IOException {
		
//		File f = new File("C:\\workspace_java\\native_jdbc_programing\\src\\native_jdbc_programing\\dto\\Department.java");
		File f = getSearchFile();
		
		String fileName = f.getName();
		System.out.println(fileName);
		int idx =fileName.lastIndexOf(".");
		
		System.out.println("확장자를 제외 한 파일이름 : "+ fileName.substring(0,idx));
		System.out.println("확장자 : "+ fileName.substring(idx+1));
		
		System.out.println("경로를 포함한 이름 : "+ f.getPath());
		System.out.println("파일의 절대경로 : "+f.getAbsolutePath());
		System.out.println("파일의 정규경로 : "+f.getCanonicalPath());
		System.out.println("파일이 속해있는 디랙토리 : "+f.getParent());
		System.out.println();
		System.out.println("File.pathSeparator :"+File.pathSeparator);
		System.out.println("File.pathSeparatorChar :"+File.pathSeparatorChar);
		System.out.println("File.separator : "+File.separator);
		System.out.println("File.separatorChar : "+File.separatorChar);
		System.out.println();
		System.out.println("user.dir = "+System.getProperty("user.dir"));
		System.out.println("sun.boot.class.path = "+System.getProperty("sun.boot.class.path"));
		
	}

	public static File getSearchFile() { //자바 파일 검색창으로 파일 선택하는법
		JFileChooser jfc = new JFileChooser(System.getProperty("user.dir"));
		jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);//차죠 모드 변경
		int res = jfc.showOpenDialog(null);
		File file = null;
		if(res == JFileChooser.APPROVE_OPTION) {
			file = jfc.getSelectedFile();
			System.out.println(file);
		}
		return file;
	}
}
