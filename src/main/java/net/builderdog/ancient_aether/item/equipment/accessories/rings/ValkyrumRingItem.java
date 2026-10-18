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

public class ValkyrumRingItem extends RingItem {

    public ValkyrumRingItem(Properties properties) {
        super(AncientAetherSoundEvents.ITEM_ACCESSORY_EQUIP_VALKYRUM_RING, properties);
    }

    @Override
    public void getDynamicModifiers(ItemStack stack, SlotReference reference, AccessoryAttributeBuilder builder) {
        builder.addStackable(Attributes.BLOCK_INTERACTION_RANGE, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(AncientAether.MODID, "valkyrum_ring_block_reach"), 0.5, AttributeModifier.Operation.ADD_VALUE));
        builder.addStackable(Attributes.ENTITY_INTERACTION_RANGE, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(AncientAether.MODID, "valkyrum_ring_entity_reach"), 0.5, AttributeModifier.Operation.ADD_VALUE));
    }
}
