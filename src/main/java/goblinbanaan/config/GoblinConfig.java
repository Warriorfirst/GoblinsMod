package goblinbanaan.config;

import gg.essential.vigilance.Vigilant;
import gg.essential.vigilance.data.Property;
import gg.essential.vigilance.data.PropertyType;
import goblinbanaan.GoblinsMod;

import java.io.File;

public class GoblinConfig extends Vigilant {

    @Property(
            type = PropertyType.SWITCH, name = "Dungeon Death Message",
            description = "Displays a funny death message when someone in your party dies.",
            category = "Dungeon", subcategory = "Funny stuff",
            searchTags = {"Message", "Dead"}
    )
    public static boolean dungeonDeathMessage = false;

    @Property(
            type = PropertyType.TEXT, name = "Death Message Text",
            description = "This text will be sent when someone dies, leaving this \nempty will cause it to for example say \"Good night\" when someone dies\n§cDungeon Death Message must be enabled for it to work.",
            category = "Dungeon", subcategory = "Funny stuff",
            searchTags = {"Dead"}
    )
    public static String dungeonDeathMessageText = "";

    @Property(
            type = PropertyType.SWITCH, name = "Dungeon Join Commands",
            description = "Allows your party to send text to queue into dungeons.\nThe commands are !f1,f2,f3 etc. till !m7.\n§cCommand only triggers if it got typed in Party Chat.",
            category = "Dungeon", subcategory = "Party commands",
            searchTags = {"Party", "Command", "Commands"}
    )
    public static boolean queueCommands = false;

    public static GoblinConfig INSTANCE = new GoblinConfig();

    public GoblinConfig() {
        super(new File("./config/goblinmod.toml"), "GoblinsMod (" + GoblinsMod.VERSION + ")");
        initialize();
    }

}
