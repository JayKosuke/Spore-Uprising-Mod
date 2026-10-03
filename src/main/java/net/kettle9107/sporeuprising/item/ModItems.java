package net.kettle9107.sporeuprising.item;

import net.kettle9107.sporeuprising.SporeUprising;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    // Create a Deferred Register to hold Items which will all be registered under the "sporeuprising" namespace
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SporeUprising.MODID);

    public static final DeferredItem<Item> MINIATUREBLACKHOLE = ITEMS.register("miniature_black_hole",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MEATYCARROTSTEW = ITEMS.register("meaty_carrot_stew",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MEATYCARROTSTEW)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}