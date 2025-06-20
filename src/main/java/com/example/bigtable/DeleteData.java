package com.example.bigtable;

import com.google.cloud.bigtable.data.v2.models.RowMutation;

public class DeleteData {
    public static void main(String[] args) throws Exception {
        var client = BigtableConnector.connect("your-project-id", "your-instance-id");

        RowMutation delete = RowMutation.create("weather-sensor", "sensor1#20240620").deleteRow();
        client.mutateRow(delete);

        System.out.println("Row deleted!");
        client.close();
    }
}
