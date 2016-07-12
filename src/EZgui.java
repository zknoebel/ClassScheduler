import java.awt.Color;


public class EZgui {
	
	EZgui(){
		EZ.initialize(1500, 1000);

		EZweekSchedule[] boxes = new EZweekSchedule[7];
		for(int i = 0; i < 7; i ++){
			boxes[i] = new EZweekSchedule(200 * i + 200, 500);
		}
		
		
	}
	
	void fillTimeSlot(int x, int y){
		EZ.addRectangle(x, y, 195, 6, Color.yellow, true);
	}

}
