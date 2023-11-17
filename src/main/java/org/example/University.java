package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;



@Builder
public record University(int id, String name , List<Course> courses) {
}
