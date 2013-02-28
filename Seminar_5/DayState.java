
public class DayState implements State {
	private static DayState singleton = new DayState();	// Singleton�p�^�[��
	private DayState() {								// �R���X�g���N�^��private
	}
	public static State getInstance() {					// �C���X�^���X�Q�b�^
		return singleton;
	}
	public void doClock(Context context, int hour) {	// �����ݒ胁�\�b�h
		if(hour < 9 || 17 <= hour) {
			context.changeState(NightState.getInstance());
		}
	}
	public void doUse(Context context) {				// ���Ɏg�p���\�b�h
		context.recordLog("���Ɏg�p(����)");
	}
	public void doAlarm(Context context) {				// ���x��
		context.callSecurityCenter("���x��(����)");
	}
	public void doPhone(Context context) {				// �ʏ�d�b
		context.callSecurityCenter("�ʏ�̒ʘb(����)");
	}
	public String toString() {							// ������\��
		return "[����]";
	}
}
