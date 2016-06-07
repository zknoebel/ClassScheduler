import java.io.FileReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)throws java.io.IOException{
		int weekLength = 5;
		int time = 148;
		boolean overlap = false;
		Scanner scanner = new Scanner(new FileReader("src//classRoster.txt"));
		int[][] week = new int[5][148];
		for(int i = 0; i < 5; i ++){
			for(int j = 0; j < 148; j ++){
				week[i][j] = 0;
			}
		}

		ClassOption[][] list = new ClassOption[10][10];
		for(int i = 0; i < 10; i ++){
			for(int j = 0; j < 10; j ++){
			list[i][j] = new ClassOption(
					scanner.next(),
					scanner.nextInt(),
					scanner.nextInt(),
					scanner.nextInt(),
					scanner.nextInt(),
					scanner.nextInt(),
					scanner.nextInt(),
					scanner.nextInt(),
					scanner.nextInt(),
					scanner.nextInt(),
					scanner.nextInt(),
					scanner.nextInt(),
					scanner.nextInt(),
					scanner.nextInt(),
					scanner.nextInt(),
					scanner.nextInt(),
					scanner.nextInt(),
					scanner.nextInt(),
					scanner.nextInt(),
					scanner.nextInt(),
					scanner.nextInt()
					);
		}
		}
		for(int f = 0; f < 10; f ++){
		for(int g = 0; g < 10; g ++){
			for(int h = 0; h < 10; h ++){
				for(int i = 0; i < weekLength; i ++){
					for(int j = 0; j < time; j ++){
						week[i][j] += list[f][h].list(i,j) + list[f][g].list(i, j);

					}
				}
				for(int i = 0; i < weekLength; i ++){
					for(int j = 0; j < time; j ++){
						if(list[f][h].list(i,j) + list[f][g].list(i, j) > 1){
							overlap = true;
						}

					}
				}
				if(!overlap){
					for(int i = 0; i < weekLength; i ++){
						for(int j = 0; j < time; j ++){
							System.out.print(" " + week[i][j]);
						}
						System.out.println("");
					}

					System.out.println("");
				}
				overlap = false;
				for(int i = 0; i < 5; i ++){
					for(int j = 0; j < 148; j ++){
						week[i][j] = 0;
					}
				}
			}
		}
		}
		scanner.close();
	}
}
