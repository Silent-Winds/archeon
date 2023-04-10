package fr.firstmegagame4.archeon.init;

import com.mmodding.mmodding_lib.library.blocks.CustomBlock;
import com.mmodding.mmodding_lib.library.initializers.ElementsInitializer;
import fr.firstmegagame4.archeon.Archeon;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.group.api.QuiltItemGroup;

public class ArcheonItemGroups implements ElementsInitializer {

	public static final ItemGroup BLOCKS = QuiltItemGroup.builder(Archeon.newIdentifier("blocks"))
		.appendItems(itemStacks -> Registry.BLOCK.stream().filter(block -> block.toString()
				.split(":")[0]
				.contains("archeon"))
			.forEach(block -> itemStacks.add(new ItemStack(block))))
		.build();
	public static final ItemGroup COMBAT_AND_TOOLS = QuiltItemGroup.create(Archeon.newIdentifier("combat_and_tools"));
	public static final ItemGroup FAUNA = QuiltItemGroup.create(Archeon.newIdentifier("fauna"));
	public static final ItemGroup MISCELLANEOUS = QuiltItemGroup.create(Archeon.newIdentifier("miscellaneous"));

	@Override
	public void register() {}
}
