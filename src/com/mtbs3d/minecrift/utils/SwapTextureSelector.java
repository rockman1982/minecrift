package com.mtbs3d.minecrift.utils;

import java.util.ArrayList;

public class SwapTextureSelector {
	private int mFrameIndex=0;
	private ArrayList<Integer> mTextureIds;
	private int mNumTextures=1;
	public void setTextureIds(ArrayList<Integer> textureIds){
		mTextureIds = textureIds;
		mNumTextures=textureIds.size();//TODO_ handle if empty?
	}
	public void setIndex(int frameIndex) {
		mFrameIndex = frameIndex;		
	}
	/**
	 * Texture ID for the current frame to bind to the framebuffer.
	 */
	public int getCurrentTexId() {
		return mTextureIds.get(getCurrentSwapIdx());
	}
	/**
	 * To be passed to oculus SDK
	 */
	public int getCurrentSwapIdx(){
		return mFrameIndex%mNumTextures;//TODO_ handle if mNumTextures==0?
	}
}