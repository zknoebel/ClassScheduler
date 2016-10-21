import java.io.*;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class TxtFileCreator {

	FileWriter writer;
	int counter = 0;
	boolean blank = true;
	String CourseName;
	int CourseRegistrationNumber, MonStart1, MonFinish1, MonStart2, MonFinish2, TuesStart1, TuesFinish1, TuesStart2,
			TuesFinish2, WedStart1, WedFinish1, WedStart2, WedFinish2, ThurStart1, ThurFinish1, ThurStart2, ThurFinish2,
			FriStart1, FriFinish1, FriStart2, FriFinish2;

	TxtFileCreator() throws java.io.IOException {
		writer = new FileWriter("TxtFile.txt");
	}

	void printClass() throws java.io.IOException {
		if (blank == true) {
			for (int i = 0; i < 10; i++) {
				writer.write("abc 0 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1");
			}
		} else {
			writer.write("something");
			counter += 1;
		}
	}

	void setCourseName(String courseName) {
		CourseName = courseName;

	}

	void setCourseRegistrationNumber(int CRN) {
		CourseRegistrationNumber = CRN;
	}

	void setMonday1(int start, int finish) {
		MonStart1 = start;
		MonFinish1 = finish;
	}

	void setMonday2(int start, int finish) {
		MonStart2 = start;
		MonFinish2 = finish;
	}

	void setTuesday1(int start, int finish) {
		TuesStart1 = start;
		TuesFinish1 = finish;
	}

	void setTuesday2(int start, int finish) {
		TuesStart2 = start;
		TuesFinish2 = finish;
	}

	void setWednesday1(int start, int finish) {
		WedStart1 = start;
		WedFinish1 = finish;
	}

	void setWednesday2(int start, int finish) {
		WedStart2 = start;
		WedFinish2 = finish;
	}

	void setThursday1(int start, int finish) {
		ThurStart1 = start;
		ThurFinish1 = finish;
	}

	void setThursday2(int start, int finish) {
		ThurStart2 = start;
		ThurFinish2 = finish;
	}

	void setFriday1(int start, int finish) {
		FriStart1 = start;
		FriFinish1 = finish;
	}

	void setFriday2(int start, int finish) {
		FriStart2 = start;
		FriFinish2 = finish;
	}

	void closeTxtFileCreator() throws java.io.IOException {
		writer.close();
	}

}
