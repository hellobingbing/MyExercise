package org.bing.exercises.linked;
/**
 * 单向链表。
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
	// 每次加到链表的尾部。
	public void appendToTail(String name){
		Car car = new Car(name);
		Car current = this;
		while(current.nextCar != null){
			current = current.nextCar;
		}
		current.nextCar = car;
	}
	// 删除指定位置的节点，返回表头。
	public Car deleteNode(String name){
		Car current = this;
		// 若是删除表头节点
		if(current.getName().equals(name)){
			return current.getNextCar();
		}
		// 若不是删除表头节点
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
 * 遇到链表问题，要弄清楚是单向链表还是双向链表。
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
		System.out.println("删除相应节点之后:");
		Car head1 = head.deleteNode("Benz");
		Car current1 = head1;
		while(current1 != null){
			System.out.println(current1.getName());
			current1 = current1.getNextCar();
		}
		
	}

}
