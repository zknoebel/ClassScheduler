import java.io.*;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;


public class TxtFileCreator{

	FileWriter writer;
	int counter = 0;
	boolean blank = true;

	TxtFileCreator()throws java.io.IOException{
		writer = new FileWriter("TxtFile.txt");
	}

	void printClass(String CourseName, int CourseRegistrationNumber,
			int MonStart1, int MonFinish1,
			int MonStart2, int MonFinish2,
			int TuesStart1, int TuesFinish1,
			int TuesStart2, int TuesFinish2,
			int WedStart1, int WedFinish1,
			int WedStart2, int WedFinish2,
			int ThurStart1, int ThurFinish1,
			int ThurStart2, int ThurFinish2,
			int FriStart1, int FriFinish1,
			int FriStart2, int FriFinish2)throws java.io.IOException{
		if(blank == true){
			for(int i = 0; i < 10; i ++){
				writer.write("abc 0 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1");
			}
		}else{
			writer.write("something");
			counter += 1;
		}
	}

}
