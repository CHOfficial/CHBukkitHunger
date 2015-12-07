package spinghg.hungergames.commands;

import spinghg.hungergames.libsHg;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class mute
  implements CommandExecutor
{
  private libsHg pl;

  public mute(libsHg plugin)
  {
    this.setPl(plugin);
  }

  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
	    if (!(sender instanceof Player))
	    {
	      sender.sendMessage("�9Erro> �7Somente jogadores podem executar este comando!");
	      return true;
	    }
	    
    if (args.length == 0)
    {
      sender.sendMessage("�c�oUse /mute [jogador] [motivo]");
      return true;
    }
    if (args.length == 1)
    {
      sender.sendMessage("�c�ofalta um motivo");
      sender.sendMessage("�c�oUse /mute [jogador] [motivo]");
      return true;
    }
    if (args.length > 1)
    {
      Player target = Bukkit.getPlayerExact(args[0]);
      if ((target == null) || (!(target instanceof Player)))
      {
        sender.sendMessage("�c�oJogador n�o encontrado!");
        return true;
      }
      StringBuilder sb = new StringBuilder();
      for (int i = 1; i < args.length; i++) {
        sb.append(args[i] + " ");
      }
      String msg = sb.toString();
      target.sendMessage(String.format("�7[%s -> Voc�]�7 %s", new Object[] { sender.getName(), msg }));
      sender.sendMessage(String.format("�7(�fVoce �7-> �c%s�7) %s", new Object[] { target.getName(), msg }));
      if (sender.hasPermission("hg.mod") && (sender.hasPermission("hg.admin")))
	    {
  libsHg.stafflog(sender.getName() + " mandou um tell para o " + target.getName() + " com a msg " + msg);
	    }
    }
    return false;
  }

public libsHg getPl() {
	return pl;
}

public void setPl(libsHg pl) {
	this.pl = pl;
}
}