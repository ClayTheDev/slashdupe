package xyz.petmydog.slashdupe.command.impl;

import net.minecraft.network.MessageType;
import net.minecraft.text.LiteralText;
import xyz.petmydog.slashdupe.command.Command;

public class PVP extends Command {
    public PVP() {
        super("pv", "Teleports player to PVP area.", "faction-public2");
    }

    @Override
    public void onCommand(String alias, String[] args) throws Exception {
        mc.inGameHud.getChatHud().addToMessageHistory("-pv");
        try {
            mc.player.sendChatMessage("/pvp");
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
    }
}
