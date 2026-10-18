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

public class HermesRingItem extends RingItem {

    public HermesRingItem(Properties properties) {
        super(AncientAetherSoundEvents.ITEM_ACCESSORY_EQUIP_HERMES_RING, properties);
    }

    @Override
    public void getDynamicModifiers(ItemStack stack, SlotReference reference, AccessoryAttributeBuilder builder) {
        builder.addStackable(Attributes.MOVEMENT_SPEED, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(AncientAether.MODID, "hermes_ring_ability"), 0.03, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    }
}
