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




    public static final DeferredHolder<DataComponentType<?>, DataComponentType<CloneHelmetData>> CLONE_HELMENT =
            COMPONENTS.registerComponentType("clone_helment", builder ->
                    builder.persistent(CloneHelmetData.CODEC).networkSynchronized(CloneHelmetData.STREAM_CODEC).cacheEncoding());

    public record CloneHelmetData(String base, String visor, String fin, String sunvisor, String rangeFinder) {
        public static final Codec<CloneHelmetData> CODEC = RecordCodecBuilder.create((builder) -> builder.group(
                Codec.STRING.fieldOf("base").forGetter(CloneHelmetData::base),
                Codec.STRING.fieldOf("visor").forGetter(CloneHelmetData::visor),
                Codec.STRING.fieldOf("fin").forGetter(CloneHelmetData::fin),
                Codec.STRING.fieldOf("sunvisor").forGetter(CloneHelmetData::sunvisor),
                Codec.STRING.fieldOf("rangeFinder").forGetter(CloneHelmetData::rangeFinder)
        ).apply(builder, CloneHelmetData::new));

        public static final StreamCodec<FriendlyByteBuf, CloneHelmetData> STREAM_CODEC = StreamCodec.composite(
                ByteBufCodecs.STRING_UTF8, CloneHelmetData::base,
                ByteBufCodecs.STRING_UTF8, CloneHelmetData::visor,
                ByteBufCodecs.STRING_UTF8, CloneHelmetData::fin,
                ByteBufCodecs.STRING_UTF8, CloneHelmetData::sunvisor,
                ByteBufCodecs.STRING_UTF8, CloneHelmetData::rangeFinder,
                CloneHelmetData::new
        );
    }
}
