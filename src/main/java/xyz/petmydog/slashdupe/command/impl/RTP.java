package xyz.petmydog.slashdupe.command.impl;

import net.minecraft.network.MessageType;
import net.minecraft.text.LiteralText;
import xyz.petmydog.slashdupe.command.Command;

public class FactionTruce extends Command {
    public FactionTruce() {
        super("rtp", "Random Teleport.", "faction-public2");
    }

    @Override
    public void onCommand(String alias, String[] args) throws Exception {
        mc.inGameHud.getChatHud().addToMessageHistory("-rt");
        try {
            mc.player.sendChatMessage("/rtp");
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
    }
}
