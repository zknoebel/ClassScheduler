
public class ClassOption {
	private String cn;
	private int ms1, me1, ts1, te1, ws1, we1, rs1, re1, fs1, fe1, ms2, me2, ts2, te2, ws2, we2, rs2, re2, fs2, fe2;
	private int weekLength = 5;
	private int time = 148;
	int[][] weeklyTimes = new int[5][148];

	ClassOption(String className, int monStart1, int monEnd1,
			int tuesStart1, int tuesEnd1, 
			int wedStart1, int wedEnd1,
			int thursStart1, int thursEnd1,
			int friStart1, int friEnd1,
			int monStart2, int monEnd2,
			int tuesStart2, int tuesEnd2, 
			int wedStart2, int wedEnd2,
			int thursStart2, int thursEnd2,
			int friStart2, int friEnd2){
		ms1 = monStart1;
		me1 = monEnd1;
		ts1 = tuesStart1;
		te1 = tuesEnd1;
		ws1 = wedStart1;
		we1 = wedEnd1;
		rs1 = thursStart1;
		re1 = thursEnd1;
		fs1 = friStart1;
		fe1 = friEnd1;
		ms1 = monStart2;
		me1 = monEnd2;
		ts1 = tuesStart2;
		te1 = tuesEnd2;
		ws1 = wedStart2;
		we1 = wedEnd2;
		rs1 = thursStart2;
		re1 = thursEnd2;
		fs1 = friStart2;
		fe1 = friEnd2;
		cn = className;
		//creates matrix down and over style
		for(int i = 0; i < weekLength; i ++){
			for(int j = 0; j < time; j ++){
				weeklyTimes[i][j] = 0;
			}
		}

		for(int i = 0; i < weekLength; i ++){
			for(int j = 0; j < time; j ++){
				switch(i){
				case 0:
					if(j >= ms1 && j <= me1){
						weeklyTimes[i][j] = 1;
					}
					if(j >= ms2 && j <= me2){
						weeklyTimes[i][j] = 1;
					}

					break;
				case 1:
					if(j >= ts1 && j <= te1){
						weeklyTimes[i][j] = 1;
					}
					if(j >= ts2 && j <= te2){
						weeklyTimes[i][j] = 1;
					}
					break;
				case 2:
					if(j >= ws1 && j <= we1){
						weeklyTimes[i][j] = 1;
					}
					if(j >= ws2 && j <= we2){
						weeklyTimes[i][j] = 1;
					}
					break;
				case 3:
					if(j >= rs1 && j <= re1){
						weeklyTimes[i][j] = 1;
					}
					if(j >= rs2 && j <= re2){
						weeklyTimes[i][j] = 1;
					}
					break;
				case 4:
					if(j >= fs1 && j <= fe1){
						weeklyTimes[i][j] = 1;
					}
					if(j >= fs2 && j <= fe2){
						weeklyTimes[i][j] = 1;
					}
					break;
				}
			}
		}

	}

	void print(){
		for(int i = 0; i < weekLength; i ++){
			for(int j = 0; j < time; j ++){
				System.out.print(" " + weeklyTimes[i][j]);
			}
			System.out.println("");
		}
	}
	void printName(){
		System.out.println(cn);
	}
	int list(int row, int column){
		return weeklyTimes[row][column];
	}
}
