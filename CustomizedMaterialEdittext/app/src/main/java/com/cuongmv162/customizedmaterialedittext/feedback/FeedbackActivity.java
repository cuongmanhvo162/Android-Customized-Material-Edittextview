package com.cuongmv162.customizedmaterialedittext.feedback;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

import com.cuongmv162.customizedmaterialedittext.R;
import com.cuongmv162.customizedmaterialedittext.view.component.FeedbackComponentView;

/**
 * Created by cuongmv162 on 1/28/2017.
 */

public class FeedbackActivity extends AppCompatActivity implements FeedbackView {
    private ProgressBar mProgressBar;
    private FeedbackComponentView mFeedbackComponentView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        mProgressBar = (ProgressBar) findViewById(R.id.progress_bar);
        mFeedbackComponentView = (FeedbackComponentView) findViewById(R.id.feedback_component_view);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void setNameError() {

    }

    @Override
    public void setEmailError() {

    }

    @Override
    public void setContentError() {

    }

    @Override
    public void onFeedbackSuccess() {

    }

    @Override
    public void onFeedbackFailed() {

    }
}
