
public interface State {
	public abstract void doClock(Context context, int hour);	// �����ݒ胁�\�b�h
	public abstract void doUse(Context context);				// ���Ɏg�p���\�b�h
	public abstract void doAlarm(Context context);				// ���x�����\�b�h
	public abstract void doPhone(Context context);				// �ʏ�d�b���\�b�h
}
