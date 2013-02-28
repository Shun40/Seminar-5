
public class NightState implements State {
	private static NightState singleton = new NightState();	// Singletonパターン
	private NightState() {								// コンストラクタはprivate
	}
	public static State getInstance() {					// インスタンスゲッタ
		return singleton;
	}
	public void doClock(Context context, int hour) {	// 時刻設定メソッド
		if(9 <= hour && hour < 17) {
			context.changeState(DayState.getInstance());
		}
	}
	public void doUse(Context context) {				// 金庫使用メソッド
		context.recordLog("非常：夜間の金庫使用！");
	}
	public void doAlarm(Context context) {				// 非常ベル
		context.callSecurityCenter("非常ベル(夜間)");
	}
	public void doPhone(Context context) {				// 通常電話
		context.callSecurityCenter("夜間の通話録音");
	}
	public String toString() {							// 文字列表現
		return "[夜間]";
	}
}
