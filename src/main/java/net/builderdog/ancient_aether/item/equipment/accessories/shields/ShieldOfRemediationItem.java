package net.builderdog.ancient_aether.item.equipment.accessories.shields;

import com.aetherteam.aether.effect.AetherEffects;
import io.wispforest.accessories.api.slot.SlotReference;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

public class ShieldOfRemediationItem extends ShieldAccessoryItem {

    public ShieldOfRemediationItem(Properties properties, ResourceLocation shieldName) {
        super(properties, shieldName);
    }

    @Override
    public void tick(ItemStack stack, SlotReference reference) {
        LivingEntity livingEntity = reference.entity();
        if (livingEntity.hasEffect(AetherEffects.INEBRIATION)) {
            livingEntity.removeEffect(AetherEffects.INEBRIATION);
        }
    }
}
