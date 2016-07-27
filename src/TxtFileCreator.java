import java.io.*;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;


public class TxtFileCreator{

	FileWriter writer;
	int counter = 0;
	boolean blank = true;
	String CourseName;
	int CourseRegistrationNumber,
	 MonStart1,  MonFinish1,
	 MonStart2,  MonFinish2,
	 TuesStart1, TuesFinish1,
	 TuesStart2, TuesFinish2,
	 WedStart1, WedFinish1,
	 WedStart2, WedFinish2,
	 ThurStart1, ThurFinish1,
	 ThurStart2, ThurFinish2,
	 FriStart1, FriFinish1,
	 FriStart2, FriFinish2;

	TxtFileCreator()throws java.io.IOException{
		writer = new FileWriter("TxtFile.txt");
	}

	void printClass()throws java.io.IOException{
		if(blank == true){
			for(int i = 0; i < 10; i ++){
				writer.write("abc 0 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1");
			}
		}else{
			writer.write("something");
			counter += 1;
		}
	}
	void setCourseName(String courseName){
		CourseName = courseName;
		
	}

}
