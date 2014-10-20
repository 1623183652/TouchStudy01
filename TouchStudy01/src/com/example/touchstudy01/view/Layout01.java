package com.example.touchstudy01.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/**
 * 自定义ViewGroup,实现LinearLayout
 * 
 * @author Tangxuebing
 * 
 */
public class Layout01 extends ViewGroup {
	private int pWidth;
	private int pHeight;

	public Layout01(Context context) {
		this(context, null);
	}

	public Layout01(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public Layout01(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		/**
		 * 获得此ViewGroup上级容器为其推荐的宽和高，以及计算模式
		 */
		int sizeWidth = MeasureSpec.getSize(widthMeasureSpec);
		int sizeHeight = MeasureSpec.getSize(heightMeasureSpec);
		int widthMode = MeasureSpec.getMode(widthMeasureSpec);
		int heightMode = MeasureSpec.getMode(heightMeasureSpec);

		measureChildren(widthMeasureSpec, heightMeasureSpec);
		caculate();
		if (widthMode == MeasureSpec.EXACTLY) {
			pWidth = sizeWidth;
		}
		if (heightMode == MeasureSpec.EXACTLY) {
			pHeight = sizeHeight;
		}

		setMeasuredDimension(pWidth, pHeight);
	}

	private void caculate() {
		for (int i = 0; i < getChildCount(); i++) {
			View childView = getChildAt(i);
			int width = childView.getMeasuredWidth();
			int height = childView.getMeasuredHeight();
			if (pWidth < width) {
				pWidth = width;
			}
			pHeight += height;
		}
	}
	
	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		// TODO Auto-generated method stub
		return super.dispatchTouchEvent(ev);
	}

	/**
	 * onLayout传下来的l,t,r,b分别是放置父控件的矩形可用空间（除去margin和padding的空间）的左上角的left、
	 * top以及右下角right、bottom值。
	 */
	@Override
	protected void onLayout(boolean changed, int l, int t, int r, int b) {
		int nextHeight = 0;
		for (int i = 0; i < getChildCount(); i++) {
			View childView = getChildAt(i);
			int width = childView.getMeasuredWidth();
			int height = childView.getMeasuredHeight();
			childView.layout(0, nextHeight, width, nextHeight + height);
			nextHeight += height;
		}
	}

}
