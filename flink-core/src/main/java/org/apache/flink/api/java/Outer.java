package org.apache.flink.api.java;

import org.apache.flink.api.common.ExecutionConfig;

import java.io.Serializable;

/**
 * @author zs
 * @date 2021/12/21
 */
public class Outer implements Serializable{
    public class Inner implements Serializable {
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner();

        ClosureCleaner.clean(inner, ExecutionConfig.ClosureCleanerLevel.TOP_LEVEL, false);
        System.out.println("Hello");
//        ClosureCleaner.ensureSerializable(inner);
    }
}

