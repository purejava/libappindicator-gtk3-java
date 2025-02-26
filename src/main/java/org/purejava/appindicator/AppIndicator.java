// Generated by jextract

package org.purejava.appindicator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import static org.purejava.appindicator.app_indicator_h_1.*;

/**
 * {@snippet lang=c :
 * typedef struct _AppIndicator AppIndicator
 * }
 */
public class AppIndicator extends _AppIndicator {

    private static final Logger LOG = LoggerFactory.getLogger(AppIndicator.class);
    private static boolean isLoaded = false;
    private static final String LD_CONFIG = "/etc/ld.so.conf.d/";
    private static final String LIB_NAME_VERSION = "libappindicator3.so.1";
    private static final String FLATPAK_LIB_NAME_VERSION = "libappindicator3.so";
    private static final String LIBNAME_WITH_VERSION = "appindicator3";
    private static List<String> allPath = new LinkedList<>();

    static {
        try (Stream<Path> paths = Files.list(Path.of(LD_CONFIG))) {
            paths.forEach((file) -> {
                try (Stream<String> lines = Files.lines(file)) {
                    List<String> collection = lines.filter(line -> line.startsWith("/")).toList();
                    allPath.addAll(collection);
                } catch (IOException e) {
                    LOG.error("File '{}' could not be loaded", file);
                }
            });
        } catch (IOException e) {
            LOG.error("Directory '{}' does not exist", LD_CONFIG);
        }

        allPath.add("/usr/lib"); // for systems, that don't implement multiarch
        allPath.add("/app/lib"); // for flatpak and libraries in the flatpak sandbox
        allPath.add("/usr/lib64"); // for Fedora-like distributions
        for (String path : allPath) {
            try {
                if (!path.equals("/app/lib")) {
                    System.load(path + File.separator + LIB_NAME_VERSION);
                } else {
                    // flatpak has an own, self-compiled version
                    System.load(path + File.separator + FLATPAK_LIB_NAME_VERSION);
                }
                isLoaded = true;
                break;
            } catch (UnsatisfiedLinkError ignored) { }
        }

        // When loading via System.load wasn't successful, try to load via System.loadLibrary.
        // System.loadLibrary builds the libname by prepending the prefix JNI_LIB_PREFIX
        // and appending the suffix JNI_LIB_SUFFIX. This usually does not work for library files
        // with an ending like '3.so.1'.
        if (!isLoaded) {
            try {
                System.loadLibrary(LIBNAME_WITH_VERSION);
                isLoaded = true;
            } catch (UnsatisfiedLinkError ignored) { }
        }
        LOG.info(isLoaded ? "Native code library libappindicator3 successfully loaded" : "Native code library libappindicator3 failed to load");
    }

    AppIndicator() {
        // Should not be called directly
    }

    /**
     * Creates a new AppIndicator setting the properties: “id” with id , “category” with category and “icon-name” with iconName.
     * @param id       The unique id of the indicator to create.
     * @param iconName The icon name for this indicator.
     * @param category The category of indicator.
     * @return A pointer to a new AppIndicator object.
     */
    public static MemorySegment newIndicator(String id, String iconName, int category) {
        if (null != id && null != iconName) {
            try (var arena = Arena.ofConfined()) {
                return app_indicator_new(arena.allocateFrom(id), arena.allocateFrom(iconName), category);
            }
        } else {
            return MemorySegment.NULL;
        }
    }

    /**
     * Creates a new AppIndicator setting the properties: “id” with id , “category” with category , “icon-name” with iconName and “icon-theme-path” with iconThemePath.
     * @param id            The unique id of the indicator to create.
     * @param iconName      The icon name for this indicator.
     * @param category      The category of indicator.
     * @param iconThemePath A custom path for finding icons.
     * @return A pointer to a new AppIndicator object.
     */
    public static MemorySegment newIndicatorWithPath(String id, String iconName, int category, String iconThemePath) {
        if (null != id && null != iconName && null != iconThemePath) {
            try (var arena = Arena.ofConfined()) {
                return app_indicator_new_with_path(arena.allocateFrom(id), arena.allocateFrom(iconName), category, arena.allocateFrom(iconThemePath));
            }
        } else {
            return MemorySegment.NULL;
        }
    }

    /**
     * This function allows for building the Application Indicator menu from a static desktop file.
     * @param self           The AppIndicator object to use.
     * @param desktopFile    A path to the desktop file to build the menu from.
     * @param desktopProfile Which entries should be used from the desktop file.
     */
    public static void buildMenuFromDesktop(MemorySegment self, String desktopFile, String desktopProfile) {
        if (null != self && null != desktopFile && null != desktopProfile) {
            try (var arena = Arena.ofConfined()) {
                app_indicator_build_menu_from_desktop(self, arena.allocateFrom(desktopFile), arena.allocateFrom(desktopProfile));
            }
        }
    }

    /**
     * Wrapper function for property “category”.
     * @param self The AppIndicator object to use.
     * @return The current category.
     */
    public static int getCategory(MemorySegment self) {
        return null != self ? app_indicator_get_category(self) : -1;
    }

    /**
     * Wrapper function for property “attention-icon-name”.
     * @param self The AppIndicator object to use.
     * @return The current attention icon name.
     */
    public static String getAttentionIcon(MemorySegment self) {
        return null != self ? app_indicator_get_attention_icon(self).getString(0) : "";
    }

