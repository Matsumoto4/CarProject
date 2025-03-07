import java.util.Scanner;
public class MainClass {
	String mColor = "";
	int mkm =0;
	int mbattery = 0;
	
	
	
	public void mMain() {
		int int_return = 0;
		Scanner scn = new Scanner(System.in);
		String mscn ="";
		int_return = CarType();
			if(int_return == 1) {
			//プリウス
			int_return = 0;
			mColor = CarColor();
			mkm = drive_km();
			mbattery = battery_lifespan();
			Car purius_car = new Purius(mColor,mkm,mbattery);
			purius_car.drive();
			}else if(int_return == 2){
			//ステラ
			int_return = 0;
			mColor = CarColor();
			mkm = drive_km();
			mbattery = battery_lifespan();
			Car stera_car = new Stera(mColor,mkm,mbattery);
			while (mscn.equals("")) {
				stera_car.drive();
				System.out.println("");	
			}
			
			}else{
				System.out.println("車のタイプが正常に選択されませんでした。処理を終了します。");
				return;
			}
			
			

			
		
		
	}
	
	public int CarType() {
		int mreturn = 0;
		String Str_answer = "";
		Scanner scn = new Scanner(System.in);
		
		System.out.println("車の種類を選択してください。（1：プリウス、２：ステラ");
			Str_answer = scn.nextLine();
			while (!Str_answer.equals("1") && !Str_answer.equals("2")) {
				Str_answer="";
				System.out.println("車種は半角数字の1か2で入力してください");
				System.out.println("車の種類を選択してください。（1：プリウス、２：ステラ");
				Str_answer = scn.nextLine();
			}
			
			try{
				mreturn = Integer.parseInt(Str_answer);
			}catch(NumberFormatException e) {
				mreturn = 0 ;
			}			
//		scn.close();
		return mreturn;
	}
	
	public String CarColor() {
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
			try {
				return_int = Integer.parseInt(mKm);
			}catch(NumberFormatException e) {
				return_int = 0;
			}
//		scn.close();
			return return_int;
	}

	public int battery_lifespan() {
		int return_int = 0;
		String mbattery = "";
		Scanner scn = new Scanner(System.in);
		System.out.println("購入してからの経過年数を入力してください：");
			mbattery = scn.nextLine();
			try {
				return_int = Integer.parseInt(mbattery);			
			}catch(NumberFormatException e) {
				return_int = 0;
			}
//		scn.close();
			return return_int;
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MainClass a = new MainClass();
		a.mMain();
	}

}
