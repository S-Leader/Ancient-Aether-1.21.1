package net.builderdog.ancient_aether.item.equipment.accessories.miscellaneous;

import com.aetherteam.aether.item.accessories.AccessoryItem;
import io.wispforest.accessories.api.attributes.AccessoryAttributeBuilder;
import io.wispforest.accessories.api.slot.SlotReference;
import net.builderdog.ancient_aether.AncientAether;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;

public class StrengthStoneItem extends AccessoryItem {

    public StrengthStoneItem(Properties properties) {
        super(properties);
    }

    @Override
    public void getDynamicModifiers(ItemStack stack, SlotReference reference, AccessoryAttributeBuilder builder) {
        builder.addStackable(Attributes.ATTACK_DAMAGE, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(AncientAether.MODID, "strength_stone_ability"), 0.12, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    }
}
