package Arrays;

public class arrayChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//알파벳 대문자 저장 - 26개 - 배열
		//한 개의 문자 저장하고 출력 - 변수
		char ch = 'A';
//		ch = (char)(ch + 1); - 반드시 형변환 해야 함
//		ch++;//형 변환 없어도 괜찮음
		char[] alphabets = new char[26];
		
		for(int i = 0;i < alphabets.length;i++) {
			alphabets[i] = ch;
			System.out.println(alphabets[i] + ", " +(int)alphabets[i]);
			ch++;
		}

	}

}
