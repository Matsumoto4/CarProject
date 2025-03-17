
public class Roomba implements Auto_drive{

	@Override
	public void do_Auto_drive(int run_km) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("種別:Roomba -> 部屋の中を"+run_km +"ｍ 清掃しました");
	}

	@Override
	public String mess_Auto_drive() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("部屋の中を掃除します");
		return "ルンバ";
	}

}
