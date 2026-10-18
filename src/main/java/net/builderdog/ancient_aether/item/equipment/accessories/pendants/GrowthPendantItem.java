package net.builderdog.ancient_aether.item.equipment.accessories.pendants;

import com.aetherteam.aether.item.accessories.pendant.PendantItem;
import io.wispforest.accessories.api.attributes.AccessoryAttributeBuilder;
import io.wispforest.accessories.api.slot.SlotReference;
import net.builderdog.ancient_aether.AncientAether;
import net.builderdog.ancient_aether.client.AncientAetherSoundEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;

public class GrowthPendantItem extends PendantItem {

    public GrowthPendantItem(Properties properties) {
        super(ResourceLocation.fromNamespaceAndPath(AncientAether.MODID, "growth_pendant"), AncientAetherSoundEvents.ITEM_ACCESSORY_EQUIP_GROWTH_PENDANT, properties);
    }

    @Override
    public void getDynamicModifiers(ItemStack stack, SlotReference reference, AccessoryAttributeBuilder builder) {
        builder.addStackable(Attributes.MAX_HEALTH, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(AncientAether.MODID, "growth_pendant_ability"), 2.0, AttributeModifier.Operation.ADD_VALUE));
    }
}
