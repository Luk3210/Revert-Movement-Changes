package turbotechmods.movementrevert;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MovementRevert implements ModInitializer {
	public static final String MOD_ID = "movement-revert";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Reverted movement changes successfully!");
	}
}