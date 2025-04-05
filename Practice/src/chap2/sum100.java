package chap2;

public class sum100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum = 0;
		
		for(n = 0;sum <= 100;)//증감 조건을 쓰면 증가가 2번 되고,n++ 시에 원하는 수에 한번 더 증가한 수가 출력됨.
			sum += (++n);
		System.out.println("n = " + n);
		System.out.println("sum = " + sum);

	}

}
