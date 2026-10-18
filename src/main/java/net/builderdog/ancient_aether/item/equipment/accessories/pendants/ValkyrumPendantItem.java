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

public class ValkyrumPendantItem extends PendantItem {

    public ValkyrumPendantItem(Properties properties) {
        super(ResourceLocation.fromNamespaceAndPath(AncientAether.MODID, "valkyrum_pendant"), AncientAetherSoundEvents.ITEM_ACCESSORY_EQUIP_VALKYRUM_PENDANT, properties);
    }

    @Override
    public void getDynamicModifiers(ItemStack stack, SlotReference reference, AccessoryAttributeBuilder builder) {
        builder.addStackable(Attributes.BLOCK_INTERACTION_RANGE, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(AncientAether.MODID, "valkyrum_pendant_block_reach"), 1.0, AttributeModifier.Operation.ADD_VALUE));
        builder.addStackable(Attributes.ENTITY_INTERACTION_RANGE, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(AncientAether.MODID, "valkyrum_pendant_entity_reach"), 1.0, AttributeModifier.Operation.ADD_VALUE));
    }
}
