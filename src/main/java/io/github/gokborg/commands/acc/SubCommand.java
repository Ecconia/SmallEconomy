package io.github.gokborg.commands.acc;

import org.bukkit.command.CommandSender;

public abstract class SubCommand
{
	public abstract void process(CommandSender sender, String[] args);
}
