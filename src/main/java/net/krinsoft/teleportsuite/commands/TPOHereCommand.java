package net.krinsoft.teleportsuite.commands;

import net.krinsoft.teleportsuite.Request;
import net.krinsoft.teleportsuite.TeleportSuite;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.permissions.PermissionDefault;

import java.util.List;

/**
 * @author krinsdeath
 */
public class TPOHereCommand extends TeleportCommand {

    public TPOHereCommand(TeleportSuite plugin) {
        super(plugin);
        setName("TeleportSuite: TPO Here");
        setCommandUsage(  ChatColor.GREEN + "/tpohere" + ChatColor.GOLD + " [PLAYER]");
        addCommandExample(ChatColor.GREEN + "/tpohere" + ChatColor.GOLD + " Njodi   " + ChatColor.WHITE + " -- Teleport Njodi directly to you.");
        setArgRange(1, 1);
        addKey("teleport tpohere");
        addKey("tps tpohere");
        addKey("tpohere");
        setPermission("teleport.tpohere", "Teleports another user directly to you, bypassing their toggle setting.", PermissionDefault.OP);
    }

    public void runCommand(CommandSender sender, List<String> args) {
        super.runTeleport(sender, args.get(0), Request.Type.TPOHERE);
    }
}
