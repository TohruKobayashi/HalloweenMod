package net.shamos2000.halloweenmod.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class CandyItem extends Item {

    public enum CandyType {
        WATERMELON(2, 0),
        GREENAPPLE(2, 0),
        LEMON(2, 0),
        PUMPKIN(2, 0),
        GRAPE(2, 0),
        MEGA(5, 5);

        public final int nutrition;
        public final int health;

        CandyType(int nutrition, int health) {
            this.nutrition = nutrition;
            this.health = health;
        }
    }

    @NotNull
    private CandyType candyType = CandyType.MEGA;

    public CandyItem(Properties p_41383_, @NotNull CandyType candyType) {
        super(p_41383_.food(new FoodProperties.Builder().nutrition(candyType.nutrition).build()));
        this.candyType = candyType;
    }

    public CandyItem(@NotNull CandyType candyType) {
        super(new Item.Properties().food(new FoodProperties.Builder().nutrition(candyType.nutrition).build()));
        this.candyType = candyType;
    }

    @NotNull
    public CandyType getCandyType() {
        return candyType;
    }

    public void setCandyType(@NotNull CandyType candyType) {
        this.candyType = candyType;
    }

    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack stackUsed, @NotNull Level world, @NotNull LivingEntity user) {
        ItemStack stack = super.finishUsingItem(stackUsed, world, user);
        if (!world.isClientSide && candyType.health > 0) {
            user.heal(candyType.health);
        }
        return stack;
    }
}