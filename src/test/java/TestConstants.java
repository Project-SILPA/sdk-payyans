import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.LargeTest;
import android.test.suitebuilder.annotation.MediumTest;
import android.test.suitebuilder.annotation.SmallTest;

import com.smc.silpamodules.payyans.Constants;

/**
 * Created by sujith on 20/5/14.
 */
public class TestConstants extends AndroidTestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @SmallTest
    @MediumTest
    @LargeTest
    public void testDirectionConstants() {
        assertEquals(0, Constants.ASCII_TO_UNICODE);
        assertEquals(1, Constants.UNICODE_TO_ASCII);
    }

    @SmallTest
    @MediumTest
    @LargeTest
    public void testFontMapConstants() {
        assertEquals(0, Constants.FONT_MAP_AMBILI);
        assertEquals(1, Constants.FONT_MAP_CHARAKA);
        assertEquals(2, Constants.FONT_MAP_HARITHA);
        assertEquals(3, Constants.FONT_MAP_INDULEKHA);
        assertEquals(4, Constants.FONT_MAP_KARTHIKA);
        assertEquals(5, Constants.FONT_MAP_MANORAMA);
        assertEquals(6, Constants.FONT_MAP_MATWEB);
        assertEquals(7, Constants.FONT_MAP_NANDINI);
        assertEquals(8, Constants.FONT_MAP_PANCHARI);
        assertEquals(9, Constants.FONT_MAP_REVATHI);
        assertEquals(10, Constants.FONT_MAP_TEMPLATE);
        assertEquals(11, Constants.FONT_MAP_UMA);
        assertEquals(12, Constants.FONT_MAP_VALLUVAR);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
