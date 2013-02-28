
public interface State {
	public abstract void doClock(Context context, int hour);	// 時刻設定メソッド
	public abstract void doUse(Context context);				// 金庫使用メソッド
	public abstract void doAlarm(Context context);				// 非常ベルメソッド
	public abstract void doPhone(Context context);				// 通常電話メソッド
}
