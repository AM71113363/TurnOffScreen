package sss.am71113363.turnoffscreen;

import android.app.*;
import android.content.*;
import android.os.*;
import android.app.admin.*;

public class MainActivity extends Activity
{
	final String description="Add this App as Admin to Turn Screen Off 😊\r\n"+
	                         "Or UnInstall it 😱\r\n"+
	                         "Location of Source Code:"+
							 "\r\nhttps://github.com/AM71113363/TurnOffScreen";
	 
							 
	
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
		DevicePolicyManager devMng=(DevicePolicyManager)getSystemService(Context.DEVICE_POLICY_SERVICE);
		ComponentName name=new ComponentName(this,TurnOffScreen.class);
		boolean isActive=devMng.isAdminActive(name);
		if(isActive==false)
		{
			Intent inten=new Intent(DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN);
			inten.putExtra(DevicePolicyManager.EXTRA_DEVICE_ADMIN,name);
            inten.putExtra(DevicePolicyManager.EXTRA_ADD_EXPLANATION,description);
			startActivity(inten);


		}else{ devMng.lockNow();}
		 finish();
    }

}


