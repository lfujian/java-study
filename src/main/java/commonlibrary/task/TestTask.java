package commonlibrary.task;

import java.util.Timer;//ÿһ��Timer�����Ӧһ���̣߳���ǰ��˳��ģ�ǰ��̫����ʱ�䣬����ľ�û����ʱִ����

/**
 * @author lfj  2015��8��28��
 * @Description: ���������࣬�����������
 */
public class TestTask {
	public static void main(String[] args) {
		Timer t = new Timer();          //����Timer�����
		MyTask mt = new MyTask();//��������
		t.schedule(mt, 1000,2000);   //���������ִ�У�1���ʼ��ÿ2���ظ�һ��
	}
}
// Timer��ĳ��÷���
//-- t.cancel();    ��ֹ�ü�ʱ���������������Ѱ��ŵ����񣬶Ե�ǰ����ִ�е�����û��Ӱ��
//-- t.purge();	  �������Ѿ�ȡ���������Ƴ���һ�������ͷſռ�
//-- t.schedule(task, time);	timeʱִ��task
//-- t.schedule(task, firstTime, period);	 firstTimeʱִ��task Ȼ��ÿ��period�ظ�ִ��һ��
//-- t.schedule(task, delay);		delay��ʼִ��task
//-- t.schedule(task, delay, period); delay��ʼִ��task timeʱִ��task Ȼ��ÿ��period�ظ�ִ��һ��
//-- t.scheduleAtFixedRate(task, firstTime, period); 	firstTimeʱִ��task Ȼ��ÿ��period�ظ�ִ��һ��
//-- t.scheduleAtFixedRate(task, delay, period);		delay��ʼִ��task timeʱִ��task Ȼ��ÿ��period�ظ�ִ��һ��
// schedule��scheduleAtFixedRate������
//-- schedule ִ��ʱ��������Զ�̶��ģ����֮ǰ��������ʱ��֮��Ҳ�ᰴ���趨�õļ��ʱ����ִ��
//-- scheduleAtFixedRate ���Ը��ݳ��ֵ��ӳ�ʱ���Զ�������һ�μ����ִ��ʹ����





