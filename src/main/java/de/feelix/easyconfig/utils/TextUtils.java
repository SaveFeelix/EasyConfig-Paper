package de.feelix.easyconfig.utils;

import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;

/**
 * Class to replace text
 *
 * @author SaveFeelix
 * @version 1.0
 */
public abstract class TextUtils {

    /**
     * The Message
     */
    private static String selfMessage;

    /**
     * Prepared Method to replace a string with another string
     * @param message the original Message
     * @param variable the variable to replace
     * @param replace the replace text
     * @return a TextUtils
     */
    public static @NotNull TextUtils checkOther(@NotNull String message, @NotNull String variable, @NotNull String replace) {
        selfMessage = "";
        selfMessage = (message.toLowerCase().contains(variable.toLowerCase())) ? message.replace(variable, replace) : message;
        return new TextUtils() {
            @Override
            public String asString() {
                return super.asString();
            }

            @Override
            public Component asComponent() {
                return super.asComponent();
            }
        };
    }
    /**
     * Prepared Method to replace a char with another char
     * @param message the original Message
     * @param variable the variable to replace
     * @param replace the replace text
     * @return a TextUtils
     */
    public static @NotNull TextUtils checkOther(@NotNull String message, @NotNull Character variable, @NotNull Character replace) {
        selfMessage = "";
        selfMessage = (message.toLowerCase().contains(variable.toString().toLowerCase())) ? message.replace(variable, replace) : message;
        return new TextUtils() {
            @Override
            public String asString() {
                return super.asString();
            }

            @Override
            public Component asComponent() {
                return super.asComponent();
            }
        };
    }

    /**
     * Get the selfMessage as a String
     * @return the selfMessage
     */
    public String asString() {
        return selfMessage;
    }

    /**
     * Get the selfMessage as a Component
     * @return the selfMessage
     */
    public Component asComponent() {
        return Component.text(selfMessage);
    }
}