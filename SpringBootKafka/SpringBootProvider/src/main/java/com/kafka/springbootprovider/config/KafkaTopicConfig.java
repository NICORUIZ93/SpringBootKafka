package com.kafka.springbootprovider.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.config.TopicConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic generateTopic() {
        Map<String, String> configurations = new HashMap<>();

        configurations.put(TopicConfig.CLEANUP_POLICY_CONFIG, TopicConfig.CLEANUP_POLICY_DELETE);
        configurations.put(TopicConfig.RETENTION_MS_CONFIG, "86400000"); // TIEMPO DE RETENCION DE LOS MENSAJES -- DEFAULT -1
        configurations.put(TopicConfig.SEGMENT_BYTES_CONFIG, "1073744824"); // TAMAÑO MAXIMA DEL SEGMENTO
        configurations.put(TopicConfig.MAX_MESSAGE_BYTES_CONFIG, "1000012"); //TAMAÑO MAXIMO DE CADA MENSAJE -- DEFAULT 1MGB

        return TopicBuilder.name("PruebaKafka")
                .partitions(2)
                .replicas(2)
                .configs(configurations)
                .build();
    }
}
