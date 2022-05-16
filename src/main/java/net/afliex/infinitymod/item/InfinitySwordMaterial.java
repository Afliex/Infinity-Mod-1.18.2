package net.afliex.infinitymod.item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class InfinitySwordMaterial implements ToolMaterial {

    public static final InfinitySwordMaterial INSTANCE = new InfinitySwordMaterial();

    @Override
    public int getDurability() {
        return 4050;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 9;
    }

    @Override
    public float getAttackDamage() {
        return 4;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 17;
    }

    @Override
    public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(ModItems.INFINITY_ORB);
        }

    }