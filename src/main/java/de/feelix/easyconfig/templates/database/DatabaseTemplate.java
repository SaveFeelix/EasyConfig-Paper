package de.feelix.easyconfig.templates.database;

import de.feelix.easyconfig.PluginConfig;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

/**
 * Template to generate a Config with the information to connect to a DataBase
 *
 * @author SaveFeelix
 * @version 1.0
 */
public abstract class DatabaseTemplate extends PluginConfig {

    /**
     * Constructor of DatabaseTemplate
     *
     * @param plugin the Plugin reference
     */
    public DatabaseTemplate(@NotNull JavaPlugin plugin) {
        this(plugin, "");
    }

    /**
     * Constructor of DatabaseTemplate
     *
     * @param plugin     the Plugin reference
     * @param folderName the folderName
     */
    public DatabaseTemplate(@NotNull JavaPlugin plugin, @NotNull String folderName) {
        super(plugin, folderName, "database");
    }

    @Override
    public void addDefault() {
        this.add("isEnabled", false);
        this.add("host", "localhost");
        this.add("port", 3306);
        this.add("database", "myDatabase");
        this.add("user", "myUser");
        this.add("password", "myPassword");
        addDefaults();
    }

    /**
     * Abstract method to add other Default values
     */
    public abstract void addDefaults();


    /**
     * Prepared method to check if the Connection is enabled
     *
     * @return true if the connection is enabled
     */
    public Boolean isEnabled() {
        return this.getFromConfig("isEnabled");
    }

    /**
     * Prepared method to get the Host
     *
     * @return the Host
     */
    public String getHost() {
        return this.getFromConfig("host");
    }

    /**
     * Prepared method to get the Port
     *
     * @return the Port
     */
    public Integer getPort() {
        return this.getFromConfig("port");
    }

    /**
     * Prepared method to get the name of the Database
     *
     * @return the DataBase
     */
    public String getDatabase() {
        return this.getFromConfig("database");
    }

    /**
     * Prepared method to get the username
     *
     * @return the UserName
     */
    public String getUser() {
        return this.getFromConfig("user");
    }

    /**
     * Prepared method to get the Password
     *
     * @return the Password
     */
    public String getPassword() {
        return this.getFromConfig("password");
    }
}