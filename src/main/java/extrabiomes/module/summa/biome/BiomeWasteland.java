/**
 * This work is licensed under the Creative Commons
 * Attribution-ShareAlike 3.0 Unported License. To view a copy of this
 * license, visit http://creativecommons.org/licenses/by-sa/3.0/.
 */

package extrabiomes.module.summa.biome;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraft.world.biome.Biome.Height;
import net.minecraftforge.common.BiomeDictionary.Type;
import extrabiomes.lib.BiomeSettings;
import extrabiomes.lib.DecorationSettings;

public class BiomeWasteland extends ExtraBiome
{
    
	@Override
	public DecorationSettings getDecorationSettings() {
		return DecorationSettings.WASTELAND;
	}
	private static BiomeProperties getBiomeProperties() {
		final BiomeProperties props = new BiomeProperties("");
		props.setWaterColor();
		props.setBaseHeight();
		props.setHeightVariation();
		props.setTemperature();
		props.setRainfall();
		return props;
	}

    public BiomeWasteland()
    {
		super(BiomeSettings.WASTELAND, Type.WASTELAND);
        
        setColor(0x9E7C41);
        setBiomeName("Wasteland");
        temperature = Biome.desert.temperature;
        rainfall = Biome.desert.rainfall;
        this.setHeight(new Height(0.1F, 0.0F));
        waterColorMultiplier = 0xF08000;
        
        spawnableCreatureList.clear();
        
        setDisableRain();
    }
    
}
