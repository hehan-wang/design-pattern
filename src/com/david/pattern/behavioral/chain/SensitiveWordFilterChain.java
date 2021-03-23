package com.david.pattern.behavioral.chain;

import java.util.ArrayList;
import java.util.List;

public class SensitiveWordFilterChain implements SensitiveWordFilter {
    private final List<SensitiveWordFilter> filterChain = new ArrayList<>();

    public void addFilterChain(SensitiveWordFilter filter) {
        filterChain.add(filter);
    }

    @Override
    public boolean doFilter(Context context) {
        return filterChain.stream().allMatch(f -> f.doFilter(context));
    }

}
