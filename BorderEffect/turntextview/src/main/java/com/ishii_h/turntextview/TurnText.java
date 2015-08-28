package com.ishii_h.turntextview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;

/**
 * Created by ishii_h on 2015/08/28.
 */
public class TurnText extends TextView {
    private int duration = 2500;
    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f,2.0f);
    ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f,1.0f,0.0f,1.0f,0.5f,0.5f);
    RotateAnimation rotateAnimation = new RotateAnimation(0,360,0.5f,0.5f);
    AnimationSet animationSet = new AnimationSet(true);

    private void setAnimationSet(AnimationSet animationSet) {
        this.animationSet = animationSet;
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(rotateAnimation);
    }

    public TurnText(Context context) {
        super(context);
    }

    public TurnText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setDuration(int duration) {
        this.duration = duration;
        alphaAnimation.setDuration(duration);
        scaleAnimation.setDuration(duration);
        rotateAnimation.setDuration(duration);
    }

    public void start() {
        setAnimationSet(animationSet);
        this.startAnimation(animationSet);
    }
}
