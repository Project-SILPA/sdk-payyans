package org.silpa.payyans;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by sujith on 10/6/14.
 */
public class PayyansEditText extends EditText {

    /**
     * Context of application
     */
    private Context mContext;

    /**
     * Payyans object to perform conversion in background
     */
    private Payyans payyans;

    /**
     * Specified font map from layout
     */
    private int mFontMap;

    /**
     * Specified direction of conversion from layout
     */
    private int mDirection;

    /**
     * Specified output field from layout
     */
    private int mOutputResourceId;

    /**
     * View specified from layout to output results
     */
    private View mOutputView;

    // Log tag
    private static final String LOG_TAG = "PayyansEditText";


    /**
     * Constructor
     *
     * @param context context of application
     */
    public PayyansEditText(Context context) {
        super(context);
        init(null, 0);
        initView();
    }

    /**
     * Constructor
     *
     * @param context context of application
     * @param attrs   attribute set
     */
    public PayyansEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
        initView();
    }

    /**
     * Constructor
     *
     * @param context  context of application
     * @param attrs    attribute set
     * @param defStyle default style
     */
    public PayyansEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
        initView();
    }

    /**
     * Initialize data members
     *
     * @param attrs    attribute set
     * @param defStyle default style
     */
    private void init(AttributeSet attrs, int defStyle) {
        // Init attrs
        initAttrs(attrs, defStyle);
    }

    /**
     * Initialize attributes used
     *
     * @param attrs    attribute set
     * @param defStyle default style
     */
    private void initAttrs(AttributeSet attrs, int defStyle) {
        TypedArray a = getContext().getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.PayyansEditText,
                defStyle, defStyle
        );

        try {
            this.mContext = getContext();
            this.mFontMap = a.getInteger(R.styleable.PayyansEditText_fontMap,
                    Payyans.DEFAULT_FONT_MAP);
            this.mDirection = a.getInteger(R.styleable.PayyansEditText_directionOfConversion,
                    Payyans.DEFAULT_DIRECTION);
            this.mOutputResourceId = a.getResourceId(R.styleable.PayyansEditText_outputField, -1);
            this.payyans = new Payyans(this.mContext, this.mFontMap, this.mDirection);
        } catch (Exception e) {
            Log.e(LOG_TAG, "Error : " + e.getMessage());
        } finally {
            a.recycle();
        }
    }

    /**
     * Initialize view
     */
    private void initView() {
        this.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                if (editable.toString().length() == 0) return;

                if (mOutputView == null) {
                    mOutputView = getRootView().findViewById(mOutputResourceId);
                }
                if (mOutputView != null) {
                    if (mOutputView instanceof EditText) {
                        ((EditText) mOutputView).setText(
                                payyans.getConvertText(editable.toString()));
                    } else if (mOutputView instanceof TextView) {
                        ((TextView) mOutputView).setText(
                                payyans.getConvertText(editable.toString()));
                    }
                }
            }
        });
    }

    /**
     * Explicitly set font map rules
     *
     * @param fontMap font map
     */
    public void setFontMap(int fontMap) {
        if (this.payyans != null) {
            this.mFontMap = fontMap;
            this.payyans.setFontMap(this.mFontMap);
        }
    }

    /**
     * Explicitly set direction of conversion
     *
     * @param direction direction
     */
    public void setDirection(int direction) {
        if (this.payyans != null) {
            this.mDirection = direction;
            this.payyans.setDirection(direction);
        }
    }

    /**
     * Explicitly set output field
     *
     * @param resourceId resource id of output field
     */
    public void setOutputField(int resourceId) {
        this.mOutputResourceId = resourceId;
    }
}
