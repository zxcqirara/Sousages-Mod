package ru.cha0sf4me.sausages.register;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventsRegistry {
    @SubscribeEvent
    public void onLoot(LootTableLoadEvent e) {
        if (LootTableList.CHESTS_SPAWN_BONUS_CHEST.equals(e.getName())) {
            final ResourceLocation loc = new ResourceLocation("sausages", "chests/sausage_seeds");
            final LootTable customLootTable = e.getLootTableManager().getLootTableFromLocation(loc);
            e.setTable(customLootTable);
        }
    }
}
