package chap2;

public class Seats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 입장객 수에 따른 좌석열과 줄을 만들어
		 자리 배치하는 프로그램
		 입장객수가 좌석열에 나누어떨어지는 경우와 그렇지 않은 경우로 구분
		 */
		int customer = 22, column = 5, row = 0;
		if(customer % column == 0)
			row = customer / column;
		else if(customer % column != 0)
			row = (int)(customer / column) + 1;
		
		
		System.out.println(row);
		for(int i = 0;i < row;i++) {
			for(int j = 1;j <= column;j++) {
				System.out.print("seat" + (i*5) + j + " ");
			if(i*column + j > customer)
				break;
			}
			System.out.println();
		}
		

	}

}
