import java.util.Scanner;


public class Stella extends EV_Car{
	String mess_Str = "・・・・・・・・・・・・（エンジン音無し）";

	public Stella() {
		super();
	}

	public Stella(String mColor) {
		super(mColor);
	}

	
	public void drive(int mkm) {
		km += mkm;
		Scanner scn  = new Scanner(System.in);
		String return_Str = "";
		int  return_int = 10;

		return_int = check_eng(mess_Str, battery, km);

		while (return_int != 0) {
			System.out.println("ドライブを続けますか?(0:終了,1：続行)");
			return_Str = scn.nextLine();
			return_int = input_int(return_Str);
			if (return_int == 1) {
				km += drive_km();
				return_int = check_eng(mess_Str, battery, km);
			}
		}
		
	}
	}

