package com.example.bigtable;

import com.google.cloud.bigtable.data.v2.models.Row;
import com.google.cloud.bigtable.data.v2.models.Query;

public class QueryData {
    public static void main(String[] args) throws Exception {
        var client = BigtableConnector.connect("your-project-id", "your-instance-id");

        Query query = Query.create("weather-sensor").rowKey("sensor1#20240620");

        Row row = client.readRow(query);
        System.out.println("Row: " + row);

        client.close();
    }
}
