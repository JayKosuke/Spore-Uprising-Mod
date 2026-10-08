package net.kettle9107.sporeuprising.block;

import net.kettle9107.sporeuprising.SporeUprising;
import net.kettle9107.sporeuprising.block.custom.MyceliumCarrotCropBlock;
import net.kettle9107.sporeuprising.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(SporeUprising.MODID);

    public static final DeferredBlock<Block> MYCELIUM_CARROT_CROP = BLOCKS.register("mycelium_carrot_crop",
            () -> new MyceliumCarrotCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CARROTS)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
