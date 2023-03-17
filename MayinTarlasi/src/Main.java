import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome the game!");
		System.out.println("-2 on the map means there are no mines around that square.");
		System.out.println("Please enter map size.");
		System.out.print("Row size : ");
		int row1=in.nextInt();
		System.out.print("Col size : ");
		int col1=in.nextInt();
		MineGame mine = new MineGame(row1, col1);
		mine.run();
		in.close();
	}

}
