package xyz.spring.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import xyz.spring.SpringMod;

public class ModItems {

    public static final Item SPRING_ICON = registerItems("spring_icon", new Item(new Item.Settings()));
    public static final Item RAW_SPRING_ICON = registerItems("raw_spring_icon", new Item(new Item.Settings()));
    private static Item registerItems(String id, Item item)
    {
        //return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(SpringMod.MOD_ID,id)), item);
        return Registry.register(Registries.ITEM, Identifier.of(SpringMod.MOD_ID,id), item);

    }

//    private static void addItemToIG(FabricItemGroupEntries fabricItemGroupEntries){
//        fabricItemGroupEntries.add(SPRING_ICON);
//    }

    public static void registerModItems(){
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIG);
        SpringMod.LOGGER.info("Registering items");
    }
}
