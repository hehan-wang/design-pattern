package com.david.pattern.behavioral.chain;

public class PoliticalWordFilter implements SensitiveWordFilter {
    @Override
    public boolean doFilter(Context context) {
        System.out.println("PoliticalWordFilter:" + context.getWord());
        return true;
    }
}
