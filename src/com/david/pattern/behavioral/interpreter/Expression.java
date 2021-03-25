package com.david.pattern.behavioral.interpreter;

import java.util.Map;

public interface Expression {
    boolean interpret(Map<String, Long> stats);
}
