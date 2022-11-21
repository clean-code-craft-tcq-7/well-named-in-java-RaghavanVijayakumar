package colorcoder;

public class ColorCode {
	static int GetColorCodeFromColor(MajorColor major, MinorColor minor) {
		int Colorcode = 0;
		Colorcode = major.getIndex() * 1 + minor.getIndex() + 1;
		switch (major.getIndex()) {
		case 1:
			Colorcode = Colorcode + 4;
			break;
		case 2:
			Colorcode = Colorcode + 8;
			break;
		case 3:
			Colorcode = Colorcode + 12;
			break;
		case 4:
			Colorcode = Colorcode + 16;
			break;
		}
		return Colorcode;
	}
}
