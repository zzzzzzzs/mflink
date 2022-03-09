package org.apache.flink.streaming.examples.wordcount;

import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class WordCount1 {

    public void runProgram() throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.generateSequence(1, 10)
                .map(new MapFunction<Long, Long>() {
                    public Long map(Long value) {
                        return value * 2;
                    }
                })
                .print();
        env.execute();
    }

    public static void main(String[] args) throws Exception {
        // 这种构建对象为什么，细节还是没有理解
        new WordCount1().runProgram();
    }
}
