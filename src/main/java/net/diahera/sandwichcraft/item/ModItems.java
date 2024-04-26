package net.diahera.sandwichcraft.item;

import net.diahera.sandwichcraft.SandwichCraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SandwichCraft.MOD_ID);

    public static final RegistryObject<Item> Chicken_Sandwich = ITEMS.register("Chicken_Sandwich",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> FRIED_EGG =ITEMS.register("fried_egg",
            () -> new Item(new Item.Properties().food(ModFoods.FRIED_EGG)));


    public static void register(IEventBus eventBus) {
      ITEMS.register(eventBus);
    }
}
