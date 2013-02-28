
public class DayState implements State {
	private static DayState singleton = new DayState();	// Singletonパターン
	private DayState() {								// コンストラクタはprivate
	}
	public static State getInstance() {					// インスタンスゲッタ
		return singleton;
	}
	public void doClock(Context context, int hour) {	// 時刻設定メソッド
		if(hour < 9 || 17 <= hour) {
			context.changeState(NightState.getInstance());
		}
	}
	public void doUse(Context context) {				// 金庫使用メソッド
		context.recordLog("金庫使用(昼間)");
	}
	public void doAlarm(Context context) {				// 非常ベル
		context.callSecurityCenter("非常ベル(昼間)");
	}
	public void doPhone(Context context) {				// 通常電話
		context.callSecurityCenter("通常の通話(昼間)");
	}
	public String toString() {							// 文字列表現
		return "[昼間]";
	}
}
