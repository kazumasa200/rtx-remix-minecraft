/*
 * SPDX-FileCopyrightText: Copyright (c) 2026 NVIDIA CORPORATION & AFFILIATES. All rights reserved.
 * SPDX-License-Identifier: Apache-2.0
 */
package com.nvidia.rtxremix.minecraft.gl;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PresentationModeTest {
    @Test
    void presentationSelectionIsExplicitAndRejectsTypos() {
        assertEquals(PresentationMode.CHILD, PresentationMode.parse("child"));
        assertEquals(PresentationMode.PARENT, PresentationMode.parse("parent"));
        assertThrows(IllegalArgumentException.class, () -> PresentationMode.parse("auto"));
    }
}
