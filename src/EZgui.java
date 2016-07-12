import java.awt.Color;


public class EZgui {
	static int x;
	static int y;
	
	
	EZgui(){
		EZ.initialize();
		y = EZ.getWindowHeight();
		x = EZ.getWindowWidth();

		EZweekSchedule[] boxes = new EZweekSchedule[7];
		for(int i = 0; i < 7; i ++){
			boxes[i] = new EZweekSchedule(200 * i + 200, 500);
		}
		
		
	}
	
	void fillTimeSlot(int x, int y){
		EZ.addRectangle(x, y, 195, 6, Color.yellow, true);
	}

}
