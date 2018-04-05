package com.bridgelabz.DesginPattern.StructuralPattern.ProxyPattern;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecuter{
	public void runCommand(String cmd) throws IOException {
                //some heavy implementation
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' command executed.");
	}
}
