package main.java.template;

import arc.util.CommandHandler;
import arc.util.Log;
import mindustry.mod.Plugin;

public class PluginTemplate extends Plugin {
    //called when game initializes
    @Override
    public void init() {
        Log.info("Cool message to show in console when the plugins initialize");
    }

    //register commands that run on the server
    @Override
    public void registerServerCommands(CommandHandler handler) {
        // handler.register("command-name", "params (optional)", "command description", args -> { /* code */ });
    }

    //register commands that player can invoke in-game
    @Override
    public void registerClientCommands(CommandHandler handler) {
        // handler.<Player>register("command-name", "params (optional)", "command description", (args, player) -> { /* code */ });
    }
}
