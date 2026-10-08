package net.kettle9107.sporeuprising.item;

import net.kettle9107.sporeuprising.SporeUprising;
import net.kettle9107.sporeuprising.block.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    // Create a Deferred Register to hold Items which will all be registered under the "sporeuprising" namespace
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SporeUprising.MODID);

    public static final DeferredItem<Item> MINIATUREBLACKHOLE = ITEMS.register("miniature_black_hole",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MYCELIUMCARROTSTEW = ITEMS.register("mycelium_carrot_stew",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MYCELIUMCARROTSTEW)));
    public static final DeferredItem<Item> MYCELIUMCARROT = ITEMS.register("mycelium_carrot",
            () -> new ItemNameBlockItem(ModBlocks.MYCELIUM_CARROT_CROP.get(), new Item.Properties().food(ModFoodProperties.MYCELIUMCARROT)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}