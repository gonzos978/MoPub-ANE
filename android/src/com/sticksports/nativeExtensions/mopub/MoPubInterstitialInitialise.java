package com.sticksports.nativeExtensions.mopub;

import android.util.Log;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

public class MoPubInterstitialInitialise implements FREFunction
{
	@Override
	public FREObject call( FREContext ctx, FREObject[] args )
	{
		if( ResourceFinder.context == null )
		{
			ResourceFinder.context = ctx.getActivity();
		}

		try
		{
			MoPubInterstitialContext context = (MoPubInterstitialContext) ctx;
			String adUnitId = args[0].getAsString();
			context.createInterstitial( adUnitId );
		}
		catch ( Exception exception )
		{
			Log.w( "MoPub", exception );
		}
		return null;
	}

}
