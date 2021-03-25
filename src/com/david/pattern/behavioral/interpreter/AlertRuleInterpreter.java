package com.david.pattern.behavioral.interpreter;

import java.security.PrivilegedExceptionAction;
import java.util.HashMap;
import java.util.Map;

/**
 * 可以丰富一下用作生产
 */
public class AlertRuleInterpreter {
    private Expression expression;

    // key1 > 100 && key2 < 1000 || key3 == 200
    public AlertRuleInterpreter(String ruleExpression) {
        this.expression = new OrExpression(ruleExpression);
    }

    // apiStat = new HashMap<>();
    // apiStat.put("key1", 103);
    // apiStat.put("key2", 987);
    public boolean interpret(Map<String, Long> stats) {
        return expression.interpret(stats);
    }
}
