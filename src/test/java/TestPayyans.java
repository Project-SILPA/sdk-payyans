import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.LargeTest;
import android.test.suitebuilder.annotation.MediumTest;
import android.test.suitebuilder.annotation.SmallTest;

import com.smc.silpamodules.payyans.Constants;
import com.smc.silpamodules.payyans.Payyans;

import java.io.UnsupportedEncodingException;

/**
 * Created by sujith on 20/5/14.
 */
public class TestPayyans extends AndroidTestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @SmallTest
    @MediumTest
    @LargeTest
    public void testConstructor() {
        Payyans obj;

        obj = new Payyans(getContext());
        assertNotNull(obj);


        obj = new Payyans(getContext(), Constants.FONT_MAP_AMBILI);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_CHARAKA);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_HARITHA);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_INDULEKHA);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_KARTHIKA);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_MANORAMA);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_MATWEB);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_NANDINI);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_PANCHARI);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_REVATHI);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_TEMPLATE);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_UMA);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_VALLUVAR);
        assertNotNull(obj);


        obj = new Payyans(getContext(), Constants.FONT_MAP_AMBILI, Constants.ASCII_TO_UNICODE);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_CHARAKA, Constants.ASCII_TO_UNICODE);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_HARITHA, Constants.ASCII_TO_UNICODE);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_INDULEKHA, Constants.ASCII_TO_UNICODE);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_KARTHIKA, Constants.ASCII_TO_UNICODE);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_MANORAMA, Constants.ASCII_TO_UNICODE);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_MATWEB, Constants.ASCII_TO_UNICODE);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_NANDINI, Constants.ASCII_TO_UNICODE);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_PANCHARI, Constants.ASCII_TO_UNICODE);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_REVATHI, Constants.ASCII_TO_UNICODE);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_TEMPLATE, Constants.ASCII_TO_UNICODE);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_UMA, Constants.ASCII_TO_UNICODE);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_VALLUVAR, Constants.ASCII_TO_UNICODE);
        assertNotNull(obj);

        obj = new Payyans(getContext(), Constants.FONT_MAP_AMBILI, Constants.UNICODE_TO_ASCII);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_CHARAKA, Constants.UNICODE_TO_ASCII);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_HARITHA, Constants.UNICODE_TO_ASCII);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_INDULEKHA, Constants.UNICODE_TO_ASCII);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_KARTHIKA, Constants.UNICODE_TO_ASCII);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_MANORAMA, Constants.UNICODE_TO_ASCII);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_MATWEB, Constants.UNICODE_TO_ASCII);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_NANDINI, Constants.UNICODE_TO_ASCII);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_PANCHARI, Constants.UNICODE_TO_ASCII);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_REVATHI, Constants.UNICODE_TO_ASCII);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_TEMPLATE, Constants.UNICODE_TO_ASCII);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_UMA, Constants.UNICODE_TO_ASCII);
        assertNotNull(obj);
        obj = new Payyans(getContext(), Constants.FONT_MAP_VALLUVAR, Constants.UNICODE_TO_ASCII);
        assertNotNull(obj);
    }

    @SmallTest
    @MediumTest
    @LargeTest
    public void testIsPrebase() throws UnsupportedEncodingException {
        Payyans obj = new Payyans(getContext());
        assertNotNull(obj);
        assertEquals(true, obj.isPrebase("േ"));
        assertEquals(true, obj.isPrebase("ൈ"));
        assertEquals(true, obj.isPrebase("ൊ"));
        assertEquals(true, obj.isPrebase("ോ"));
        assertEquals(true, obj.isPrebase("ൌ"));
        assertEquals(true, obj.isPrebase("്ര"));
        assertEquals(true, obj.isPrebase("െ"));
        assertEquals(false, obj.isPrebase("ഇ"));
    }

    @SmallTest
    @MediumTest
    @LargeTest
    public void testIsPostbase() throws UnsupportedEncodingException {
        Payyans obj = new Payyans(getContext());
        assertNotNull(obj);

        assertEquals(true, obj.isPostbase("്യ"));
        assertEquals(true, obj.isPostbase("്വ"));
        assertEquals(false, obj.isPostbase("ഇ"));
    }

    @SmallTest
    @MediumTest
    @LargeTest
    public void testGetModuleName() {
        Payyans obj = new Payyans(getContext());
        assertNotNull(obj);
        assertEquals(Constants.PAYYANS_MODULE_NAME, obj.getModuleName());
    }

    @SmallTest
    @MediumTest
    @LargeTest
    public void testGetModuleInformation() {
        Payyans obj = new Payyans(getContext());
        assertNotNull(obj);
        assertEquals(Constants.PAYYANS_MODULE_INFORMATION, obj.getModuleInformation());
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
