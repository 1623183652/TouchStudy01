package com.example.touchstudy01.view;

import com.example.touchstudy01.util.DebugTool;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;

public class MyButton extends Button {
	private int index = 1;
	public MyButton(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public MyButton(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		DebugTool.syso(DebugTool.MyButton, DebugTool.dispatchTouchEvent);
		switch (ev.getAction()) {
		case MotionEvent.ACTION_DOWN:
			DebugTool.syso(DebugTool.MyButton, DebugTool.ACTION_DOWN);
			break;
		case MotionEvent.ACTION_MOVE:
			DebugTool.syso(DebugTool.MyButton, DebugTool.ACTION_MOVE);
			break;
		case MotionEvent.ACTION_UP:
			DebugTool.syso(DebugTool.MyButton, DebugTool.ACTION_UP);
			break;
		default:
			break;
		}
		DebugTool.syso(DebugTool.MyButton, DebugTool.dispatchTouchEvent
				+ "$$$$ " + index++ +" default return====" + super.dispatchTouchEvent(ev));
		return super.dispatchTouchEvent(ev);
	}

	@Override
	public boolean onTouchEvent(MotionEvent ev) {
		DebugTool.syso(DebugTool.MyButton, DebugTool.onTouchEvent);
		switch (ev.getAction()) {
		case MotionEvent.ACTION_DOWN:
			DebugTool.syso(DebugTool.MyButton, DebugTool.ACTION_DOWN);
			break;
		case MotionEvent.ACTION_MOVE:
			DebugTool.syso(DebugTool.MyButton, DebugTool.ACTION_MOVE);
			break;
		case MotionEvent.ACTION_UP:
			DebugTool.syso(DebugTool.MyButton, DebugTool.ACTION_UP);
			break;
		default:
			break;
		}
		DebugTool.syso(DebugTool.MyButton, DebugTool.onTouchEvent
				+ "$$$$" + index++ +" default return====" + super.onTouchEvent(ev));
		return false;
//		 return super.onTouchEvent(ev);
	}
}
