package com.cuongmv162.customizedmaterialedittext.view.customized;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.text.InputType;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cuongmv162.customizedmaterialedittext.R;
import com.cuongmv162.customizedmaterialedittext.view.FontUtil;

/**
 * Created by cuongmv162 on 1/26/2017.
 */

public class MyMaterialEdittext extends RelativeLayout {
    private boolean mIsTopMessageStacked = false;
    private boolean mIsBottomMessaheHasContent = false;

    private Context mContext;
    private EditText mEditText;
    private TextView mTopMessage;
    private TextView mBottomMessage;
    private View mBottomLine;

    public MyMaterialEdittext(Context context) {
        super(context);
        init(context);
    }

    public MyMaterialEdittext(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public MyMaterialEdittext(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyMaterialEdittext(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);

    }

    private void init(Context context) {
        this.mContext = context;
        View view = inflate(mContext, R.layout.view_material_edittext, this);

        mEditText = (EditText) view.findViewById(R.id.my_edittext);
        mEditText.setTypeface(FontUtil.getTypeface(mContext, FontUtil.NOTO_SANS_REGULAR));
        mEditText.setOnFocusChangeListener(new OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    if (!mIsTopMessageStacked) {
                        displayTopMessage(true);

                        if (mIsBottomMessaheHasContent) {
                            displayBottomLine(false);
                        } else {
                            displayBottomLine(true);
                        }
                    }
                } else {
                    if (!mIsTopMessageStacked) {
                        displayTopMessage(false);
                    }
                }
            }
        });

        mTopMessage = (TextView) view.findViewById(R.id.top_message);
        mTopMessage.setTypeface(FontUtil.getTypeface(mContext, FontUtil.NOTO_SANS_REGULAR));

        mBottomMessage = (TextView) view.findViewById(R.id.bottom_Message);
        mBottomMessage.setTypeface(FontUtil.getTypeface(mContext, FontUtil.NOTO_SANS_REGULAR));

        mBottomLine = (View) view.findViewById(R.id.bottom_line);
    }

    public EditText getEdittext() {
        return this.mEditText;
    }

    public void setPlaceholder(String placeHolder) {
        this.mEditText.setHint(placeHolder);
        this.mTopMessage.setText(placeHolder);
    }

    public void setPlaceholder(int placeholder) {
        this.mEditText.setHint(placeholder);
        this.mTopMessage.setText(placeholder);
    }

    public void setTopMessage(String topMessage) {
        this.mTopMessage.setText(topMessage);
    }

    public void setTopMessage(int topMessage) {
        this.mTopMessage.setText(topMessage);
    }

    public void setBottomMessage(String bottomMessage) {
        this.mBottomMessage.setText(bottomMessage);
        this.mIsBottomMessaheHasContent = true;
    }

    public void setBottomMessage(int bottomMessage) {
        this.mBottomMessage.setText(bottomMessage);
        this.mIsBottomMessaheHasContent = true;
    }

    public void setTopMessageStacked(boolean stacked) {
        this.mIsTopMessageStacked = stacked;

        if (stacked) {
            displayTopMessage(true);
        } else {
            displayTopMessage(false);
        }
    }

    public void setInputAsPhone(boolean asPhoneNumber) {
        if (asPhoneNumber) {
            mEditText.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_CLASS_PHONE);
        }
    }

    public void setMutipleLine(boolean multipleLine) {
        if (multipleLine) {
            mEditText.setSingleLine(false);
        } else {
            mEditText.setSingleLine(true);
        }
    }

    private void displayTopMessage(boolean display) {
        if (display) {
            mTopMessage.setVisibility(View.VISIBLE);
        } else {
            mTopMessage.setVisibility(View.GONE);
        }
    }

    private void displayBottomLine(boolean dispaly) {
        if (dispaly) {
            mBottomLine.setVisibility(View.VISIBLE);
        } else {
            mBottomLine.setVisibility(View.GONE);
        }
    }

}
