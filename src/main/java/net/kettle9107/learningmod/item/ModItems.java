package net.kettle9107.learningmod.item;

import net.kettle9107.learningmod.LearningMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    // Create a Deferred Register to hold Items which will all be registered under the "learningmod" namespace
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LearningMod.MODID);

    public static final DeferredItem<Item> LEARNINGITEM = ITEMS.register("learningitem",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEARNERITE = ITEMS.register("learnerite",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
