
import java.util.Scanner;

abstract class Car  {
	String color ="";
    int km =0;
	protected int limit_drive = 100;
	
	public Car() {
		
	}
	
	public Car(String mColor) {
		color = mColor;
	}	
	
	public Car(String mColor,int mkm) {
		color = mColor;
		km = mkm;
	}
	
	public void drive(int mkm) {
		System.out.println("ブーン!!");
		km+=mkm;
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}
	
	public String carColor() {
		String mReturn = "";
		String mscn ="";
		Scanner scn = new Scanner(System.in);
			System.out.println("車の色を入力してください");
			mscn = scn.nextLine();
			while(mscn.equals("")) {
				System.out.println("車の色をなにか入力してください");
				mscn = scn.nextLine();
			}
		mReturn = mscn;
//		scn.close();
		return mReturn;
	}
	public int drive_km() {
		String mKm = "";
		int return_int = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("走行距離を入力してください：");
			mKm = scn.nextLine();
			return_int = input_int(mKm);
			//		scn.close();
			return return_int;
	}

	public int battery_lifespan() {
		int return_int = 0;
		String mbattery = "";
		Scanner scn = new Scanner(System.in);
		System.out.println("購入してからの経過年数を入力してください：");
			mbattery = scn.nextLine();
			return_int = input_int(mbattery);
			//		scn.close();
			return return_int;
	}
	public int input_int(String minput) {
		int return_int = 0;
		try{
			return_int = Integer.parseInt(minput);
		}catch(NumberFormatException e) {
			return_int = 0 ;
		}
		return return_int;
	}
}



