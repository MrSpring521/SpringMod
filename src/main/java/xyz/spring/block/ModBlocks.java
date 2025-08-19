package xyz.spring.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.spring.SpringMod;

public class ModBlocks {

    public static final Block SPRING_ICON_BLOCK = register("spring_icon_block",
            new Block(AbstractBlock
                    .Settings.create()
                    .strength(3.0F,3.0F)));

    public static final Block SPRING_ICON_ORE = register("spring_icon_ore",
            new Block(AbstractBlock
                    .Settings.create()
                    .strength(4.5F,6.0F)));

    public static final Block RAW_SPRING_ICON_BLOCK = register("raw_spring_icon_block",
            new Block(AbstractBlock
                    .Settings.create()
                    .strength(3.0F,3.0F)));

    public static void registerBlockItems(String id, Block block){
        Item item = Registry.register(Registries.ITEM, Identifier.of(SpringMod.MOD_ID, id), new BlockItem(block, new Item.Settings()));
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
    }

    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(SpringMod.MOD_ID, id), block);
    }

    public static void registerModBlocks(){
        SpringMod.LOGGER.info("Registering Blocks");
    }
}
