package net.vipely.vipelymod;

import net.fabricmc.api.ModInitializer;
<<<<<<< HEAD
import net.vipely.vipelymod.Item.ModItems;

=======
>>>>>>> f6654c29c2c2c89be24a7c9f6a74ff6638fe46b1
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VipelyMod implements ModInitializer {
<<<<<<< HEAD

	public static final String MOD_ID = "vipelymod";
=======
	private static final String MOD_ID = "vipelymod";
>>>>>>> f6654c29c2c2c89be24a7c9f6a74ff6638fe46b1
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
<<<<<<< HEAD
		ModItems.registerModItems();
=======
		
>>>>>>> f6654c29c2c2c89be24a7c9f6a74ff6638fe46b1
	}
}
