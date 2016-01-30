package commonlibrary.obserdemo;

import java.util.Observable;
import java.util.Observer;

/**
 * @author lfj  2015年8月22日
 * @Description: 观测者模式的实现
 */
public class ObserDemo01 {
	public static void main(String[] args) {
		House h = new House(100000);
		HousepriceObserver hpo1 = new HousepriceObserver("购房者A");
		HousepriceObserver hpo2 = new HousepriceObserver("购房者B");
		HousepriceObserver hpo3 = new HousepriceObserver("购房者C");
		h.addObserver(hpo1);
		h.addObserver(hpo2);
		h.addObserver(hpo3);
		System.out.println(h);
		h.setPrice(66666);
		System.out.println(h);
	}
}

class House extends Observable {
	private float price ;  //房价
	public House(float price) {
		this.price = price ;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		super.setChanged();					//设置变化点
		super.notifyObservers(price);		//通知所有观察者价格变化
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
		if (arg instanceof Float) {											//判断参数类型
			System.out.print(this.name+"观察到价格更换为：");
			System.out.println(((Float)arg).floatValue());
		}
	}
}






