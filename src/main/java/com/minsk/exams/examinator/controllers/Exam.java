package com.minsk.exams.examinator.controllers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Exam {
    private String title;
}
