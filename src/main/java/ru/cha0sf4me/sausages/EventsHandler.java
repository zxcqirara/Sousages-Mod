package ru.cha0sf4me.sausages;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import javax.xml.soap.Text;

public class EventsHandler {
    @SubscribeEvent
    public void onJoin(EntityJoinWorldEvent e) {
        if (e.getEntity() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) e.getEntity();
            player.sendMessage(new TextComponentString(TextFormatting.GREEN+"Hello, "+TextFormatting.AQUA+player.getDisplayName()+TextFormatting.GREEN+"! Welcome to world!"));
        }
    }
}
