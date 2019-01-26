package hijava.practice;

public class Man {
	public static final int COFFEE = 3000;
	public final static int DONUT = 2500;

	private String name;
	private int amount;

	public Man() {
		this.amount = 10000;
	}

	public Man(String name) {
		this();
		this.name = name;
	}

	public void buyCoffee(int count) {
//		this.amount = this.amount - 3000 *count;
//		this.amount -= COFFEE * count;
		this.subAmount(COFFEE, count);
	}

	private void subAmount(int coffee2, int count) {
	}

	public void buyDonut(int count) {
		this.subAmount(DONUT, count);
	}

	public void buyCoffee(int price, int count) {
		this.amount -= price * count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Man [name=" + name + ", amount=" + amount + "]";
	}

	public static void main(String[] args) {
		Man hong = new Man("Hong");
		Man john = new Man("john");

		hong.buyCoffee(1);
		hong.buyDonut(2);

		john.buyCoffee(1);
		john.buyDonut(1);
		
		System.out.println(hong);
		System.out.println(john);
	}


}
