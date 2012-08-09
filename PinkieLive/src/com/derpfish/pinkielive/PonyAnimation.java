package com.derpfish.pinkielive;

import android.graphics.Canvas;

public interface PonyAnimation
{
	public void initialize(int surfaceWidth, int surfaceHeight, float tapX, float tapY);
	
	public void drawAnimation(Canvas canvas, long elapsedTime);
	
	public boolean isComplete();
	
	public void onDestroy();

}