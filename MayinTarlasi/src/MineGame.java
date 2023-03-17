import java.util.Random;
import java.util.Scanner;

public class MineGame {
	Scanner in = new Scanner(System.in);
	Random rand=new Random();
	int rowNumber,colNumber,area;
	int[][] map;
	int[][]board;
	boolean game=true;
	MineGame(int rowNumber,int colNumber) {
		this.rowNumber=rowNumber;
		this.colNumber=colNumber;
		map=new int[rowNumber][colNumber];
		board=new int[rowNumber][colNumber];
		area=rowNumber*colNumber;
	}
	
	public void run() {
		int row,col,success=0;
		prepareMap();
		print(map);
		System.out.println("Start Game!");
		while(game) {
			print(board);
		System.out.print("Row : ");
		row = in.nextInt();
		System.out.print("Col : ");
		col = in.nextInt();
		System.out.println();
		if(map[row][col]!=-1) {
			check(row,col);
			success++;
			if(success == (area - (area/4))) {
				System.out.println("You won the game <3");
				break;
			}
		}else {
			System.out.println("Game Over");
			game=false;
		}
		}
	}
	
	public void check(int r,int c) {
		if(board[r][c]==0) {
			if((c>0))
		if((map[r][c-1]==-1) )
			board[r][c]++;
			
			if((c>0)&&(r>0))
		if((map[r-1][c-1]==-1))
			board[r][c]++;
			
			if((r>0))
		if((map[r-1][c]==-1))
			board[r][c]++;
			
			if((r>0)&&(c<colNumber-1))
		if((map[r-1][c+1]==-1))
			board[r][c]++;
			
			if((c<colNumber-1))
		if((map[r][c+1]==-1))
			board[r][c]++;
			
			if((r<rowNumber-1)&&(c<colNumber-1))
		if((map[r+1][c+1]==-1))
			board[r][c]++;
		
			if((r<rowNumber-1))
		if((map[r+1][c]==-1))
			board[r][c]++;
		
			if((r<rowNumber-1)&&(c>0))
		if((map[r+1][c-1]==-1))
			board[r][c]++;
		
		if(board[r][c]==0) {
			board[r][c]=-2;
		}
		}
	}
	
	public void prepareMap() {
		
		int count=0;
		while(count!=(area/4)) {
			int randRow=rand.nextInt(rowNumber);
			int randCol=rand.nextInt(colNumber);
			if(map[randRow][randCol]!=-1) {
				map[randRow][randCol]=-1;
				count++;
			}else
				continue;	
		}
	}
	
	public void print(int[][] arr) {
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0 ; j< arr[0].length;j++) {
				if(arr[i][j]<=-1) {
					System.out.print(arr[i][j]);
				}else
					System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
}
