package xyz.petmydog.slashdupe.command.impl;

import net.minecraft.network.MessageType;
import net.minecraft.text.LiteralText;
import xyz.petmydog.slashdupe.command.Command;

public class Spawn extends Command {
    public Spawn() {
        super("sp", "TPs You to spawn.", "faction-public2");
    }

    @Override
    public void onCommand(String alias, String[] args) throws Exception {
        mc.inGameHud.getChatHud().addToMessageHistory("-sp");
        try {
            mc.player.sendChatMessage("/spawn");
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
    }
}
