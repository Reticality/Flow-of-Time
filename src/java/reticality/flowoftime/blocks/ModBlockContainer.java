package reticality.flowoftime.blocks;

import reticality.flowoftime.tileentity.ModContainer;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class ModBlockContainer extends ModBlockTileEntity {

	protected ModBlockContainer(String unlocalizedName) {
		super(unlocalizedName);
	}
	
	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState blockstate) {
		ModContainer te = (ModContainer) world.getTileEntity(pos);
		InventoryHelper.dropInventoryItems(world, pos, te);
		super.breakBlock(world, pos, blockstate);
	}


	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
		if (stack.hasDisplayName()) {
			((ModContainer) worldIn.getTileEntity(pos)).setCustomName(stack.getDisplayName());
		}
	}
}
