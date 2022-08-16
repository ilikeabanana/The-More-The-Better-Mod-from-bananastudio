package net.bananastudio.themorethebetter.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

public class VooDooItem extends Item {
    public Entity target;
    public VooDooItem(Settings settings) {
        super(settings);
    }

    @Override
    public void onItemEntityDestroyed(ItemEntity entity) {
        if(target == null) return;
        target.damage(DamageSource.MAGIC, 500f);
        super.onItemEntityDestroyed(entity);
    }


    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if (hand == Hand.MAIN_HAND) {
            if(target == null) {
                target = entity;
                target.damage(DamageSource.MAGIC, 0.5f);
            }
        }
        return super.useOnEntity(stack, user, entity, hand);
    }
}
