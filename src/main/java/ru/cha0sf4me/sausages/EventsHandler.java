package ru.cha0sf4me.sausages;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import javax.xml.soap.Text;

public class EventsHandler {
    @SubscribeEvent
    public void onLoot(LootTableLoadEvent e) {
        if (LootTableList.CHESTS_ABANDONED_MINESHAFT.equals(e.getName())) {
            final ResourceLocation loc = new ResourceLocation("sausages", "chests/sausage_seeds");
            final LootTable customLootTable = e.getLootTableManager().getLootTableFromLocation(loc);
            e.setTable(customLootTable);
        }
    }
}
