package de.feelix.easyconfig.templates.messages;

import de.feelix.easyconfig.PluginConfig;
import de.feelix.easyconfig.utils.TextUtils;
import net.kyori.adventure.text.Component;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

/**
 * Template to generate a Config with Messages
 *
 * @author SaveFeelix
 * @version 1.0
 */
public abstract class MessagesTemplate extends PluginConfig {

    /**
     * Reference to the Prefix
     */
    protected final String prefixVariable;

    /**
     * Constructor of MessagesTemplate
     * @param plugin reference to the Plugin
     */
    public MessagesTemplate(@NotNull JavaPlugin plugin) {
        this(plugin, "", null);
    }

    /**
     * Constructor of MessagesTemplate
     * @param plugin reference to the Plugin
     * @param folderName the folderName
     */
    public MessagesTemplate(@NotNull JavaPlugin plugin, @NotNull String folderName) {
        this(plugin, folderName, null);
    }

    /**
     * Constructor of MessagesTemplate
     * @param plugin reference to the Plugin
     * @param folderName the folderName
     * @param prefixVariable the prefixVariable
     */
    public MessagesTemplate(@NotNull JavaPlugin plugin, @NotNull String folderName, @Nullable String prefixVariable) {
        super(plugin, folderName, "messages");
        this.prefixVariable = prefixVariable != null ? prefixVariable : "%prefix%";
        addDefaultMessages();
    }

    /**
     * Method to add the default Messages
     */
    private void addDefaultMessages() {
        this.add("prefix", plugin.getName() + " §7>>");
        this.add("load", "%prefix% §6Plugin load§7...");
        this.add("enable", "%prefix% §aPlugin enabled");
        this.add("disable", "%prefix% §cPlugin disabled");
    }

    /**
     * Getter for the Prefix
     * @return the Prefix
     */
    public String getPrefix() {
        return this.getFromConfig("prefix");
    }

    /**
     * Getter for the LoadMessage
     * @return the LoadMessage as a Component
     */
    public Component getLoadComponent() {
        return TextUtils.checkOther(this.getFromConfig("load"), prefixVariable, this.getPrefix()).asComponent();
    }

    /**
     * Getter for the LoadMessage
     * @return the LoadMessage as a String
     */
    public String getLoadString() {
        return TextUtils.checkOther(this.getFromConfig("load"), prefixVariable, this.getPrefix()).asString();
    }

    /**
     * Getter for the EnableMessage
     * @return the EnableMessage as a Component
     */
    public Component getEnableComponent() {
        return TextUtils.checkOther(this.getFromConfig("enable"), prefixVariable, this.getPrefix()).asComponent();
    }

    /**
     * Getter for the EnableMessage
     * @return the EnableMessage as a String
     */
    public String getEnableString() {
        return TextUtils.checkOther(this.getFromConfig("enable"), prefixVariable, this.getPrefix()).asString();
    }

    /**
     * Getter for the DisableMessage
     * @return the DisableMessage as a Component
     */
    public Component getDisableComponent() {
        return TextUtils.checkOther(this.getFromConfig("disable"), prefixVariable, this.getPrefix()).asComponent();
    }

    /**
     * Getter for the DisableMessage
     * @return the DisableMessage as a String
     */
    public String getDisableString() {
        return TextUtils.checkOther(this.getFromConfig("disable"), prefixVariable, this.getPrefix()).asString();
    }
}
