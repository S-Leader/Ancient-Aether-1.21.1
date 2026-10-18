package net.builderdog.ancient_aether.item.equipment.accessories.rings;

import com.aetherteam.aether.item.accessories.ring.RingItem;
import io.wispforest.accessories.api.attributes.AccessoryAttributeBuilder;
import io.wispforest.accessories.api.slot.SlotReference;
import net.builderdog.ancient_aether.AncientAether;
import net.builderdog.ancient_aether.client.AncientAetherSoundEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;

public class GrowthRingItem extends RingItem {

    public GrowthRingItem(Properties properties) {
        super(AncientAetherSoundEvents.ITEM_ACCESSORY_EQUIP_GROWTH_RING, properties);
    }

    @Override
    public void getDynamicModifiers(ItemStack stack, SlotReference reference, AccessoryAttributeBuilder builder) {
        builder.addStackable(Attributes.MAX_HEALTH, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(AncientAether.MODID, "growth_ring_ability"), 1.0, AttributeModifier.Operation.ADD_VALUE));
    }
}
