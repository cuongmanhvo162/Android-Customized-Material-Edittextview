package com.cuongmv162.customizedmaterialedittext.feedback;

/**
 * Created by cuongmv162 on 1/28/2017.
 */

public class FeedbackPresenterImpl implements FeedbackPresenter, FeedbackModel.OnSendFeedbackListener {

    private FeedbackView mFeedbackView;
    private FeedbackModel mFeedbackModel;

    public FeedbackPresenterImpl(FeedbackView feedbackView) {
        this.mFeedbackView = feedbackView;
        this.mFeedbackModel = new FeedbackModelImpl();
    }

    @Override
    public void sendFeedback(String name, String email, String content) {
        if (mFeedbackView != null) {
            mFeedbackView.showProgress();
        }

        mFeedbackModel.sendFeedback(name, email, content, this);
    }

    @Override
    public void onDestroy() {
        mFeedbackView = null;
    }

    @Override
    public void onNameError() {
        if (mFeedbackView != null) {
            mFeedbackView.setNameError();
        }
    }

    @Override
    public void onEmailError() {
        if (mFeedbackView != null) {
            mFeedbackView.setEmailError();
        }
    }

    @Override
    public void onContentError() {
        if (mFeedbackView != null) {
            mFeedbackView.setContentError();
        }
    }
}
