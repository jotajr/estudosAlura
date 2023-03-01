package com.jotajr;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class NewOrderMain
{
    public static void main( String[] args ) {
        var producer = new KafkaProducer<String, String>(properties());
        var value = "1234,323332,45435432542";
        var record = new ProducerRecord<>("CARRINHO-ABANDONADO", value, value);
        try {
            producer.send(record, (data, ex) -> {
                if (ex != null) {
                    ex.printStackTrace();
                    return;
                }
                System.out.println("Enviado com sucesso!");
                System.out.println(data.topic() + ":::partition " + data.partition() + "/ offset " + data.offset() + "/time " + data.timestamp());
            }).get();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getLocalizedMessage());
        }
    }

    private static Properties properties() {
        var properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        return properties;
    }
}
