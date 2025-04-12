package methods;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//날짜와 시간 표기
		Date today = new Date();
		System.out.println(today);
		
		//날짜 표기
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(date.format(today));
		//시간 표기
	    SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
	    System.out.println(time.format(today));

	}

}
