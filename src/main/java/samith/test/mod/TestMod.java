package samith.test.mod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

public class TestMod implements ModInitializer {

	public static final String MODID = "testmod";

	public static final Item NINER_CREST = new Item(new Item.Settings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier(MODID,"niner_crest"), NINER_CREST);
		Registry.register(Registry.ITEM, new Identifier(MODID,"niner_pick"), new PickaxeBase(new NinerMaterial()));
	}
}
