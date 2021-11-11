package de.feelix.easyconfig.templates.database;

import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

/**
 * Template to generate a Config with the information to connect to a DataBase
 *
 * @author SaveFeelix
 * @version 1.0
 */
public abstract class DataBaseTemplate extends de.feelix.easyconfig.templates.DataBaseTemplate {

    /**
     * Constructor of DatabaseTemplate
     *
     * @param plugin the Plugin reference
     */
    public DataBaseTemplate(@NotNull JavaPlugin plugin) {
        this(plugin, "");
    }

    /**
     * Constructor of DatabaseTemplate
     *
     * @param plugin     the Plugin reference
     * @param folderName the folderName
     */
    public DataBaseTemplate(@NotNull JavaPlugin plugin, @NotNull String folderName) {
        super("plugins/" + plugin.getName() + "/" + folderName);
    }
}