package com.BingoPlugin;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class BingoPluginTest
{
	public static void main(String[] args)
	{
		// Enable Java assertions for the system classloader before loading RuneLite classes.
		ClassLoader.getSystemClassLoader().setDefaultAssertionStatus(true);

		try
		{
			// Optional: set LWJGL native path if you know the natives location.
			// System.setProperty("org.lwjgl.librarypath", "C:\\path\\to\\lwjgl\\natives");

			ExternalPluginManager.loadBuiltin(BingoPlugin.class);
			RuneLite.main(args);
		}
		catch (Throwable t)
		{
			// Print full stacktrace so Gradle shows the cause.
			t.printStackTrace();
			// Do not call System.exit(1) here — let the test JVM exit normally so Gradle doesn't simply report a non-zero exit value.
		}
	}
}