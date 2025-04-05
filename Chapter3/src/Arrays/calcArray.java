package Arrays;

public class calcArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수형 배열을 생성하고 연산
		//합계와 총점
		int[] score = new int[] {75,90,80,60};
		
		int sum = 0;
		for(int i = 0; i < score.length;i++) {
			sum += score[i];
		}
		System.out.println("합계: " + sum);
		System.out.println("평균: " + (float)sum/score.length);
        //printf() - 대응서식 %d - 정수, %f - 실수, %s - 문자
		System.out.printf("평균: %.1f\n",(float)sum/score.length);
		
		//최대값,최소값
		int max;
		max = score[0];
		for(int i = 0; i < score.length;i++) {
			if(score[i] > max)
				max = score[i];
		}
		System.out.println("최고 점수: " + max);
	}

}
