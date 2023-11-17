package org.example;

import lombok.Builder;
import lombok.With;

@With
@Builder
public record Teacher(int id, String name, String subject) {
}
