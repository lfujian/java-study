package commonlibrary.task;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/**
 * @author lfj  2015��8��28��
 * @Description: ���� TimerTask ������
 */
public class MyTask extends TimerTask { //���������Ҫ�̳�TimerTask

	@Override
	public void run() {
		SimpleDateFormat sdf = null;
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		System.out.println("��ǰϵͳʱ��Ϊ��"+sdf.format(new Date()));
	}
}
