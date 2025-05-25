package writer_read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		/*
		 * 파일 입출력 프로세스
		 * 1. 파일을 연다.(파일 경로 - 절대경로, 상대경로)
		 * 2. 파일을 쓴다.
		 * 3. 파일을 닫는다.
		 */
		try {
		Reader reader = new FileReader("c:/file/text.txt");

		//파일 읽기
		//-1은 문자 없음
		while(true) {
			int data = reader.read();
			if(data == -1)break;
		}
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
	}

}
