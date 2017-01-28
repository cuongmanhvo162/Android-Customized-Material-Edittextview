package com.cuongmv162.customizedmaterialedittext.view.component;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.cuongmv162.customizedmaterialedittext.R;
import com.cuongmv162.customizedmaterialedittext.view.customized.MyMaterialEdittext;

/**
 * Created by cuongmv162 on 1/28/2017.
 */

public class FeedbackComponentView extends LinearLayout {
    private Context mContext;

    private MyMaterialEdittext mName;
    private MyMaterialEdittext mEmail;
    private MyMaterialEdittext mContent;
    private Button mSubmit;

    public FeedbackComponentView(Context context) {
        super(context);
        init(context);
    }

    public FeedbackComponentView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public FeedbackComponentView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public FeedbackComponentView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void init(Context context) {
        this.mContext = context;
        View view = inflate(mContext, R.layout.component_view_feedback, this);
        mName = (MyMaterialEdittext) view.findViewById(R.id.name);
        mName.setPlaceholder("Name");

        mEmail = (MyMaterialEdittext) view.findViewById(R.id.email);
        mEmail.setPlaceholder("Email");

        mContent = (MyMaterialEdittext) view.findViewById(R.id.content);
        mContent.setPlaceholder("Content");
        mContent.setMutipleLine(true);
    }
}
