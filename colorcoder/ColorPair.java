package colorcoder;

public class ColorPair {
	private MajorColor majorColor;
	private MinorColor minorColor;

	public ColorPair(MajorColor major, MinorColor minor) {
		majorColor = major;
		minorColor = minor;
	}

	public MajorColor getMajor() {
		return majorColor;
	}

	public MinorColor getMinor() {
		return minorColor;
	}

	String ToString() {
		String colorPairStr = ColorConstants.MajorColorNames[majorColor.getIndex()];
		colorPairStr += " ";
		colorPairStr += ColorConstants.MinorColorNames[minorColor.getIndex()];
		return colorPairStr;
	}

	static ColorPair GetColorFromPairNumber(int pairNumber) {
		int zeroBasedPairNumber = pairNumber - 1;
		MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / ColorConstants.numberOfMinorColors);
		MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % ColorConstants.numberOfMinorColors);
		return new ColorPair(majorColor, minorColor);
	}

	static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
		return major.getIndex() * ColorConstants.numberOfMinorColors + minor.getIndex() + 1;
	}
}
