package net.kettle9107.sporeuprising.item;

import net.kettle9107.sporeuprising.SporeUprising;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SporeUprising.MODID);

    public static final Supplier<CreativeModeTab> SPORE_UPRISING_TAB = CREATIVE_MODE_TAB.register("spore_uprising_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MINIATUREBLACKHOLE.get()))
                    .title(Component.translatable("creativetab.sporeuprising.spore_uprising_items"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MINIATUREBLACKHOLE);
                        output.accept(ModItems.MEATYCARROTSTEW);
                    })).build());

//    public static final Supplier<CreativeModeTab> LEARNING_BLOCKS_TAB = CREATIVE_MODE_TAB.register("learning_blocks_tab",
//            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.LEARNING_BLOCK.get()))
//                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(LearningMod.MODID, "learning_items_tab"))
//                    .title(Component.translatable("creativetab.learningmod.learning_blocks"))
//                    .displayItems(((itemDisplayParameters, output) -> {
//                        output.accept(ModBlocks.LEARNING_BLOCK);
//                        output.accept(ModBlocks.LEARNING_ORE);
//                    })).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}