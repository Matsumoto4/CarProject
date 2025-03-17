import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import java.util.HashMap;
import java.util.Map.Entry;

public class MainClass {
	String mColor = "";
	int mkm =0;
	//int mbattery = 0;



	public void mMain() {
		int int_return = 0;
		Scanner scn = new Scanner(System.in);
		Car test_car  ;
		int_return = carType();
		

		if(int_return == 1) {
			test_car = new Prius();	//プリウス
		}else if(int_return == 2){
			test_car = new Stella();	//ステラ
		}else{
			System.out.println("車のタイプが正常に選択されませんでした。処理を終了します。");
			return;
		}

		test_car.color = test_car.carColor();
		
		//		test_car. = test_car.battery_lifespan();
		do_drive(test_car);
	}

	private void do_drive(Car mCar) {
		mCar.drive(mCar.drive_km());
	}


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MainClass a = new MainClass();
		Scanner scn = new Scanner(System.in);
		String str_Answer = "";
		
		System.out.println("車の運転をしますか？それとも自動運転の機械を５台発注をしますか？(D:車の運転、A：５台発注）");
		str_Answer = scn.nextLine();
		if(str_Answer.equals("D")) {
			a.mMain();	
		}else if(str_Answer.equals("A")) {
			a.make5Car();
		}else {
			System.out.println("処理を終了します");
		}
		
	}

	public int carType() {
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
		return mreturn;
	}

	public void make5Car() {
		System.out.println("自動運転の機械を５台注文します");
		ArrayList<ArrayList<Auto_drive>> car_auto_list = new ArrayList<>();

		for(int i = 0; i < 5 ; i++) {
			car_auto_list.add(new ArrayList<>());
			car_auto_list.get(i).add(select_cartype());
		}

		HashMap<String, Integer> Car5_list = new HashMap<>();
		
		for(int i = 0; i < 5; i++) {
			for(Auto_drive aa : car_auto_list.get(i)) {
				System.out.print((i+1)+"台目->");
			Car5_list.put(aa.mess_Auto_drive(),i);
			}
		}
	
		//プリウスのデータだけを再出力するコード
		Car5_list.forEach((key, value) -> {
		    if (key.contains("Prius")) {
		        System.out.println(key + " : " + value);
		    }
		});

	}

	public Auto_drive select_cartype() {
		Auto_drive return_Auto_drive = null;
		Scanner scn = new Scanner(System.in);
		String str_Answer ="";

		System.out.println("種類を選択してください（P:プリウス,S:ステラ,R:ルンバ）");
		str_Answer = scn.nextLine();
		while(!str_Answer.equals("P") && !str_Answer.equals("S") && !str_Answer.equals("R") ) {
			System.out.println("種類は半角の大文字で入力してください");
			System.out.println("種類を選択してください（P:プリウス,S:ステラ,R:ルンバ）");
			str_Answer = scn.nextLine();
		}
		if(str_Answer.equals("P")) {
			Prius_Auto p = new Prius_Auto("");
			p.color = p.carColor();
			return_Auto_drive = p;
		}else if(str_Answer.equals("S")) {
			Stella_Auto s = new Stella_Auto("");
			s.color = s.carColor();
			return_Auto_drive = s;
		}else {
			Roomba r = new Roomba();
			return_Auto_drive = r;
		}
		return return_Auto_drive;
	}

}
