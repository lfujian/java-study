package commonlibrary.obserdemo;

import java.util.Observable;
import java.util.Observer;

/**
 * @author lfj  2015��8��22��
 * @Description: �۲���ģʽ��ʵ��
 */
public class ObserDemo01 {
	public static void main(String[] args) {
		House h = new House(100000);
		HousepriceObserver hpo1 = new HousepriceObserver("������A");
		HousepriceObserver hpo2 = new HousepriceObserver("������B");
		HousepriceObserver hpo3 = new HousepriceObserver("������C");
		h.addObserver(hpo1);
		h.addObserver(hpo2);
		h.addObserver(hpo3);
		System.out.println(h);
		h.setPrice(66666);
		System.out.println(h);
	}
}

class House extends Observable {
	private float price ;  //����
	public House(float price) {
		this.price = price ;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		super.setChanged();					//���ñ仯��
		super.notifyObservers(price);		//֪ͨ���й۲��߼۸�仯
		this.price = price;
	}
	public String toString() {
		return "House [price=" + price + "]";
	}
}

class HousepriceObserver implements Observer {
	private String name ;
	public HousepriceObserver(String name) {
		this.name = name ;
	}
	public void update(Observable o, Object arg) {
		if (arg instanceof Float) {											//�жϲ�������
			System.out.print(this.name+"�۲쵽�۸����Ϊ��");
			System.out.println(((Float)arg).floatValue());
		}
	}
}






