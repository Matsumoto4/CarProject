import java.util.FormatFlagsConversionMismatchException;
import java.util.Scanner;

public class Car {
	String color ="";
	int km =0;
	public Car(String mColor,int mkm) {
		color = mColor;
		km = mkm;
		
	}
	public void drive() {
		System.out.println("ブーン!!");
		km++;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
class Purius extends Car{
	int battery = 0;
	
	public Purius(String mColor, int mkm,int mbattery) {
		super(mColor, mkm);
		if(mbattery < 10) {battery = 10 - mbattery;}
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public void drive() {
//	    km++;
		Scanner scn  = new Scanner(System.in);
		String return_Str = "";
		int  return_int = 10;
		MainClass m = new MainClass();
		
	    System.out.println("スーーーッ"+"\n走行距離"+ km + "\nバッテリー寿命：" + battery +"年");
	    if(battery==0) {
	    	System.out.println("バッテリの寿命が無くなりました。バッテリーを確認して下さい");
	    	battery=10;
	    }
	    while (return_int != 0) {
	    	System.out.println("ドライブを続けますか?(0:終了,1：続行)");
		    return_Str = scn.nextLine();
		    try {
		    	return_int = Integer.parseInt(return_Str);
		    }catch(NumberFormatException e) {
		    	return_int = 5 ;
		    }
		    if (return_int == 1) {
		    	km += m.drive_km();
		    	battery = m.battery_lifespan();
		    	if (battery < 10 ) {
		    		battery = 10 - battery;
		    	}else {
		    		battery = 0;
		    	}
		    	
		    }
		    System.out.println("スーーーッ"+"\n走行距離"+ km + "\nバッテリー寿命：" + battery +"年");
		    if(battery==0) {
		    	System.out.println("バッテリの寿命が無くなりました。バッテリーを確認して下さい");
		    	battery=50;
		    }	    	
	    	
	    }

	}

}
class Stera extends Car{
	int battery = 0;
	public Stera(String mColor, int mkm,int mbettery) {
		super(mColor, mkm);
		// TODO 自動生成されたコンストラクター・スタブ
		if (mbettery < 30) {battery = 30 - mbettery;}
	}
	public void drive() {
//		km++;
		Scanner scn  = new Scanner(System.in);
		String return_Str = "";
		int  return_int = 10;
		MainClass m = new MainClass();
		
		System.out.println("・・・・・・・・・・・・（エンジン音無し）"+"\n走行距離"+ km  + "\nバッテリー寿命：" + battery +"年");
	    if(battery==0) {
	    	System.out.println("バッテリの寿命が無くなりました。バッテリーを確認して下さい");
	    	battery=50;
	    }
	    
	    while (return_int != 0) {
	    	System.out.println("ドライブを続けますか?(0:終了,1：続行)");
		    return_Str = scn.nextLine();
		    try {
		    	return_int = Integer.parseInt(return_Str);
		    }catch(NumberFormatException e) {
		    	return_int = 5 ;
		    }
		    if (return_int == 1) {
		    	km += m.drive_km();
		    	battery = m.battery_lifespan();
		    	if (battery < 50 ) {
		    		battery = 50 - battery;
		    	}else {
		    		battery = 0;
		    	}
		    	
		    }
			System.out.println("・・・・・・・・・・・・（エンジン音無し）"+"\n走行距離"+ km  + "\nバッテリー寿命：" + battery +"年");
		    if(battery==0) {
		    	System.out.println("バッテリの寿命が無くなりました。バッテリーを確認して下さい");
		    	battery=50;
		    }	    	
	    	
	    }
	    
	}
	
}


