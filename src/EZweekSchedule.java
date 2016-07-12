import java.awt.Color;

public class EZweekSchedule {

	EZweekSchedule(int x, int y){
		EZ.addRectangle(x, y, EZgui.x/8, (int)(EZgui.y * .95), Color.black, true);
		EZ.addRectangle(x, y, (int)(EZgui.x/8 * .975), (int)(EZgui.y * .931), Color.cyan, true);
		if(x == 15 * EZgui.x / 16){
		EZ.addLine(EZgui.x/8, (int)(EZgui.y * 75 / 1000), EZgui.x, (int)(EZgui.y * 75 / 1000), Color.black, (int)(EZgui.y * 5 / 1000));
		EZ.addText(EZgui.x/16 * 3, (int)(EZgui.y * 50/ 1000), "Sunday", Color.black, 20);
		EZ.addText(EZgui.x/16 * 5, (int)(EZgui.y * 50/ 1000), "Monday", Color.black, 20);
		EZ.addText(EZgui.x/16 * 7, (int)(EZgui.y * 50/ 1000), "Tuesday", Color.black, 20);
		EZ.addText(EZgui.x/16 * 9, (int)(EZgui.y * 50/ 1000), "Wednesday", Color.black, 20);
		EZ.addText(EZgui.x/16 * 11, (int)(EZgui.y * 50/ 1000), "Thursday", Color.black, 20);
		EZ.addText(EZgui.x/16 * 13, (int)(EZgui.y * 50/ 1000), "Friday", Color.black, 20);
		EZ.addText(EZgui.x/16 * 15, (int)(EZgui.y * 50/ 1000), "Saturday", Color.black, 20);
			for (int i = 0; i < 24; i ++){
				EZ.addText(EZgui.x/16, i * (int)(((EZgui.y * .931)/2 + y - (EZgui.y * 75 / 1000))/24) + (int)(EZgui.y * 75 / 1000),
						i + ":00", Color.black, 18);
				EZ.addLine(EZgui.x/8, i * (int)(((EZgui.y * .931)/2 + y - (EZgui.y * 75 / 1000))/24) + (int)(EZgui.y * 75 / 1000),
						EZgui.x, i * (int)(((EZgui.y * .931)/2 + y - (EZgui.y * 75 / 1000))/24) + (int)(EZgui.y * 75 / 1000), Color.black, 2);
			}
		}
	}
}