    /**
     * Wrapper function for property “id”.
     * @param self The AppIndicator object to use.
     * @return The current ID.
     */
    public static String getID(MemorySegment self) {
        return null != self ? app_indicator_get_id(self).getString(0) : "";
    }

    /**
     * Wrapper function for property “icon-name”.
     * @param self The AppIndicator object to use.
     * @return The current icon name.
     */
    public static String getIcon(MemorySegment self) {
        return null != self ? app_indicator_get_icon(self).getString(0) : "";
    }

    /**
     * Wrapper function for property “label”.
     * @param self The AppIndicator object to use.
     * @return The current label.
     */
    public static String getLabel(MemorySegment self) {
        return null != self ? app_indicator_get_label(self).getString(0) : "";
    }

    /**
     * Gets the menu being used for this application indicator. Wrapper function for property “menu”.
     * @param self The AppIndicator object to use.
     * @return A GtkMenu object or NULL if one hasn't been set.
     */
    public static MemorySegment getMenu(MemorySegment self) {
        return null != self ? app_indicator_get_menu(self) : MemorySegment.NULL;
    }

    /**
     * Wrapper function for property “ordering-index”.
     * @param self The AppIndicator object to use.
     * @return The current ordering index.
     */
    public static int getOrderingIndex(MemorySegment self) {
        return null != self ? app_indicator_get_ordering_index(self) : 0;
    }

    /**
     * Wrapper function for property “status”.
     * @param self The AppIndicator object to use.
     * @return The current status.
     */
    public static int getStatus(MemorySegment self) {
        return null != self ? app_indicator_get_status(self) : -1;
    }

    /**
     * Gets the title of the application indicator. See the function app_indicator_set_title() for information on the title.
     * @param self The AppIndicator object to use.
     * @return The current title.
     */
    public static String getTitle(MemorySegment self) {
        return null != self ? app_indicator_get_title(self).getString(0) : "";
    }

    /**
     * Wrapper for app_indicator_set_attention_icon_full() with a NULL description.
     * @param self     The AppIndicator object to use.
     * @param iconName The name of the attention icon to set for this indicator.
     */
    public static void setAttentionIcon(MemorySegment self, String iconName) {
        if (null != self && null != iconName) {
            try (var arena = Arena.ofConfined()) {
                app_indicator_set_attention_icon(self, arena.allocateFrom(iconName));
            }
        }
    }

    /**
     * Wrapper function for app_indicator_set_icon_full() with a NULL description.
     * @param self     The AppIndicator object to use.
     * @param iconName The icon name to set.
     */
    public static void setIcon(MemorySegment self, String iconName) {
        if (null != self && null != iconName) {
            try (var arena = Arena.ofConfined()) {
                app_indicator_set_icon(self, arena.allocateFrom(iconName));
            }
        }
    }

    /**
     * This is a wrapper function for the “label” and “guide” properties. This function can take NULL as either label or guide and will clear the entries.
     * @param self  The AppIndicator object to use.
     * @param label The label to show next to the icon.
     * @param guide A guide to size the label correctly.
     */
    public static void setLabel(MemorySegment self, String label, String guide) {
        if (null != self && null != label && null != guide) {
            try (var arena = Arena.ofConfined()) {
                app_indicator_set_label(self, arena.allocateFrom(label), arena.allocateFrom(guide));
            }
        }
    }

    /**
     * Sets the menu that should be shown when the Application Indicator is clicked on in the panel. An application indicator will not be rendered unless it has a menu.
     * Wrapper function for property “menu”.
     * @param self The AppIndicator object to use.
     * @param menu A GtkMenu to set.
     */
    public static void setMenu(MemorySegment self, MemorySegment menu) {
        if (null != self && null != menu) {
            app_indicator_set_menu(self, menu);
        }
    }

    /**
     * Sets the ordering index for the app indicator which effects the placement of it on the panel. For almost all app indicator this is not the function you're looking for.
     * Wrapper function for property “ordering-index”.
     * @param self          The AppIndicator object to use.
     * @param orderingIndex A value for the ordering of this app indicator.
     */
    public static void setOrderingIndex(MemorySegment self, int orderingIndex) {
        if (null != self) {
            app_indicator_set_ordering_index(self, orderingIndex);
        }
    }

    /**
     * Wrapper function for property “status”.
     * @param self   The AppIndicator object to use.
     * @param status The status to set for this indicator.
     */
    public static void setStatus(MemorySegment self, int status) {
        if (null != self) {
            app_indicator_set_status(self, status);
        }
    }

    /**
     * Sets the title of the application indicator, or how it should be referred in a human readable form. This string should be UTF-8 and localized as it expected that users will set it.
     * In the Unity desktop the most prominent place that this is show will be in the HUD. HUD listings for this application indicator will start with the title as the first part of the line for the menu items.
     * @param self  The AppIndicator object to use.
     * @param title Title of the app indicator. Setting title to NULL removes the title.
     */
    public static void setTitle(MemorySegment self, String title) {
        if (null != self) {
            try (var arena = Arena.ofConfined()) {
                app_indicator_set_title(self, arena.allocateFrom(title));
            }
        }
    }

    public static boolean isLoaded() {
        return isLoaded;
    }
}

