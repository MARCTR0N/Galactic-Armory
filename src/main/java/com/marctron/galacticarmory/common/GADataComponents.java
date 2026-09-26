package com.marctron.galacticarmory.common;

import com.marctron.galacticarmory.GalacticArmory;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class GADataComponents {
    public static final DeferredRegister.DataComponents COMPONENTS = DeferredRegister.createDataComponents(Registries.DATA_COMPONENT_TYPE, GalacticArmory.MODID);




    public static final DeferredHolder<DataComponentType<?>, DataComponentType<LightsaberData>> CLONE_HELMENT =
            COMPONENTS.registerComponentType("clone_helment", builder ->
                    builder.persistent(LightsaberData.CODEC).networkSynchronized(LightsaberData.STREAM_CODEC).cacheEncoding());

    public record LightsaberData(String base, String visor, String fin, String sunvisor, String rangeFinder) {
        public static final Codec<LightsaberData> CODEC = RecordCodecBuilder.create((builder) -> builder.group(
                Codec.STRING.fieldOf("base").forGetter(LightsaberData::base),
                Codec.STRING.fieldOf("visor").forGetter(LightsaberData::visor),
                Codec.STRING.fieldOf("fin").forGetter(LightsaberData::fin),
                Codec.STRING.fieldOf("sunvisor").forGetter(LightsaberData::sunvisor),
                Codec.STRING.fieldOf("rangeFinder").forGetter(LightsaberData::rangeFinder)
        ).apply(builder, LightsaberData::new));

        public static final StreamCodec<FriendlyByteBuf, LightsaberData> STREAM_CODEC = StreamCodec.composite(
                ByteBufCodecs.STRING_UTF8, LightsaberData::base,
                ByteBufCodecs.STRING_UTF8, LightsaberData::visor,
                ByteBufCodecs.STRING_UTF8, LightsaberData::fin,
                ByteBufCodecs.STRING_UTF8, LightsaberData::sunvisor,
                ByteBufCodecs.STRING_UTF8, LightsaberData::rangeFinder,
                LightsaberData::new
        );
    }
}
