
public class Prius_Auto extends Prius implements Auto_drive{

	public Prius_Auto() {
		battery = 0;
	}
	public Prius_Auto(String mColor) {
		color = mColor;
	}
	@Override
	public void do_Auto_drive(int run_km) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("自動運転を開始します。ハンドルから手を離さないでください");
		drive(run_km);
		System.out.println("自動運転終了");
	
	}

	@Override
	public String mess_Auto_drive() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("車種：Prius /色："+ color +"/注意事項：自動運転をするときは運転手も安全に注意してください。");
		return "Prius("+ color + ")";
	}

}
