package chargedcreepers.vicensk;

import org.bukkit.plugin.java.JavaPlugin;

public final class Vicensk extends JavaPlugin {

    @Override
    public void onEnable() {

        System.out.Print('All your creepers will spawn charged now.')

    }


    @Override
    public void creatureSpawn(CreatureSpawnEvent event) {
        if(event.getEntityType() == EntityType.CREEPER) {
            Creeper creeper = (Creeper) event.getEntity();
            creeper.setPowered(true);
        }
    }







    @Override
    public void onDisable() {

        System.out.Print('SHUTDOWN')
    }
}