package sss.am71113363.turnoffscreen;

import android.content.*;
import android.app.admin.*;
import android.widget.*;

public class TurnOffScreen extends DeviceAdminReceiver
{

	@Override
	public void onEnabled(Context context, Intent intent)
	{
		Toast.makeText(context,"Admin Enabled",1).show();
		super.onDisabled(context, intent);
	}

	@Override
	public void onDisabled(Context context, Intent intent)
	{
		Toast.makeText(context,"Admin Disabled",1).show();
		super.onDisabled(context, intent);
	}
   

}			
