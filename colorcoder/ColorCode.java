package colorcoder;

public class ColorCode {
	static int GetColorCodeFromColor(MajorColor major, MinorColor minor) {
		int Colorcode = 0;
		int MinorColorIndexCount = ColorConstants.numberOfMinorColors - 1;
		Colorcode = major.getIndex() * 1 + minor.getIndex() + 1;
		switch (major.getIndex()) {
		case 1:
			Colorcode = Colorcode + MinorColorIndexCount;
			break;
		case 2:
			Colorcode = Colorcode + MinorColorIndexCount * 2;
			break;
		case 3:
			Colorcode = Colorcode + MinorColorIndexCount * 3;
			break;
		case 4:
			Colorcode = Colorcode + MinorColorIndexCount * 4;
			break;
		}
		return Colorcode;
	}
}
