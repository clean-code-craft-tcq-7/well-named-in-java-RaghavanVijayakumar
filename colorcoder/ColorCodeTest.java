package colorcoder;

public class ColorCodeTest {

	static void testColorToCode(int expectedColorCode, MajorColor major, MinorColor minor) {
		int colorCode = ColorCode.GetColorCodeFromColor(major, minor);
		assert (colorCode == expectedColorCode);
	}
}
