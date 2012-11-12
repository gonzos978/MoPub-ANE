package com.sticksports.nativeExtensions.mopub;

import android.util.Log;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

public class MoPubBannerGetWidth implements FREFunction
{
	@Override
	public FREObject call( FREContext ctx, FREObject[] args )
	{
		try
		{
			MoPubBannerContext context = (MoPubBannerContext) ctx;
			int width = context.getBanner().getPlannedWidth();
			return FREObject.newObject( width );
		}
		catch ( Exception exception )
		{
			Log.w( "MoPub", exception );
		}
		return null;
	}

}
