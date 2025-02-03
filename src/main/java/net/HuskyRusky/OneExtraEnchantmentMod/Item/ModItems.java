package net.HuskyRusky.OneExtraEnchantmentMod.Item;

import net.HuskyRusky.OneExtraEnchantmentMod.OneExtraEnchantmentMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OneExtraEnchantmentMod.MOD_ID);

    public static final RegistryObject<Item> MP3PLAYER   = ITEMS.register("mp3player", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
