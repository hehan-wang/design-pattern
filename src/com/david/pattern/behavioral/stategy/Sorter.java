package com.david.pattern.behavioral.stategy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Sorter {
    private static final long GB = 1000 * 1000 * 1000;
    private static final List<AlgRange> algs = new ArrayList<>();

    static {
        algs.add(new AlgRange(0, 6 * GB, new QuickSort()));
        algs.add(new AlgRange(6 * GB, 10 * GB, new ExternalSort()));
        algs.add(new AlgRange(10 * GB, 100 * GB, new ConcurrentExternalSort()));
        algs.add(new AlgRange(100 * GB, Long.MAX_VALUE, new MapReduceSort()));
    }

    public void sortFile(String filePath) { // 省略校验逻辑
        File file = new File(filePath);
        long fileSize = file.length();
        ISortAlg sortAlg = null;
        for (AlgRange algRange : algs) {
            if (algRange.inRange(fileSize)) {
                sortAlg = algRange.getAlg();
                break;
            }
        }
        sortAlg.sort(filePath);
    }

    public static void main(String[] args) {
        new Sorter().sortFile("/Users/wangdavid/project/Markdown-Resume/README.md");
    }
}
