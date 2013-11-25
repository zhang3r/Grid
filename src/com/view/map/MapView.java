package com.view.map;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class MapView extends View {
	private Paint mTextPaint;
	private int mTextColor;
	private float mTextHeight;

	public MapView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	@SuppressWarnings("unused")
	private void init(){
		mTextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		mTextPaint.setColor(mTextColor);
		   if (mTextHeight == 0) {
		       mTextHeight = mTextPaint.getTextSize();
		   } else {
		       mTextPaint.setTextSize(mTextHeight);
		   }
	}
	//What to draw = canvas
	//how to draw = paint
	@Override
	protected void onDraw(Canvas canvas){
		//TODO: draw objects on canvas
		canvas.drawBitmap(null, null, null);
	}

}
