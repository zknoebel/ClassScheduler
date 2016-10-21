import java.awt.Color;

public class EZgui {
	static int x;
	static int y;

	EZgui() {
		EZ.initialize();
		y = EZ.getWindowHeight();
		x = EZ.getWindowWidth();

		EZweekSchedule[] boxes = new EZweekSchedule[7];
		for (int i = 0; i < 7; i++) {
			boxes[i] = new EZweekSchedule(x / 8 * i + 3 * x / 16, y / 2);
		}

	}

	void fillTimeSlot(int inputX, int inputY) {
		EZ.addRectangle(inputX, inputY, (int) (x / 8 * .975), y / 144, Color.yellow, true);
	}

}
