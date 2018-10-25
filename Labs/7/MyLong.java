
public class MyLong {
	
	private long value;
	
	public MyLong(long newValue) {
		value=newValue;
	}
	
	public long getValue() {
		return value;
	}
	
	public boolean isEven() {
		return value%2 == 0;
	}
	
	public boolean isOdd() {
		return value%2 != 0;
	}
	
	public boolean isPrime() {
		if (value ==1 || value == 2) {
			return true;
		} else {
			for(int i=2; i<value; i++) {
				if(value%i == 0) {
					return false;
				}
			}
			return true;
	}
	}
	
	public boolean isEven(long v2) {
		return v2%2 == 0;
	}
	
	public boolean isOdd(long v2) {
		return v2%2 != 0;
	}
	
	public static boolean isPrime(long v2) {
		if (v2 == 1 || v2 == 2) {
			return true;
		} else {
			for(int i=2; i<v2; i++) {
				if(v2%i == 0) {
					return false;
				}
		}
		return true;
	}
	
	}
	
	public static boolean isEven(MyLong v2) {
		return v2.isEven();
	}
	
	public static boolean isOdd(MyLong v2) {
		return v2.isOdd();
	}
	
	public static boolean isPrime(MyLong v2) {
		return v2.isPrime();
	}
	
	public boolean equals(long testInt) {
		if (testInt == value) 
			return true;
		return false;
	}
	
	public boolean equals(MyLong v2) {
		if (v2.value == this.value)
			return true;
		return false;
	}
	
	public static long parseInt(char[] values) {
		int sum = 0;
		for (char i : values) {
			sum += Character.getNumericValue(i);
		}
		return sum;
	}
	
	public static long parseInt(String value) {
		return Integer.parseInt(value);
	}

}
