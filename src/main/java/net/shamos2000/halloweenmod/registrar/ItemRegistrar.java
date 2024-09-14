package net.shamos2000.halloweenmod.registrar;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shamos2000.halloweenmod.HalloweenMod;
import net.shamos2000.halloweenmod.item.CandyItem;

import static net.shamos2000.halloweenmod.HalloweenMod.EXAMPLE_BLOCK;

public class ItemRegistrar {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HalloweenMod.MODID);

    // Creates a new BlockItem with the id "examplemod:example_block", combining the namespace and path
    public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = ITEMS.register("example_block", () -> new BlockItem(EXAMPLE_BLOCK.get(), new Item.Properties()));

    // Creates a new food item with the id "examplemod:example_id", nutrition 1 and saturation 2
    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEat().nutrition(1).saturationMod(2f).build())));

    public static final RegistryObject<Item> CANDY_MEGA = ITEMS.register("candy_mega", () -> new CandyItem(CandyItem.CandyType.MEGA));
    public static final RegistryObject<Item> CANDY_WATERMELON = ITEMS.register("candy_watermelon", () -> new CandyItem(CandyItem.CandyType.WATERMELON));
    public static final RegistryObject<Item> CANDY_GREENAPPLE = ITEMS.register("candy_greenapple", () -> new CandyItem(CandyItem.CandyType.GREENAPPLE));
    public static final RegistryObject<Item> CANDY_LEMON = ITEMS.register("candy_lemon", () -> new CandyItem(CandyItem.CandyType.LEMON));
    public static final RegistryObject<Item> CANDY_PUMPKIN = ITEMS.register("candy_pumpkin", () -> new CandyItem(CandyItem.CandyType.PUMPKIN));
    public static final RegistryObject<Item> CANDY_GRAPE = ITEMS.register("candy_grape", () -> new CandyItem(CandyItem.CandyType.GRAPE));
}
