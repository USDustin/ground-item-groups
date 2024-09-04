package com.grounditemgroups;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class GroundItemGroupsPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(GroundItemGroupsPlugin.class);
		RuneLite.main(args);
	}
}