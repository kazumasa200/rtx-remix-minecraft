/*
 * SPDX-FileCopyrightText: Copyright (c) 2026 NVIDIA CORPORATION & AFFILIATES. All rights reserved.
 * SPDX-License-Identifier: Apache-2.0
 */
package com.nvidia.rtxremix.minecraft.gl;

/** Selected once at startup; changing the native surface requires a restart. */
public enum PresentationMode {
    CHILD, PARENT;

    public static PresentationMode configured() {
        return parse(System.getProperty("rtxremix.presentation", "child"));
    }

    static PresentationMode parse(String value) {
        return switch (value) {
            case "child" -> CHILD;
            case "parent" -> PARENT;
            default -> throw new IllegalArgumentException("rtxremix.presentation must be child or parent: " + value);
        };
    }
}
