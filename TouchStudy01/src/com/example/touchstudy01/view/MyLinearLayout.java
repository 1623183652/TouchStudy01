package com.example.touchstudy01.view;

import com.example.touchstudy01.util.DebugTool;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class MyLinearLayout extends LinearLayout {
	public MyLinearLayout(Context context) {
		this(context, null);
	}

	public MyLinearLayout(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public MyLinearLayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		DebugTool.syso(DebugTool.MyLinearLayout, DebugTool.dispatchTouchEvent);
		switch (ev.getAction()) {
		case MotionEvent.ACTION_DOWN:
			DebugTool.syso(DebugTool.MyLinearLayout, DebugTool.ACTION_DOWN);
			break;
		case MotionEvent.ACTION_MOVE:
			DebugTool.syso(DebugTool.MyLinearLayout, DebugTool.ACTION_MOVE);
			break;
		case MotionEvent.ACTION_UP:
			DebugTool.syso(DebugTool.MyLinearLayout, DebugTool.ACTION_UP);
			break;
		default:
			break;
		}
		DebugTool.syso(DebugTool.MyLinearLayout, DebugTool.dispatchTouchEvent
				+ "$$$$ default return====" + super.dispatchTouchEvent(ev));
		return super.dispatchTouchEvent(ev);
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		DebugTool.syso(DebugTool.MyLinearLayout,
				DebugTool.onInterceptTouchEvent);
		switch (ev.getAction()) {
		case MotionEvent.ACTION_DOWN:
			DebugTool.syso(DebugTool.MyLinearLayout, DebugTool.ACTION_DOWN);
			break;
		case MotionEvent.ACTION_MOVE:
			DebugTool.syso(DebugTool.MyLinearLayout, DebugTool.ACTION_MOVE);
			break;
		case MotionEvent.ACTION_UP:
			DebugTool.syso(DebugTool.MyLinearLayout, DebugTool.ACTION_UP);
			break;
		default:
			break;
		}
		DebugTool.syso(DebugTool.MyLinearLayout,
				DebugTool.onInterceptTouchEvent + "$$$$ default return===="
						+ super.onInterceptTouchEvent(ev));
		// return true;
		return super.onInterceptTouchEvent(ev);
	}

	@Override
	public boolean onTouchEvent(MotionEvent ev) {
		DebugTool.syso(DebugTool.MyLinearLayout, DebugTool.onTouchEvent);
		switch (ev.getAction()) {
		case MotionEvent.ACTION_DOWN:
			DebugTool.syso(DebugTool.MyLinearLayout, DebugTool.ACTION_DOWN);
//			return true;
			 break;
		case MotionEvent.ACTION_MOVE:
			DebugTool.syso(DebugTool.MyLinearLayout, DebugTool.ACTION_MOVE);
			break;
		case MotionEvent.ACTION_UP:
			DebugTool.syso(DebugTool.MyLinearLayout, DebugTool.ACTION_UP);
			break;
		default:
			break;
		}
		return true;
//		return super.onTouchEvent(ev);
	}

}
