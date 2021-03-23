package com.david.pattern.behavioral.chain;

public class AdsWordFilter implements SensitiveWordFilter {
    @Override
    public boolean doFilter(Context context) {
        System.out.println("AdsWordFilter:" + context.getWord());
        return true;
    }
}
