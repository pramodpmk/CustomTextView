package com.wacmob.promode.todosalud.view.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;

import com.wacmob.promode.todosalud.R;

/**
 * Created by KP on 5/10/2018.
 */

public class CustomTextView extends android.support.v7.widget.AppCompatTextView {
    public CustomTextView(Context context) {
        super(context);
        applyCustomFont(context);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray values = context.obtainStyledAttributes(attrs, R.styleable.CustomTextView);
        String fontThickness = values.getString(R.styleable.CustomTextView_customFontThickness);
        if (fontThickness == null) fontThickness = "normal";
        values.recycle();
        switch(fontThickness){
            case "bold":
                setBold(context);
                break;

            case "thin":
                setThin(context);
                break;

                default:
                    applyCustomFont(context);
        }
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray values = context.obtainStyledAttributes(attrs, R.styleable.CustomTextView);
        String fontThickness = values.getString(R.styleable.CustomTextView_customFontThickness);
        if (fontThickness == null) fontThickness = "normal";
        values.recycle();
        switch(fontThickness){
            case "bold":
                setBold(context);
                break;

            case "thin":
                setThin(context);
                break;

            default:
                applyCustomFont(context);
        }
    }

    private void applyCustomFont(Context context) {
        Typeface face= Typeface.createFromAsset(context.getAssets(), "fonts/roboto-regular.ttf");
        this.setTypeface(face);
    }

    public void setBold(Context context) {
        Typeface face= Typeface.createFromAsset(context.getAssets(), "fonts/roboto-medium.ttf");
        this.setTypeface(face);
    }

    public void setThin(Context context) {
        Typeface face= Typeface.createFromAsset(context.getAssets(), "fonts/roboto-thin.ttf");
        this.setTypeface(face);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
