package spinghg.hungergames.habilidades;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

import spinghg.hungergames.kit.KitManager;
import spinghg.hungergames.listeners.AmountAPI;
import spinghg.hungergames.listeners.BossBar;
import spinghg.hungergames.libsHg;

import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Miner
 implements Listener, CommandExecutor
{
  private libsHg pl;
  
  public Miner(libsHg plugin)
  {
    this.pl = plugin;
  }
  
  private HashMap<Player, Long> cookieExpires = new HashMap();
  public int delayForEatMinerApple = 500;
  
  @EventHandler
  public void onDamageLumberjack(EntityDamageByEntityEvent e)
  {
	  if (this.pl.comecou)
    if (((e.getEntity() instanceof Player)) && ((e.getDamager() instanceof Player)))
    {
      Entity ent = e.getEntity();
      Player player = (Player)e.getEntity();
      Player damager = (Player)e.getDamager();
      Player p = (Player)ent;
      if ((this.pl.km.temKit(player)) && (this.pl.km.getPlayerKit(player, this.pl.km.getKitByName("Miner"))) && 
        (damager.getItemInHand() != null) && 
        (damager.getItemInHand().getType() != null)) {
      	  if (damager.hasPermission("planeta.vip") && (damager.hasPermission("hg.youtuber")))
    	  {
    		  BossBar.setMessage(damager, p.getName() + " - Miner (�bSopas " + AmountAPI.getAmount(p, Material.MUSHROOM_SOUP) + " �f)" , 1);
    	  }
    	  else
    	  {
        BossBar.setMessage(damager, p.getName() + " - Miner", 1);
      }
    }
  }
  }
  
  @EventHandler
  public void onMiner2(BlockBreakEvent event) { Player minerplayer = event.getPlayer();
  if (this.pl.kit) 
    if ((this.pl.km.temKit(minerplayer)) && (this.pl.km.getPlayerKit(minerplayer, this.pl.km.getKitByName("Miner"))) && 
      (event.getBlock().getType() == Material.COAL_ORE))
    {
      Block u = event.getBlock().getRelative(BlockFace.UP);
      while (u.getType() == Material.COAL_ORE)
      {
        u.breakNaturally();
        u = u.getRelative(BlockFace.UP);
      }
      Block d = event.getBlock().getRelative(BlockFace.DOWN);
      while (d.getType() == Material.COAL_ORE)
      {
        d.breakNaturally();
        d = d.getRelative(BlockFace.DOWN);
      }
      Block e = event.getBlock().getRelative(BlockFace.EAST);
      while (e.getType() == Material.COAL_ORE)
      {
        e.breakNaturally();
        e = e.getRelative(BlockFace.EAST);
      }
      Block ene = event.getBlock().getRelative(BlockFace.EAST_NORTH_EAST);
      while (ene.getType() == Material.COAL_ORE)
      {
        ene.breakNaturally();
        ene = ene.getRelative(BlockFace.EAST_NORTH_EAST);
      }
      Block ese = event.getBlock().getRelative(BlockFace.EAST_SOUTH_EAST);
      while (ese.getType() == Material.COAL_ORE)
      {
        ese.breakNaturally();
        ese = ese.getRelative(BlockFace.EAST_SOUTH_EAST);
      }
      Block north = event.getBlock().getRelative(BlockFace.NORTH);
      while (north.getType() == Material.COAL_ORE)
      {
        north.breakNaturally();
        north = north.getRelative(BlockFace.NORTH);
      }
      Block ne = event.getBlock().getRelative(BlockFace.NORTH_EAST);
      while (ne.getType() == Material.COAL_ORE)
      {
        ne.breakNaturally();
        ne = ne.getRelative(BlockFace.NORTH_EAST);
      }
      Block nne = event.getBlock().getRelative(BlockFace.NORTH_NORTH_EAST);
      while (nne.getType() == Material.COAL_ORE)
      {
        nne.breakNaturally();
        nne = nne.getRelative(BlockFace.NORTH_NORTH_EAST);
      }
      Block nnw = event.getBlock().getRelative(BlockFace.NORTH_NORTH_WEST);
      while (nnw.getType() == Material.COAL_ORE)
      {
        nnw.breakNaturally();
        nnw = nnw.getRelative(BlockFace.NORTH_NORTH_WEST);
      }
      Block nw = event.getBlock().getRelative(BlockFace.NORTH_WEST);
      while (nw.getType() == Material.COAL_ORE)
      {
        nw.breakNaturally();
        nw = nw.getRelative(BlockFace.NORTH_WEST);
      }
      Block s = event.getBlock().getRelative(BlockFace.SELF);
      while (s.getType() == Material.COAL_ORE)
      {
        s.breakNaturally();
        s = s.getRelative(BlockFace.SELF);
      }
      Block south = event.getBlock().getRelative(BlockFace.SOUTH);
      while (south.getType() == Material.COAL_ORE)
      {
        south.breakNaturally();
        south = south.getRelative(BlockFace.SOUTH);
      }
      Block se = event.getBlock().getRelative(BlockFace.SOUTH_EAST);
      while (se.getType() == Material.COAL_ORE)
      {
        se.breakNaturally();
        se = se.getRelative(BlockFace.SOUTH_EAST);
      }
      Block sse = event.getBlock().getRelative(BlockFace.SOUTH_SOUTH_EAST);
      while (sse.getType() == Material.COAL_ORE)
      {
        sse.breakNaturally();
        sse = sse.getRelative(BlockFace.SOUTH_SOUTH_EAST);
      }
      Block ssw = event.getBlock().getRelative(BlockFace.SOUTH_SOUTH_WEST);
      while (ssw.getType() == Material.COAL_ORE)
      {
        ssw.breakNaturally();
        ssw = ssw.getRelative(BlockFace.SOUTH_SOUTH_WEST);
      }
      Block sw = event.getBlock().getRelative(BlockFace.SOUTH_WEST);
      while (sw.getType() == Material.COAL_ORE)
      {
        sw.breakNaturally();
        sw = sw.getRelative(BlockFace.SOUTH_WEST);
      }
      Block w = event.getBlock().getRelative(BlockFace.WEST);
      while (w.getType() == Material.COAL_ORE)
      {
        w.breakNaturally();
        w = w.getRelative(BlockFace.WEST);
      }
      Block wnw = event.getBlock().getRelative(BlockFace.WEST_NORTH_WEST);
      while (wnw.getType() == Material.COAL_ORE)
      {
        wnw.breakNaturally();
        wnw = wnw.getRelative(BlockFace.WEST_NORTH_WEST);
      }
      Block wsw = event.getBlock().getRelative(BlockFace.WEST_SOUTH_WEST);
      while (wsw.getType() == Material.COAL_ORE)
      {
        wsw.breakNaturally();
        wsw = wsw.getRelative(BlockFace.WEST_SOUTH_WEST);
      }
    } }

  @EventHandler
  public void onMiner(BlockBreakEvent event) {
    Player minerplayer = event.getPlayer();
    if (this.pl.kit) 
    if ((this.pl.km.temKit(minerplayer)) && (this.pl.km.getPlayerKit(minerplayer, this.pl.km.getKitByName("Miner"))) && 
      (event.getBlock().getType() == Material.IRON_ORE))
    {
      Block u = event.getBlock().getRelative(BlockFace.UP);
      while (u.getType() == Material.IRON_ORE)
      {
        u.breakNaturally();
        u = u.getRelative(BlockFace.UP);
      }
      Block d = event.getBlock().getRelative(BlockFace.DOWN);
      while (d.getType() == Material.IRON_ORE)
      {
        d.breakNaturally();
        d = d.getRelative(BlockFace.DOWN);
      }
      Block e = event.getBlock().getRelative(BlockFace.EAST);
      while (e.getType() == Material.IRON_ORE)
      {
        e.breakNaturally();
        e = e.getRelative(BlockFace.EAST);
      }
      Block ene = event.getBlock().getRelative(BlockFace.EAST_NORTH_EAST);
      while (ene.getType() == Material.IRON_ORE)
      {
        ene.breakNaturally();
        ene = ene.getRelative(BlockFace.EAST_NORTH_EAST);
      }
      Block ese = event.getBlock().getRelative(BlockFace.EAST_SOUTH_EAST);
      while (ese.getType() == Material.IRON_ORE)
      {
        ese.breakNaturally();
        ese = ese.getRelative(BlockFace.EAST_SOUTH_EAST);
      }
      Block north = event.getBlock().getRelative(BlockFace.NORTH);
      while (north.getType() == Material.IRON_ORE)
      {
        north.breakNaturally();
        north = north.getRelative(BlockFace.NORTH);
      }
      Block ne = event.getBlock().getRelative(BlockFace.NORTH_EAST);
      while (ne.getType() == Material.IRON_ORE)
      {
        ne.breakNaturally();
        ne = ne.getRelative(BlockFace.NORTH_EAST);
      }
      Block nne = event.getBlock().getRelative(BlockFace.NORTH_NORTH_EAST);
      while (nne.getType() == Material.IRON_ORE)
      {
        nne.breakNaturally();
        nne = nne.getRelative(BlockFace.NORTH_NORTH_EAST);
      }
      Block nnw = event.getBlock().getRelative(BlockFace.NORTH_NORTH_WEST);
      while (nnw.getType() == Material.IRON_ORE)
      {
        nnw.breakNaturally();
        nnw = nnw.getRelative(BlockFace.NORTH_NORTH_WEST);
      }
      Block nw = event.getBlock().getRelative(BlockFace.NORTH_WEST);
      while (nw.getType() == Material.IRON_ORE)
      {
        nw.breakNaturally();
        nw = nw.getRelative(BlockFace.NORTH_WEST);
      }
      Block s = event.getBlock().getRelative(BlockFace.SELF);
      while (s.getType() == Material.IRON_ORE)
      {
        s.breakNaturally();
        s = s.getRelative(BlockFace.SELF);
      }
      Block south = event.getBlock().getRelative(BlockFace.SOUTH);
      while (south.getType() == Material.IRON_ORE)
      {
        south.breakNaturally();
        south = south.getRelative(BlockFace.SOUTH);
      }
      Block se = event.getBlock().getRelative(BlockFace.SOUTH_EAST);
      while (se.getType() == Material.IRON_ORE)
      {
        se.breakNaturally();
        se = se.getRelative(BlockFace.SOUTH_EAST);
      }
      Block sse = event.getBlock().getRelative(BlockFace.SOUTH_SOUTH_EAST);
      while (sse.getType() == Material.IRON_ORE)
      {
        sse.breakNaturally();
        sse = sse.getRelative(BlockFace.SOUTH_SOUTH_EAST);
      }
      Block ssw = event.getBlock().getRelative(BlockFace.SOUTH_SOUTH_WEST);
      while (ssw.getType() == Material.IRON_ORE)
      {
        ssw.breakNaturally();
        ssw = ssw.getRelative(BlockFace.SOUTH_SOUTH_WEST);
      }
      Block sw = event.getBlock().getRelative(BlockFace.SOUTH_WEST);
      while (sw.getType() == Material.IRON_ORE)
      {
        sw.breakNaturally();
        sw = sw.getRelative(BlockFace.SOUTH_WEST);
      }
      Block w = event.getBlock().getRelative(BlockFace.WEST);
      while (w.getType() == Material.IRON_ORE)
      {
        w.breakNaturally();
        w = w.getRelative(BlockFace.WEST);
      }
      Block wnw = event.getBlock().getRelative(BlockFace.WEST_NORTH_WEST);
      while (wnw.getType() == Material.IRON_ORE)
      {
        wnw.breakNaturally();
        wnw = wnw.getRelative(BlockFace.WEST_NORTH_WEST);
      }
      Block wsw = event.getBlock().getRelative(BlockFace.WEST_SOUTH_WEST);
      while (wsw.getType() == Material.IRON_ORE)
      {
        wsw.breakNaturally();
        wsw = wsw.getRelative(BlockFace.WEST_SOUTH_WEST);
      }
    }
  }

  @EventHandler
  public void onChomp(PlayerInteractEvent event) {
	  if (this.pl.kit) 
    if (event.getAction().name().contains("RIGHT"))
    {
      Player p = event.getPlayer();
      if (((!this.cookieExpires.containsKey(p)) || (((Long)this.cookieExpires.get(p)).longValue() < System.currentTimeMillis())) && 
     (this.pl.km.temKit(p)) && (this.pl.km.getPlayerKit(p, this.pl.km.getKitByName("Miner"))) && (event.getItem() != null) && (event.getItem().getType() == Material.APPLE))
      {
        event.setCancelled(true);
        p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 1200, 1), true);
        event.getItem().setAmount(event.getItem().getAmount() - 1);
        if (event.getItem().getAmount() == 0) {
          p.setItemInHand(new ItemStack(0));
        }
        this.cookieExpires.put(p, Long.valueOf(System.currentTimeMillis() + this.delayForEatMinerApple));
      }
    }
  }
  public boolean onCommand(CommandSender p, Command c, String label, String[] args)
  {
	    if (c.getName().equalsIgnoreCase("Miner")) {
	      Player p1 = (Player)p;
	      p1.chat("/kit Miner");
	    }

	    return false;
	  }
}
