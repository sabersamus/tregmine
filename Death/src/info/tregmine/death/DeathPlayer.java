package info.tregmine.death;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;


public class DeathPlayer implements Listener {
	public final Death plugin;

	public DeathPlayer(Death instance) {
		this.plugin = instance;
		plugin.getServer();
	}
	
	@EventHandler
	public void onPlayerRespawn(final PlayerRespawnEvent event) {
		this.plugin.getServer().getScheduler().scheduleSyncDelayedTask(this.plugin,new Runnable() {
			@Override
			public void run() {
				event.getPlayer().teleport(plugin.getServer().getWorld("world").getSpawnLocation());
			}},20L);
			
	}
}
