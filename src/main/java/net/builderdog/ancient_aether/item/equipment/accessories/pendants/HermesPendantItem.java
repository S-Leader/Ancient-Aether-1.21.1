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

public class HermesPendantItem extends PendantItem {

    public HermesPendantItem(Properties properties) {
        super(ResourceLocation.fromNamespaceAndPath(AncientAether.MODID, "hermes_pendant"), AncientAetherSoundEvents.ITEM_ACCESSORY_EQUIP_HERMES_PENDANT, properties);
    }

    @Override
    public void getDynamicModifiers(ItemStack stack, SlotReference reference, AccessoryAttributeBuilder builder) {
        builder.addStackable(Attributes.MOVEMENT_SPEED, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(AncientAether.MODID, "hermes_pendant_ability"), 0.05, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    }
}
