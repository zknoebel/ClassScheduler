import java.awt.Color;

public class EZweekSchedule {

	EZweekSchedule(int x, int y){
		EZ.addRectangle(x, y, 200, 950, Color.black, true);
		EZ.addRectangle(x, y, 195, 945, Color.cyan, true);
		if(x == 1400){
		EZ.addLine(100, 75, 1500, 75, Color.black, 5);
		EZ.addText(200, 55, "Sunday", Color.black, 20);
		EZ.addText(400, 55, "Monday", Color.black, 20);
		EZ.addText(600, 55, "Tuesday", Color.black, 20);
		EZ.addText(800, 55, "Wednesday", Color.black, 20);
		EZ.addText(1000, 55, "Thursday", Color.black, 20);
		EZ.addText(1200, 55, "Friday", Color.black, 20);
		EZ.addText(1400, 55, "Saturday", Color.black, 20);
			for (int i = 0; i < 24; i ++){
				EZ.addText(50, i * 900/24 + 75, i + ":00", Color.black, 18);
				EZ.addLine(100, i * 900/24 + 75, 1500, i * 900/24 + 75, Color.black, 2);
			}
		}
	}
}
