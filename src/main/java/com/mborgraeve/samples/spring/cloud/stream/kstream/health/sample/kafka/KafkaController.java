package com.mborgraeve.samples.spring.cloud.stream.kstream.health.sample.kafka;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.function.Function;

@Service
public class KafkaController {

    @Bean
    public Function<KStream<String, Map<String, Object>>, KStream<String, Map<String, Object>>> process() {
        return input -> input;
    }

}
