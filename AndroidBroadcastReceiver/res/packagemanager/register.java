ComponentName receiver = new ComponentName(context, myReceiver.class);
PackageManager pm = context.getPackageManager();

pm.setComponentEnabledSetting(receiver, 
	PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
	PackageManager.DONT_KILL_APP);
