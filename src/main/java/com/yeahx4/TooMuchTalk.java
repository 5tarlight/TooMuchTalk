package com.yeahx4;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class TooMuchTalk extends JavaPlugin {

  @Override
  public void onEnable() {
    Bukkit.getConsoleSender().sendMessage("Plugin enabled");
  }

  @Override
  public void onDisable() {
    Bukkit.getConsoleSender().sendMessage("Plugin disabled");
  }
}
