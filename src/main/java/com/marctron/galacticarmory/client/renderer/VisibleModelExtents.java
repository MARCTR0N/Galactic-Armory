package com.marctron.galacticarmory.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelPart;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Collects the corner positions of the cubes a model would actually draw.
 *
 * <p>{@link ModelPart#getExtentsForGui} walks the tree via {@code visit}, which ignores both
 * {@code visible} and {@code skipDraw}. Any renderer that hides parts before submitting therefore
 * reports a bounding box larger than its geometry, and {@code ItemEntityRenderer} offsets dropped
 * items by {@code -minY}, leaving them floating above the ground.
 */
public final class VisibleModelExtents {
    private VisibleModelExtents() {
    }

    public static void collect(ModelPart root, PoseStack poseStack, Consumer<Vector3fc> output) {
        if (!root.visible) {
            return;
        }
        Function<String, @Nullable ModelPart> lookup = root.createPartLookup();
        root.visit(poseStack, (pose, partPath, cubeIndex, cube) -> {
            if (!isDrawn(root, lookup, partPath)) {
                return;
            }
            for (ModelPart.Polygon polygon : cube.polygons) {
                for (ModelPart.Vertex vertex : polygon.vertices()) {
                    output.accept(pose.pose().transformPosition(
                            vertex.worldX(), vertex.worldY(), vertex.worldZ(), new Vector3f()));
                }
            }
        });
    }

    private static boolean isDrawn(ModelPart root, Function<String, @Nullable ModelPart> lookup, String partPath) {
        ModelPart owner = root;
        for (String segment : partPath.split("/")) {
            if (segment.isEmpty()) {
                continue;
            }
            ModelPart part = lookup.apply(segment);
            if (part == null) {
                continue;
            }
            if (!part.visible) {
                return false;
            }
            owner = part;
        }
        return !owner.skipDraw;
    }
}
