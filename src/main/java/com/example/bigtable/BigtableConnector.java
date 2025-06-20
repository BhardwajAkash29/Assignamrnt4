package com.example.bigtable;

import com.google.cloud.bigtable.data.v2.BigtableDataClient;
import com.google.cloud.bigtable.data.v2.BigtableDataSettings;

public class BigtableConnector {
    public static BigtableDataClient connect(String projectId, String instanceId) throws Exception {
        BigtableDataSettings settings =
            BigtableDataSettings.newBuilder().setProjectId(projectId).setInstanceId(instanceId).build();
        return BigtableDataClient.create(settings);
    }
}
