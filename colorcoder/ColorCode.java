package colorcoder;

public class ColorCode {
	static int GetColorCodeFromColor(MajorColor major, MinorColor minor) {
		int Colorcode = 0;
		int MinorColorIndexCount = ColorConstants.numberOfMinorColors - 1;
		Colorcode = major.getIndex() * 1 + minor.getIndex() + 1;
		if (major.getIndex() >= 1) {
			Colorcode = Colorcode + MinorColorIndexCount * major.getIndex();
		}
		return Colorcode;
	}
}
