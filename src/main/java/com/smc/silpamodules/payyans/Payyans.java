package com.smc.silpamodules.payyans;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sujith on 20/5/14.
 */
public class Payyans {

    private static final String LOG_TAG = "Payyans";
    private static final int DEFAULT_FONT_MAP = Constants.FONT_MAP_AMBILI;
    private static final int DEFAULT_DIRECTION = Constants.ASCII_TO_UNICODE;

    private Context mContext;
    private int mDirection;
    private int mFontMap;
    private String mMappingFileName;
    private Map<String, String> mRulesDict;


    public Payyans(Context context) {
        this(context, DEFAULT_FONT_MAP, DEFAULT_DIRECTION);
    }

    public Payyans(Context context, int fontMap) {
        this(context, fontMap, DEFAULT_DIRECTION);
    }

    public Payyans(Context context, int fontMap, int direction) {
        this.mDirection = direction;
        this.mContext = context;
        this.mFontMap = fontMap;
        this.mMappingFileName = Constants.FONT_MAPS[this.mFontMap];
        this.mRulesDict = new HashMap<String, String>();
        init();
    }

    private void init() {
        loadRules();
    }

    private void loadRules() {

        String line;
        BufferedReader br;
        int lineNumber = 0;

        try {
            br = new BufferedReader(new InputStreamReader(this.mContext.getResources().
                    getAssets().open(mMappingFileName)));

            while (true) {
                try {
                    line = new String((br.readLine().getBytes("UTF-8")), "UTF-8");
                    line = line.trim();
                    lineNumber = lineNumber + 1;
                } catch (UnsupportedEncodingException e) {
                    Log.e(LOG_TAG, "Encoding of given argument not supported.");
                    br.close();
                    break;
                }

                // blank string - stop
                if (line.equals("")) {
                    break;
                }

                // comment - ignore
                if (line.startsWith("#")) {
                    // comment
                    continue;
                }

                if (!line.contains("=") || line.split("=").length != 2) {
                    Log.e(LOG_TAG, "Error: Syntax Error in the Ascii to Unicode Map " +
                            "in line number " + lineNumber);
                    // ignore error and continue;
                    continue;
                }

                String[] tokens = line.split("=");
                String lhs = tokens[0];
                String rhs = tokens[1];
                lhs = lhs.trim();
                rhs = rhs.trim();

                if (this.mDirection == Constants.ASCII_TO_UNICODE) {
                    this.mRulesDict.put(lhs, rhs);
                } else {
                    this.mRulesDict.put(rhs, lhs);
                }
            }
            br.close();
        } catch (IOException ioe) {
            Log.e(LOG_TAG, "Error : " + ioe.getMessage());
            return;
        }
    }

    private String ASCII2UNICODE(String text) {

    }

    private String Unicode2ASCII(String text) {

    }

    public String getConvertString(String text) {

        try {
            text = new String((text.getBytes("UTF-8")), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Log.e(LOG_TAG, "Encoding of given argument not supported. null returned");
            return null;
        }

        if (this.mDirection == Constants.ASCII_TO_UNICODE) {
            return ASCII2UNICODE(text);
        } else {
            return Unicode2ASCII(text);
        }
    }

    public String getModuleName() {
        return Constants.PAYYANS_MODULE_NAME;
    }

    public String getModuleInformation() {
        return Constants.PAYYANS_MODULE_INFORMATION;
    }
}
