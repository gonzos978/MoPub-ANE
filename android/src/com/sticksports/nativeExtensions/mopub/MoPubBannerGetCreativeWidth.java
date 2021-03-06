package com.sticksports.nativeExtensions.mopub;

import android.util.Log;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

public class MoPubBannerGetCreativeWidth implements FREFunction
{

	@Override
	public FREObject call( FREContext ctx, FREObject[] args )
	{
		try
		{
			MoPubBannerContext context = (MoPubBannerContext) ctx;
			// int width = (int) Math.ceil( context.getBanner().getAdWidth() * ctx.getActivity().getResources().getDisplayMetrics().density );
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
