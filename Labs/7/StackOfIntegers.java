import java.util.ArrayList;
import java.util.Collections;


public class StackOfIntegers {

	private int[] elements;
	private int size;
	private int factor;
	
	public StackOfIntegers() {
		elements = new int[10];
		factor = 0;
	}
	
	public StackOfIntegers(int size) {
		elements = new int[size];
	}
	
	public void setFactor(int f) {
		factor = f;
	}
	
	public boolean empty() {
		return size == 0;
	}
	
	public int peek() {
		if (empty()) {
			return elements[size - 1];
		}
		return -1;
	}
	
	public void push(int value) {
		if(size != elements.length) {
			elements[size] = value;
			size++;
		}
	}
	
	
	public int pop() {
		if (!empty()) {
			size--;
			return elements[size];
		}
		return -1;
	}
	
	public int getSize() {
		return size;
	}

}
