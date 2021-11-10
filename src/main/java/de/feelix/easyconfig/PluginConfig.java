package de.feelix.easyconfig;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

/**
 * BaseClass to create a Config
 */
public abstract class PluginConfig extends EasyConfig {


    /**
     * Reference to the ServerConsole
     */
    protected final ConsoleCommandSender console = Bukkit.getConsoleSender();

    /**
     * Reference to the Plugin
     */
    protected final JavaPlugin plugin;


    /**
     * Default Constructor
     * @param plugin the PluginClass
     * @param fileName the Name of the File
     */
    public PluginConfig(@NotNull JavaPlugin plugin, @NotNull String fileName) {
        this(plugin, "", fileName);
    }

    /**
     * Default Constructor
     * @param plugin the PluginClass
     * @param folderName the Name of the Folder
     * @param fileName the Name of the File
     */
    public PluginConfig(@NotNull JavaPlugin plugin, @NotNull String folderName, @NotNull String fileName) {
        super("plugins/" + plugin.getName() + "/" + folderName, fileName);
        this.plugin = plugin;
    }
}