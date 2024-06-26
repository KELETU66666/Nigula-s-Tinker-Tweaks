package keletu.tinkertweaks.level;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import slimeknights.tconstruct.library.modifiers.ModifierNBT;

public class ToolLevelNBT extends ModifierNBT {

    private static final String TAG_XP = "xp";
    private static final String TAG_XP_CHEAT = "cxp";
    private static final String TAG_BONUS_MODIFIERS = "bonus_modifiers";

    public int xp; // current level xp
    public int cheat_xp; // current level cxp
    public int bonusModifiers; // saved extra so tools don't change unexpectedly on config change

    public ToolLevelNBT(NBTTagCompound tag) {
        super(tag);
    }

    @Override
    public void read(NBTTagCompound tag) {
        super.read(tag);
        xp = tag.getInteger(TAG_XP);
        cheat_xp = tag.getInteger(TAG_XP_CHEAT);
        bonusModifiers = tag.getInteger(TAG_BONUS_MODIFIERS);
    }

    @Override
    public void write(NBTTagCompound tag) {
        super.write(tag);
        tag.setInteger(TAG_XP, xp);
        tag.setInteger(TAG_XP_CHEAT, cheat_xp);
        tag.setInteger(TAG_BONUS_MODIFIERS, bonusModifiers);
    }

    public static void get(ItemStack tool) {

    }

    public void save(ItemStack tool) {

    }
}