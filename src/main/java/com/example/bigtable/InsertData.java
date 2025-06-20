package com.example.bigtable;

import com.google.cloud.bigtable.data.v2.models.RowMutation;

public class InsertData {
    public static void main(String[] args) throws Exception {
        var client = BigtableConnector.connect("your-project-id", "your-instance-id");

        RowMutation mutation = RowMutation.create("weather-sensor", "sensor1#20240620")
            .setCell("data", "temperature", "35.5")
            .setCell("data", "humidity", "58")
            .setCell("data", "wind_speed", "12");

        client.mutateRow(mutation);
        System.out.println("Data inserted!");
        client.close();
    }
}
