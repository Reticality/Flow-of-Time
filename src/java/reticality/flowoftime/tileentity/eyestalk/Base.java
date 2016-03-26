package reticality.flowoftime.tileentity.eyestalk;

import reticality.flowoftime.tileentity.ModContainer;

import net.minecraft.item.ItemStack;

public class Base extends ModContainer {
	
	@Override
	public int getInventoryStackLimit() {
		return 1;
	}
	
	@Override
	public boolean isItemValidForSlot(int index, ItemStack stack) {
		if (index == 0) {
			return (stack.getUnlocalizedName() == "aging_crystal");
		} else if (index == 1) {
			String unlocalisedName = stack.getUnlocalizedName();
			return (unlocalisedName == "convex_lens" || unlocalisedName == "concave_lens");
		}
		return false;
	}
}
