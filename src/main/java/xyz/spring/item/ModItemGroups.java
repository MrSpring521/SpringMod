package xyz.spring.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import xyz.spring.SpringMod;
import xyz.spring.block.ModBlocks;

public class ModItemGroups {

//    public static final RegistryKey<ItemGroup> Spring_GROUP = register("spring_group");
//
//    private static RegistryKey<ItemGroup> register(String id) {
//        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(SpringMod.MOD_ID,id));
//    }
//
//    public static void registerModItemGroups(){
//        Registry.register(
//                Registries.ITEM_GROUP,
//                Spring_GROUP,
//                ItemGroup.create(ItemGroup.Row.TOP, 7)
//                        .displayName(Text.translatable("itemGroup.spring_group"))
//                        .icon(() -> new ItemStack(ModItems.SPRING_ICON))
//                        .entries(((displayContext, entries) -> {
//                            entries.add(ModItems.SPRING_ICON);
//                        }).build()));
//        SpringMod.LOGGER.info("Registering Item Groups");
//    }
    public static final ItemGroup SPRING_GROUP = Registry.register(Registries.ITEM_GROUP,
        Identifier.of(SpringMod.MOD_ID, "spring_group"),
        ItemGroup.create(null,-1)
                .displayName(Text.translatable("itemGroup.spring_group"))
                .icon(() -> new ItemStack(ModItems.SPRING_ICON))
                .entries((displayContext, entries) -> {
                    entries.add(ModItems.SPRING_ICON);
                    entries.add(ModItems.RAW_SPRING_ICON);
                    entries.add(ModBlocks.SPRING_ICON_BLOCK);
                    entries.add(ModBlocks.SPRING_ICON_ORE);
                    entries.add(ModBlocks.RAW_SPRING_ICON_BLOCK);
                })
                .build());
    public static void registerModItemGroups(){
        SpringMod.LOGGER.info("Registering Item Groups");
    }
}
