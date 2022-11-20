package colorcoder;

public class TestNumberPairConversion {
    final static String MajorColorNames[] = {
        "White", "Red", "Black", "Yellow", "Violet"
    };
    final static int numberOfMajorColors = MajorColorNames.length;
    final static String MinorColorNames[] = {
        "Blue", "Orange", "Green", "Brown", "Slate"
    };
    final static int numberOfMinorColors = MinorColorNames.length;
    static void testNumberToPair(int pairNumber,
        MajorColor expectedMajor,
        MinorColor expectedMinor)
    {
        ColorPair colorPair = GetColorFromPairNumber(pairNumber);
        System.out.println("Got pair " + colorPair.ToString());
        assert(colorPair.getMajor() == expectedMajor);
        assert(colorPair.getMinor() == expectedMinor);
    }

    static void testPairToNumber(
        MajorColor major,
        MinorColor minor,
        int expectedPairNumber)
    {
        int pairNumber = GetPairNumberFromColor(major, minor);
        System.out.println("Got pair number " + pairNumber);
        assert(pairNumber == expectedPairNumber);
    }

    public static void main(String[] args) {
        testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
    
        testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
    }
}
