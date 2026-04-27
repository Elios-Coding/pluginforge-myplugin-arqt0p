package com.pluginforge.myplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class ComExampleMyPluginMainClass extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("MyPlugin v1.0 enabled.");
        getCommand("home1").setExecutor(new Home1Command());
        getCommand("spam").setExecutor(new SpamCommand());
        getCommand("shutdown").setExecutor(new ShutdownCommand());

    }

    @Override
    public void onDisable() {
        getLogger().info("MyPlugin disabled.");
    }
}
