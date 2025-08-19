package xyz.spring.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import xyz.spring.SpringMod;

public class ModItems {

    public static final Item Spring_Icon = registerItems("spring_icon", new Item(new Item.Settings()));
    private static Item registerItems(String id, Item item)
    {
        //return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(SpringMod.MOD_ID,id)), item);
        return Registry.register(Registries.ITEM, Identifier.of(SpringMod.MOD_ID,id), item);

    }
    public static void registerModItems(){
        SpringMod.LOGGER.info("Registering items");
    }
}
