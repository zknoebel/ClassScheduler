import java.awt.Color;

public class EZweekSchedule {

	EZweekSchedule(int x, int y){
	EZ.addRectangle(x, y, 200, 950, Color.black, true);
	EZ.addRectangle(x, y, 195, 945, Color.cyan, true);
	EZ.addLine(0, 75, 1400, 75, Color.black, 5);
	EZ.addText(100, 55, "Sunday", Color.black);
	EZ.addText(300, 55, "Monday", Color.black);
	EZ.addText(500, 55, "Tuesday", Color.black);
	EZ.addText(700, 55, "Wednesday", Color.black);
	EZ.addText(900, 55, "Thursday", Color.black);
	EZ.addText(1100, 55, "Friday", Color.black);
	EZ.addText(1300, 55, "Saturday", Color.black);
	}
	
}
