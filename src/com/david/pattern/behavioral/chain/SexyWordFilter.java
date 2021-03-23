package com.david.pattern.behavioral.chain;

public class SexyWordFilter implements SensitiveWordFilter {
    @Override
    public boolean doFilter(Context context) {
        System.out.println("SexyWordFilter:" + context.getWord());
        return true;
    }
}
