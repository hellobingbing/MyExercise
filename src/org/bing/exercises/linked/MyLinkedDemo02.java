package org.bing.exercises.linked;
/**
 * ��������
 * @author Acer
 *
 */
class Car{
	private String name;
	private Car nextCar;
	public Car(String name){
		this.setName(name);
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setNextCar(Car nextCar){
		this.nextCar = nextCar;
	}
	public Car getNextCar(){
		return this.nextCar;
	}
	// ÿ�μӵ������β����
	public void appendToTail(String name){
		Car car = new Car(name);
		Car current = this;
		while(current.nextCar != null){
			current = current.nextCar;
		}
		current.nextCar = car;
	}
	// ɾ��ָ��λ�õĽڵ㣬���ر�ͷ��
	public Car deleteNode(String name){
		Car current = this;
		// ����ɾ����ͷ�ڵ�
		if(current.getName().equals(name)){
			return current.getNextCar();
		}
		// ������ɾ����ͷ�ڵ�
		while(current.nextCar != null){
			if(current.nextCar.getName().equals(name)){
				current.nextCar = current.nextCar.nextCar;
				return this;
			}
			current = current.nextCar;
		}
		return this;
	}
	
}

/**
 * �����������⣬ҪŪ����ǵ���������˫������
 * @author Acer
 *
 */
public class MyLinkedDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car head = new Car("BMW");
		head.appendToTail("Benz");
		head.appendToTail("Audi");
		head.appendToTail("BMW");
		
		Car current = head;
		while(current != null){
			System.out.println(current.getName());
			current = current.getNextCar();
		}
		System.out.println("ɾ����Ӧ�ڵ�֮��:");
		Car head1 = head.deleteNode("Benz");
		Car current1 = head1;
		while(current1 != null){
			System.out.println(current1.getName());
			current1 = current1.getNextCar();
		}
		
	}

}
