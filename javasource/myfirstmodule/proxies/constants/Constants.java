// This file was generated by Mendix Modeler 6.9.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the MyFirstModule module

	public static String getRandomUserLocation()
	{
		return (String)Core.getConfiguration().getConstantValue("MyFirstModule.RandomUserLocation");
	}
}