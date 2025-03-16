import java.util.Scanner;

public abstract class HEV_Car extends Car {
	public int battery;
	String mess_Str;

	public HEV_Car() {
		super();
		battery = battery_lifespan();
	}

	public HEV_Car(String mColor) {
		super(mColor);
	}

	public void drive(int run_km) {
		//	    km++;
		Scanner scn  = new Scanner(System.in);
		String return_Str = "";
		int  return_int = 10;

		km+=run_km;
		return_int = check_eng(mess_Str,battery,km);

		while (return_int != 0) {
			System.out.println("ドライブを続けますか?(0:終了,1：続行)");
			return_Str = scn.nextLine();
			try {
				return_int = Integer.parseInt(return_Str);
			}catch(NumberFormatException e) {
				return_int = 0 ;
			}
			if (return_int == 1) {
				km += drive_km();
				return_int = check_eng(mess_Str,battery,km);
			}
		}
	}


	public int check_eng(String mess_String,int mbattery,int mkm) {
		int return_int = 1;
		System.out.println(mess_String+"\n走行距離"+ km + "\nバッテリー寿命：" + battery +"年");
		if(mbattery==10) {
			System.out.println("バッテリ寿命が無くなりました。バッテリーを確認して下さい");
			return_int = 0;
		}

		if(mkm >= limit_drive) {
			System.out.println("走行距離が"+limit_drive+"kmを超えました。走行バッテリやガソリンの残量を確認してください");
			return_int = 0 ;
		}

		return return_int;
	}

}
