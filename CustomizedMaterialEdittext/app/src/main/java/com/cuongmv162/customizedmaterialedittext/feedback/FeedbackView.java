package com.cuongmv162.customizedmaterialedittext.feedback;

/**
 * Created by cuongmv162 on 1/28/2017.
 */

public interface FeedbackView {
    void showProgress();

    void hideProgress();

    void setNameError();

    void setEmailError();

    void setContentError();

    void onFeedbackSuccess();

    void onFeedbackFailed();
}
