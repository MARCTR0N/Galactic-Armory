package com.marctron.galacticarmory.common.armor;

import com.marctron.galacticarmory.common.model.helmet.parts.base.phase_1_clone_base;
import com.marctron.galacticarmory.common.model.helmet.parts.base.phase_2_clone_base;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * Registry for worn helmet models, keyed by item registry path.
 *
 * <p>Models are baked lazily from the active {@link EntityModelSet} and cached per layer. The model
 * set is replaced on every resource reload, so the cache is dropped whenever it changes — reusing a
 * model baked from a stale set renders garbage.
 */
public final class HelmetModelRegistry {
    /** Used when an item path has no explicit entry. */
    private static final String DEFAULT_KEY = "clone_helmet_phase_1";

    private static final Map<String, Entry> HELMET_MODELS = new HashMap<>();
    private static final Map<ModelLayerLocation, HumanoidModel<?>> CACHE = new HashMap<>();
    private static EntityModelSet cachedModelSet;

    static {
        register(DEFAULT_KEY, phase_1_clone_base.LAYER_LOCATION, phase_1_clone_base::new);
        register("phase1_base", phase_1_clone_base.LAYER_LOCATION, phase_1_clone_base::new);
        register("clone_helmet_phase_2", phase_2_clone_base.LAYER_LOCATION, phase_2_clone_base::new);
        register("clone_helmet_arf", clone_helmet_arf.LAYER_LOCATION, clone_helmet_arf::new);
    }

    private HelmetModelRegistry() {
    }

    /** Registers the model used when the helmet with the given registry path is worn. */
    public static void register(String itemPath, ModelLayerLocation layer, Function<ModelPart, HumanoidModel<?>> factory) {
        HELMET_MODELS.put(itemPath, new Entry(layer, factory));
    }

    /**
     * Returns the worn model for the given helmet item path, falling back to the phase 1 base when
     * the path is unknown.
     */
    public static HumanoidModel<?> getHelmetModel(String itemPath) {
        Entry entry = HELMET_MODELS.get(itemPath);
        if (entry == null) {
            entry = HELMET_MODELS.get(DEFAULT_KEY);
        }
        return bake(entry);
    }

    public static boolean isRegistered(String itemPath) {
        return HELMET_MODELS.containsKey(itemPath);
    }

    private static HumanoidModel<?> bake(Entry entry) {
        EntityModelSet models = Minecraft.getInstance().getEntityModels();
        if (cachedModelSet != models) {
            CACHE.clear();
            cachedModelSet = models;
        }
        return CACHE.computeIfAbsent(entry.layer(), layer -> entry.factory().apply(models.bakeLayer(layer)));
    }

    private record Entry(ModelLayerLocation layer, Function<ModelPart, HumanoidModel<?>> factory) {
    }
}
