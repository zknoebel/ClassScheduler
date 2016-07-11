import java.awt.Color;


public class EZgui {
	
	EZgui(){
		EZ.initialize(1400, 1000);

		EZweekSchedule[] boxes = new EZweekSchedule[7];
		for(int i = 0; i < 7; i ++){
			boxes[i] = new EZweekSchedule(100 * 2*i + 100, 500);
		}
		
		
	}
	
	void fillTimeSlot(int x, int y){
		EZ.addRectangle(x, y, 195, 945/144, Color.yellow, true);
	}

}
