
public class NightState implements State {
	private static NightState singleton = new NightState();	// Singleton�p�^�[��
	private NightState() {								// �R���X�g���N�^��private
	}
	public static State getInstance() {					// �C���X�^���X�Q�b�^
		return singleton;
	}
	public void doClock(Context context, int hour) {	// �����ݒ胁�\�b�h
		if(9 <= hour && hour < 17) {
			context.changeState(DayState.getInstance());
		}
	}
	public void doUse(Context context) {				// ���Ɏg�p���\�b�h
		context.recordLog("���F��Ԃ̋��Ɏg�p�I");
	}
	public void doAlarm(Context context) {				// ���x��
		context.callSecurityCenter("���x��(���)");
	}
	public void doPhone(Context context) {				// �ʏ�d�b
		context.callSecurityCenter("��Ԃ̒ʘb�^��");
	}
	public String toString() {							// ������\��
		return "[���]";
	}
}
